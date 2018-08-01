package Page;

import DriverInitializer.InitializeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
   @FindBy(xpath = "//span[contains(text(),'Enter your login details')]")
   WebElement loginPageTitle;
    @FindBy(id="username")
    WebElement userName;
    @FindBy(id="password")
    WebElement password;
    @FindBy(xpath="//button[@data-qa='login-input-submit']")
    WebElement submit;
    public LoginPage()
    {
        InitializeDriver initializeDriver=new InitializeDriver();
        this.driver=initializeDriver.initializeDriver();
        PageFactory.initElements(driver, this);
    }
    public String getLoginTitle()
    {
        return loginPageTitle.getText();
    }
    public void setUserName(String userName)
    {
        this.userName.sendKeys(userName);
    }
    public void setPassword(String password)
    {
        this.password.sendKeys(password);
    }
    public void clickLogin(){

        this.submit.click();

    }
    public void loginToHive(String userName, String password)
    {
        System.out.println("insideLOginTohive2");
        setUserName(userName);
        setPassword(password);
        clickLogin();
        //soni
    }

}
