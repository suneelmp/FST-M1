package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		
WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for(WebElement webElement : list){
		    System.out.println(webElement.getText());
		}
		

	}

}
