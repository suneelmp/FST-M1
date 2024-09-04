package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement textField = driver.findElement(By.id("input-text"));
		
		System.out.println("Text field is selected : " + textField.isEnabled());
		
		driver.findElement(By.id("toggleInput")).click();
		
		System.out.println("Text field is selected : " + textField.isEnabled());
		
		driver.close();

	}

}
