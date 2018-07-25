package CucumberForJavaBook.Chapter02.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
	monochrome = true,
	features = { "src/test/java/CucumberForJavaBook/Chapter02/features" },
	glue = { "CucumberForJavaBook.Chapter02.step_definitions" },
	plugin = { 
			"pretty", "html:target/cucumber", "json:target/cucumber.json", 
			"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }
)

public class TestRunner {

}
