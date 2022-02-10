package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps  {
    @Given("^the user is on login page$")
    public void the_user_is_on_login_page() throws Throwable {
        System.out.println("User is on login page");
    }

    @When("^the user enters valid credentials$")
    public void the_user_enters_valid_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User has entered valid credentials");
    }

    @When("^hits submit$")
    public void hits_submit() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User has hit submit");
    }

    @Then("^the user should be logged in successfully$")
    public void the_user_should_be_logged_in_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User has been logged in successfully");
    }
}
