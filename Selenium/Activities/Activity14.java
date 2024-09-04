package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
driver.get("https://v1.training-support.net/selenium/tables");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		
		System.out.println("Number of columns : " + columns.size());
		
List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortedTable']/tbody/tr"));
		
		System.out.println("Number of columns : " + rows.size());
		
		WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortedTable']/tbody/tr[2]/td[2]"));
		
		System.out.println("Second row & second column value : " + cellValue.getText());
		
		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
		
 cellValue = driver.findElement(By.xpath("//table[@id='sortedTable']/tbody/tr[2]/tr[1]"));
		
		System.out.println("Second row & second column value : " + cellValue.getText());
		
		
		List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        System.out.println("Cell values of the footer: ");
        for(WebElement cell : footer) {
            System.out.println(cell.getText());
        }
        
        driver.close();
		
		
	}

}
