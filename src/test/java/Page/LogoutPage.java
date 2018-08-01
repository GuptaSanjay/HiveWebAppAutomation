package Page;

import DriverInitializer.InitializeDriver;
import Test.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogoutPage {
WebDriver driver;
//LoginTest loginTest=new LoginTest();
@FindBy(xpath = "//img[@alt='Hive Logo']")
WebElement hiveLogo;
@FindBy(xpath="//div[@class='sc-imAxmJ kUvKvy']//span[contains(text(),'Settings')]")
WebElement settings;
@FindBy(xpath = "//li[@class='sc-bsVVwV bMcrSl']//span[contains(text(),'Logout')]")
WebElement logout;
    @FindBy(xpath = "//span[contains(text(),'Enter your login details')]")
    WebElement loginPageTitle;
    @FindBy(id="username")
    WebElement userName;
    @FindBy(id="password")
    WebElement password;
    @FindBy(xpath="//button[@data-qa='login-input-submit']")
    WebElement submit;
    public LogoutPage()
    {
        InitializeDriver initializeDriver=new InitializeDriver();
        this.driver=initializeDriver.initializeDriver();
        PageFactory.initElements(driver, this);
    }
    public void checkAlreadyLoggedIn() {
        System.out.println("inside page");
        if(loginPageTitle.getText().equals("Enter your login details"))
        {
            System.out.println("inside method");
           userName.sendKeys("rudp1");
           password.sendKeys("Hive1234");
           submit.click();
        }
        else
        {

            Assert.assertTrue(hiveLogo.isDisplayed());
        }
    }

    public void clickLogoutButton() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        settings.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
logout.click();
    }

    public void loggedoutSuccessfully() {
        Assert.assertTrue(loginPageTitle.getText().equals("Enter your login details"));
        System.out.println("Successfully logged out");
    }
}
