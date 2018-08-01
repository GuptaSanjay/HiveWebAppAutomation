package DriverInitializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InitializeDriver {
    WebDriver driver;
    public WebDriver initializeDriver()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/centricachuser/Downloads/chromedriver");
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://beta-my.hivehome.com/login");
        return driver;
    }
}
