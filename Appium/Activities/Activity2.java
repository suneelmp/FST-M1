package activities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity2 {
	
	AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("org.chromium.chrome.browser.firstrun.FirstRunActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        driver.get("https://v1.trainig-support.net");
    }
    
    @Test
    public void chromeTest() {
        // Find heading on the page
        String pageHeading = driver.findElement(AppiumBy.xpath(
                "//android.view.View[@text='Training Support']"
        )).getText();
 
        // Print to console
        System.out.println("Heading: " + pageHeading);
 
        // Find and click the About Us link
        driver.findElement(AppiumBy.xpath("android.view.View[@resource-id='about-link']"
        )).click();
 
        // Find heading of new page and print to console
        String aboutPageHeading = driver.findElement(AppiumBy.xpath(
                "//android.view.View[@text='About Us']"
        )).getText();
        System.out.println(aboutPageHeading);
    }
    
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
