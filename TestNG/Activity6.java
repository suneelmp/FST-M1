package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity6 {
	
	WebDriver driver;
	
  @Test
  @Parameters({"username","password"})

  public void loginCheck(String username, String password) {
	  
	  WebElement username1 = driver.findElement(By.id("username"));
	  WebElement password1 = driver.findElement(By.id("password"));
	  
	  WebElement loginButton = driver.findElement(By.xpath("//button[type='submit'"));
	  
	  username1.sendKeys("admin");
	  password1.sendKeys("password");
	  
	  loginButton.click();
  }
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  
	  driver.get(" https://v1.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
