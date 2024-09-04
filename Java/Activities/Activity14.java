package Activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
        File file = new File("Java Activities/fst-m1-java/src/main/java/Activities/Activity14.txt");
        boolean fStatus = file.createNewFile();
        if (fStatus) {
            System.out.println("File created successfully");
        }
        else {
            System.out.println("File already exists");
        }

        File fileUtil = FileUtils.getFile("filepath");
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

        File destDir = new File("resources");
        FileUtils.copyFileToDirectory(file, destDir);

        File newFile = FileUtils.getFile(destDir, "newfile.txt");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        } catch(IOException E) {
            System.out.println("print stack trace");
        }

}
    }
