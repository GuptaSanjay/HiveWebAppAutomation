package Page;

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
    public LoginPage(WebDriver driver)
    {

        this.driver=driver;
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
        setUserName(userName);
        setPassword(password);
        clickLogin();
    }

}
