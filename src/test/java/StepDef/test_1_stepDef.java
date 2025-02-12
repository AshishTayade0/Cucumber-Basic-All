package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_1_stepDef {
    // Background
    @Given("User open browser")
    public void user_open_browser() {
        System.out.println("==========================");
        System.out.println("Background Given");
    }
    @When("User Hit URL")
    public void user_hit_url() {
        System.out.println("Background When");
    }
    @Then("User land on HomePage of Application")
    public void user_land_on_homepage_of_application() {
        System.out.println("Background Then");
    }

    //Scenario Methods
    @Given("When user is on Home Page")
    public void when_user_is_on_home_page() {
        System.out.println("user is on Home Page");
    }
    @When("^User enters user name as (.*)and$")
    public void user_enters_user_name_as_and(String username) {
        System.out.println("enters user name as " + username);
    }
    @When("^User enters password as (.*)$")
    public void user_enters_password_as(String string) {
        System.out.println("enters password as " +string);
    }
    @Then("User successfully logged into application")
    public void user_successfully_logged_into_application() {
        System.out.println("successfully logged into application");
    }
    @Then("User should not logged into application")
    public void user_should_not_logged_into_application(){
        System.out.println("User should not logged into application");
    }

}
