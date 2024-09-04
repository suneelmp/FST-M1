package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity1 {
	WebDriver driver ;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://v1.training-support.net");
	  }
  @Test
  public void exampletestcase() {
	  
	  String title = driver.getTitle();
	  System.out.println("Title of the page is : " + title);
	  Assert.assertEquals("Training Support", title);
	  
	  driver.findElement(By.id("about-link")).click();
	  System.out.println("New page title is : " + driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "About Training Support");
	  
  }
  

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
