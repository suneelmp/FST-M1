package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity5 {
	
	AndroidDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
    public void setUp() throws MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.apps.messaging");
		options.setAppActivity(".ui.ConversationListActivity");

		// Server Address
		URL serverURL = new URL("http://localhost:4723/");
		// Driver Initialization
		driver = new AndroidDriver(serverURL, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void smsApp() {
		
		driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
		 
        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.id("recipient_text_view")
        ));
 
        // Find the element to add recipient
        driver.findElement(AppiumBy.id("recipient_text_view")).sendKeys("9014842678");
        // Press ENTER
        driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
 
        // Wait for textbox to appear
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("compose_message_text")));
 
        // Enter text to send
        driver.findElement(AppiumBy.id("compose_message_text")).sendKeys("Hello from Appium");
        // Press Send
        driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
 
        // Assertion
        String messageTextSent = driver.findElement(AppiumBy.id("message_text")).getText();
        Assert.assertEquals(messageTextSent, "Hello from Appium");
    }
		
	}
	

