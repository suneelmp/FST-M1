package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	
	WebDriver driver;
	
  @Test
  public void testcase1() {
	  String title = driver.getTitle();
	  System.out.println("Title is : " + title);
	  Assert.assertEquals(title, "Target Practice");
  }
  
  @Test
  public void testcase2() {
	  WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
	  Assert.assertEquals(blackButton.getText(), "black");
  }
  
 @Test(enabled = false)
 public void testcase3() {
	 String subHeading = driver.findElement(By.className("sub")).getText();
     Assert.assertTrue(subHeading.contains("Practice"));
 }
 
 @Test
 
 public void testcase4() {
	 throw new SkipException("Skipping test case");
 }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.get(" https://v1.training-support.net/selenium/target-practice");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
