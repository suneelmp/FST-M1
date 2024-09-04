package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));

		
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
		
		username.sendKeys("admin");
		
		password.sendKeys("password");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement message = driver.findElement(By.id("action-confirmation"));
		
		System.out.println("Login message : " + message.getText());
		}

}
