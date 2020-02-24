package i1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Drivers;

public class login {
	WebDriver driver;

@Given("User should be in login page")
public void user_should_be_in_login_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver=UtilityClass.openBrowser("chrome");
	driver.get("https://10.232.237.143/TestMeApp/");
	
    
    	
			
	
}

@When("User  enters valid credentials and performs login")
public void user_enters_valid_credentials_and_performs_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("clicks the search tab and enters the first four letters of the product")
public void clicks_the_search_tab_and_enters_the_first_four_letters_of_the_product() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("selects product from drop down")
public void selects_product_from_drop_down() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("click on find details")
public void click_on_find_details() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("adds the product to cart")
public void adds_the_product_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("User should be in add to cart page")
public void user_should_be_in_add_to_cart_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
}



