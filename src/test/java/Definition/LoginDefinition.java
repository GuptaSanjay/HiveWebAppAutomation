package Definition;

import Test.LoginTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefinition {
    LoginTest loginTest=new LoginTest();

    @Given("^user is  on Hive Login page$")
    public void user_is_on_Hive_Login_page() {
        // Write code here that turns the phrase above into concrete actions
        loginTest.checkLoginPage();
        System.out.print("Hive App");

    }

    @When("^user enters username and Password$")
    public void user_enters_username_and_Password()
    {
loginTest.LoginToHive();
    }
    @Then("^success message is displayed$")
    public void success_message_is_displayed()
    {
loginTest.userLoggedIn();
    }
}
