package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement checkBox = driver.findElement(By.className("willDisappear"));
		
		WebElement toggleButton =  driver.findElement(By.id("toggleCheckbox"));
		
		toggleButton.click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
		
		System.out.println("Checkbox is displayed : " + checkBox.isDisplayed());
		
		toggleButton.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
		
		System.out.println("Checkbox is displayed : " + checkBox.isDisplayed());
		
		driver.close();
	}

}
