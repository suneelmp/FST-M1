package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Activity4.feature",
		glue = {"stepDefinitions"},
		//tags = "@FirstScenario",
		publish = true,
		plugin = {
				"pretty",
				"html:src/reports/HTML_Report.html",
				"json:src/reports/JSON_Report.json",
				"junit:src/reports/XML_Report.xml",
		}
	)

public class TestRunner {
}