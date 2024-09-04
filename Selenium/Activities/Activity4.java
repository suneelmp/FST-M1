package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/target-practice");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
		System.out.println("Third page title is : " + driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
		
		System.out.println("Fifth page title is : " + driver.findElement
				(By.xpath("//h5[@class='ui green header']")).getCssValue("color"));
		
		System.out.println("Violet button and classes is : " + driver.findElement
				(By.xpath("//button[text()='Violet']")).getAttribute("class"));
		
		System.out.println("Violet button and classes is : " + driver.findElement
				(By.xpath("//button[text()='Grey']")).getText());
	}

}
