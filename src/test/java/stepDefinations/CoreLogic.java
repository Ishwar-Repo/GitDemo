package stepDefinations;

import java.security.spec.EdECPublicKeySpec;
import java.util.List;
import org.testng.Assert;
import io.cucumber.java.en.*;

public class CoreLogic {

	@Given("setup the entries in database")
	public void setup_the_entries_in_database() {
		System.out.println("*****************************");
		System.out.println("setup the entries in database");
		
		System.out.println("Git hub testing line from eclipse1  ");
		System.out.println("Git hub testing line from eclipse1  ");
	}

	@When("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
		System.out.println("launch the browser from config variables");
		
		System.out.println("Git hub testing line from eclipse2  ");
		System.out.println("Git hub testing line from eclipse2  ");
	}

	@When("hit home page url of banking site")
	public void hit_home_page_url_of_banking_site() {
		System.out.println("hit home page url of banking site");
	}

	@Given("User is on netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
		System.out.println("User is on netbanking landing page");
	}

	@When("User Login into application")
	public void user_login_into_application() {
		System.out.println("User Login into application");
	}

//	@When("User Login into application with username as {string} and password as {string}")
//	public void user_login_into_application_with_username_as_and_password_as(String Username, String Password) {
//		System.out.println("Username is = "+Username+" and password is = "+Password);
//	}

	@Given("User is on practice landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User is on practice landing page");
		Assert.assertTrue(false);
	}

	@When("User signup into application with")
	public void user_signup_into_application_with(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

	@When("^User Login into application with username as (.+) and password as (.+)$") // ("^---(.+)----(.+)----$") --
																						// Regex Pattern - When don't
																						// know the exact data type we
																						// can use this pattern
	public void user_login_into_application_with_username_as_and_password_as(String Username, String Password) {
		System.out.println("Username is = " + Username + " and password is = " + Password);
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		System.out.println("Home Page is displayed");
	}

	@Then("Cards are displyed")
	public void cards_are_displyed() {
		System.out.println("Cards are displyed");
		
		System.out.println("this changes doing from dev branch");
//		System.out.println("*****************************");
	}
}
