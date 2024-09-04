package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net");
		
		System.out.println("Title of the page : " + driver.getTitle());
		
		driver.findElement(By.id("about-link")).click();
		
		System.out.println("Title of the new page : " + driver.getTitle());
		
		driver.quit();
	}

}
