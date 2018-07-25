package CucumberForJavaBook.Chapter02.step_definitions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import CucumberForJavaBook.Chapter02.Checkout;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
	
	Checkout mCheckout = new Checkout();
	Map<String, Integer> mItemPriceMap = new HashMap<String, Integer>();
	
	@Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
	public void the_price_of_a_is_c(String name, int price) throws Throwable {
		mItemPriceMap.put(name,  price);
	}

	@When("^I checkout (\\d+) \"([^\"]*)\"$")	
	public void i_checkout(int itemCount, String itemName) throws Throwable {
		int itemPrice = mItemPriceMap.get(itemName);
		mCheckout.add(itemCount, itemPrice);
	}

	@Then("^the total price should be (\\d+)c$")
	public void the_total_price_should_be_c(int total) throws Throwable {
		Assert.assertEquals(total, mCheckout.total());
		//System.out.println("the total price should be " + total);
	}
	
}
