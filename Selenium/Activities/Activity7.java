package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		
		driver.get(" https://v1.training-support.net/selenium/drag-drop");
		
		System.out.println(driver.getTitle());
		
		WebElement football = driver.findElement(By.id("draggable"));
		
		WebElement dropzone1 = driver.findElement(By.id("droppable"));
		
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		
		builder.clickAndHold(football).moveToElement(dropzone1).pause(1000).release().build().perform();
		
		String dropzone1Verify = dropzone1.findElement(By.tagName("p")).getText();
		
		if(dropzone1Verify.equals("Dropped!")){
			System.out.println("Ball has entered Dropzone1");	
		}
		
		builder.dragAndDrop(football, dropzone2).build().perform();
		
		String dropzone2Verify = dropzone1.findElement(By.tagName("p")).getText();
		
		if(dropzone2Verify.equals("Dropped!")){
			System.out.println("Ball has entered Dropzone2");	
		}
		
		driver.close();

	}

}
