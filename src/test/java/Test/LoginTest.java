package Test;

import java.util.concurrent.TimeUnit;

import Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class LoginTest {
	
	 WebDriver driver;
	 LoginPage loginPage;

	 
 public LoginTest(){

    System.setProperty("webdriver.chrome.driver", "D:\\selenium server jar/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://beta-my.hivehome.com/login");
}


	public void LoginToHive(){
loginPage= new LoginPage(driver);
	  loginPage.loginToHive("rudb1","Hive1234");
	}


	public void userLoggedIn()
	{
		System.out.print("Success");
	}
	public void checkLoginPage()
	{
		loginPage= new LoginPage(driver);
		String title=loginPage.getLoginTitle();
		Assert.assertTrue(title.equals("Enter your login details"));

	}


}
