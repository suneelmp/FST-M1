package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Actions builder = new Actions(driver);
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title is : " + driver.getTitle());
		
		WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));
		
		toggleButton.click();
		
		WebElement dynamicBox = driver.findElement(By.id("dynamicCheckbox"));
		
		wait.until(ExpectedConditions.invisibilityOf(dynamicBox));
		
		System.out.println("Dynamic box is displayed");
		
		toggleButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(dynamicBox));
		
		System.out.println("Dynamic box is displayed");

	}

}
