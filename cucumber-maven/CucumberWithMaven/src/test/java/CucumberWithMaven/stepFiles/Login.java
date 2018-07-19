package CucumberWithMaven.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver _driver;
	WebDriverWait _wait;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Installers\\Selenium\\WebDrivers\\chromedriver.exe");
		_driver = new ChromeDriver();
		_wait = new WebDriverWait(_driver, 60);
		_driver.manage().window().maximize();
		_driver.manage().timeouts().pageLoadTimeout(60,  TimeUnit.SECONDS);
		_driver.manage().timeouts().setScriptTimeout(60,  TimeUnit.SECONDS);
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
		_driver.navigate().to("https://stackoverflow.com/");
	}

	@And("^user clicks on the login button on homepage$")
	public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
		clickElement(By.linkText("Log In"));
	}
	
	@And("^user enters an invalid username and password combination$")
	public void user_enters_an_invalid_username_and_password_combination() throws Throwable {
		setText(By.id("email"), "test@test.com");
		setText(By.id("password"), "test");
	}

	@When("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		WebElement cookies = clickElement(By.cssSelector("button.s-btn:nth-child(1)"));
		_wait.until(ExpectedConditions.invisibilityOf(cookies));
		clickElement(By.id("submit-button"));
	}

	@Then("^user should be informed their information is incorrect$")
	public void user_should_be_informed_their_information_is_incorrect() throws Throwable {
		waitForDisplayed(By.className("message-text"));
	}

	WebElement clickElement(By locator) {
		WebElement element = waitForClickable(locator);
		element.click();
		return element;
	}
	
	void setText(By locator, String value) {
		waitForClickable(locator).sendKeys(value);
	}

	WebElement waitForClickable(By locator) {
		return _wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	WebElement waitForDisplayed(By locator) {
		return _wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
}
