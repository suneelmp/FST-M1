package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstExample extends BaseClass{
	
	@BeforeAll
	public static void setUp() {
		WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
	}
	
	@AfterAll
	public static void tearDown() {
		driver.close();
	}
	
	@Given("User logs into the page")
	public void homepage() {
		driver.get("https://v1.training-support.net");
		Assertions.assertEquals("Training Support", driver.getTitle());
	}
	
	@When("User clicks on About Us link")
	public void aboutlink() {
		driver.findElement(By.id("about-link")).click();
		
	}
	
	@Then("User is redirected to the About Us page")
	public void aboutpage() {
		Assertions.assertEquals("About Training Support", driver.getTitle());
	}

}