package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Activity6 extends baseClass {
  @Test
  public void directoryMenu() {
	  driver.get("http://alchemy.hguy.co/orangehrm");
	  driver.findElement(By.id("txtUsername")).sendKeys("orange");
	  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	  driver.findElement(By.id("btnLogin")).click();
	  Reporter.log("Clicked on login button", true);
	  
	  String text = driver.findElement(By.xpath("//div[@id='panel_draggable_1_0']/fieldset/legend")).getText();
	  Assert.assertEquals("Employee Distribution by Subunit", text);
	  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Assign Leave")));
	  Reporter.log("User is navigated to Dashboard", true);
	  
	 WebElement directory = driver.findElement(By.xpath("//a[@id=\"menu_directory_viewDirectory\"]"));
	 wait.until(ExpectedConditions.visibilityOf(directory));
	 wait.until(ExpectedConditions.elementToBeClickable(directory)).click();
	 directory.click();
	 
	 String heading = driver.findElement(By.xpath("//div[@class=\"head\"]")).getText();
	 assertEquals(heading, "Search Directory");
	  
  }
}
