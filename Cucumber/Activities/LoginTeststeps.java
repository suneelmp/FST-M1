package stepDefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestSteps extends BaseClass{


	@Given("User logs into the home page")
	public void login() {

//		wait = new WebDriverWait(driver, 10);
		driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");
	}

	@When("User enters {string} and {string}")
	public void credentials(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("^User enters username and password$")
    public void enterCredentials() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

	@And("Clicks the Submit button")
	public void submitButton() {
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
	}

	@Then("Get the confirmation text and verify message")
	public void message() {
				//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));

		// Read the page title and heading
		String pageTitle = driver.getTitle();
		String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();

		// Print the page title and heading
		System.out.println("Page title is: " + pageTitle);
		System.out.println("Login message is: " + confirmMessage);

		driver.close();
	}

}