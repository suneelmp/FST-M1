package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Activity9 {
	
	WebDriver driver ;
	
  @Test(priority = 0)
  public void simpleAlertTestCase() {
	  Reporter.log("Simple testcase started");
	  driver.findElement(By.id("simple")).click();
	  Reporter.log("Simple alert opened");
	  
	  Alert simpleAlert = driver.switchTo().alert();
	  Reporter.log("Switched focus to alert");
	  
	  String alertTest = simpleAlert.getText();
	  Reporter.log("Alert text is : " + alertTest);
	  
	  Assert.assertEquals("This is a JavaScript Alert!", alertTest);
	  simpleAlert.accept();
      Reporter.log("Alert closed");

      Reporter.log("Test case ended |");
	  
	  
  }
  @Test(priority = 1)
  public void confirmAlertTestCase() {
	  Reporter.log("confirmAlertTestCase() started |");
      //Click the button to open a simple alert
      driver.findElement(By.id("confirm")).click();
      Reporter.log("Confirm Alert opened |");

      //Switch to alert window
      Alert confirmAlert = driver.switchTo().alert();
      Reporter.log("Switched foucs to alert |");

      //Get text in the alert box and print it
      String alertText = confirmAlert.getText();
      Reporter.log("Alert text is: " + alertText + " |");
      
      //Assertion
      Assert.assertEquals("This is a JavaScript Confirmation!", alertText);

      confirmAlert.accept();
      Reporter.log("Alert closed |");

      Reporter.log("Test case ended |");
	  
  }
  @Test(priority = 2)
  public void promptAlertTestCase() {
	  Alert promptAlert = driver.switchTo().alert();
      Reporter.log("Switched foucs to alert |");

      //Get text in the alert box and print it
      String alertText = promptAlert.getText();
      Reporter.log("Alert text is: " + alertText + " |");

      promptAlert.sendKeys("Awesome!");
      Reporter.log("Text entered in prompt alert |");
      
      //Assertion
      Assert.assertEquals("This is a JavaScript Prompt!", alertText);

      promptAlert.accept();
      Reporter.log("Alert closed |");

      Reporter.log("Test case ended |");
  }
  
  
	  @BeforeClass
	  public void beforeClass() { 
	  WebDriverManager.firefoxdriver().setup();
	  driver=new FirefoxDriver();
	  
	  Reporter.log("Starting test");
	  driver.get("https://v1.training-support.net/selenium/javascript-alerts");
	  Reporter.log("Opened browser");
	  Reporter.log("Page title is : " +driver.getTitle() );
  }

 

  @AfterClass
  public void afterTest() {
	  Reporter.log("Ending Test |");
	  driver.close();
  }

}
