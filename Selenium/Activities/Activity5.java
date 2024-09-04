package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		
		driver.get("https://v1.training-support.net/selenium/input-events");
		
		System.out.println("Title of the page : " + driver.getTitle());
		
		builder.click().pause(1000).build().perform();
		
		System.out.println("Front side text : " + driver.findElement(By.className("active")).getText());
		
		builder.doubleClick().pause(1000).build().perform();
		
		System.out.println("Number is : " + driver.findElement(By.className("active")).getText());
		
		builder.contextClick().pause(1000).build().perform();
		
		System.out.println("Front value shown : " + driver.findElement(By.className("active")).getText());
		
		driver.close();
		

	}

}
