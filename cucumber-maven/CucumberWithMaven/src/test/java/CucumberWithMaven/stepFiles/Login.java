package CucumberWithMaven.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver _driver;
	
	@Before
	public void setup() {
		/*
		System.setProperty("webdriver.chrome.driver", "D:\\Installers\\Selenium\\WebDrivers\\chromedriver.exe");
		_driver = new ChromeDriver();
		_driver.manage().window().maximize();
		_driver.manage().timeouts().pageLoadTimeout(60,  TimeUnit.SECONDS);
		_driver.manage().timeouts().setScriptTimeout(60,  TimeUnit.SECONDS);
		*/
	}
	
	@After
	public void teardown() {
		if(_driver != null) {
			_driver.manage().deleteAllCookies();
			_driver.quit();
			_driver = null;
		}
	}
	
	@Given("^user navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("user_navigates_to_stackoverflow_website");
	}

	@And("^user clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_clicks_on_the_login_button_on_homepage");
	}

	@And("^user enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_enters_a_valid_username");
	}

	@And("^user enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_enters_a_valid_password");
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_clicks_on_the_login_button");
		int a = 0 / 0;
	}

	@Then("^user should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user_should_be_taken_to_the_successful_login_page");
	}


}
