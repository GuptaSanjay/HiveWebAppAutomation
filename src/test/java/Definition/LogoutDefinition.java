package Definition;


import Test.LogoutTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LogoutDefinition {
    LogoutTest logoutTest=new LogoutTest();

    @Given("^user is already logged In$")
    public void userIsAlreadyLoggedIn()  {
        System.out.println("inside definition");
logoutTest.checkAlreadyLoggedIn();
    }

    @When("^user clicks on the logout button$")
    public void userClicksOnTheLogoutButton()  {
logoutTest.clickLogoutButton();
    }

    @Then("^The user is successfully logged out$")
    public void theUserIsSuccessfullyLoggedOut()  {
logoutTest.loggedoutSuccessfully();
    }
}
