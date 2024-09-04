package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
driver.get("https://v1.training-support.net/selenium/tables");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[contains(@class,'striped')]"
				+ "/tbody/tr[1]/td"));
		
		System.out.println("Number of columns : " + columns.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]"
				+ "/tbody/tr"));
		
		System.out.println("Number of rows : " + rows.size());
		
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class,'striped')]"
				+ "/tbody/tr[3]/td"));
		
		System.out.println("Third row values : ");
		for(WebElement cell : thirdRow) {
			System.out.println(cell.getText());
		}
		
		WebElement rowCol = driver.findElement(By.xpath("//table[contains(@class,'striped')]"
				+ "/tbody/tr[2]/td[2]"));
		
		System.out.println("Second row & second column values : " + rowCol.getText());
		
		

	}

}
