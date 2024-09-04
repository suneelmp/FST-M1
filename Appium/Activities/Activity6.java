package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity6 {
	
	AndroidDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
        options.setAppActivity("org.chromium.chrome.browser.firstrun.FirstRunActivity");
		options.noReset();
		
		URL serverURL = new URL("http://localhost:4723/");
		driver= new AndroidDriver(serverURL,options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 driver.get("https://v1.training-support.net/selenium/lazy-loading");
	}
	
	@Test
	public void chromeTest() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
 
        // Wait for page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.Image")));
 
        // Find all the image elements on the page
        List<WebElement> imageElements = driver.findElements(AppiumBy.className("android.widget.Image"));
 
        // Print the number of images
        System.out.println("Before scroll: " + imageElements.size());
 
        // Scroll using UiScrollable
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollTextIntoView(\"helen\")"));
 
        // Get image elements after scroll
        imageElements = driver.findElements(AppiumBy.className("android.widget.Image"));
 
        // Print the number of images after scroll
        System.out.println("After scroll: " + imageElements.size());
 
        // Assertions
        Assert.assertEquals(imageElements.size(), 5);
    }
 

}
