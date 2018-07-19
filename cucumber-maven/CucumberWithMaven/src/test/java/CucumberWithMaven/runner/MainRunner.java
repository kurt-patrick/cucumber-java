package CucumberWithMaven.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
	monochrome = true,
	features = { "src/test/java/CucumberWithMaven/features" },
	glue = { "CucumberWithMaven.stepFiles" },
	plugin = { 
			"pretty", "html:target/cucumber", "json:target/cucumber.json", 
			"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }
)

public class MainRunner {

}
