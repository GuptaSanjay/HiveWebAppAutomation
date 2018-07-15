package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	 
	@Given("^user is  on Hive Login page$")
public void user_is_on_Hive_Login_page() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "D:\\selenium server jar\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://oauth.beta.bgchprod.info/login");
}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
	   driver.findElement(By.id("username")).sendKeys("betatest1");
	   driver.findElement(By.id("password")).sendKeys("Hive1234");
	   driver.findElement(By.name("submit")).click();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		String exp_message = "Welcome to your account. Here you can manage all   of your personal information and orders.";
    	System.out.println(exp_message);
        //driver.quit();
	}


}
