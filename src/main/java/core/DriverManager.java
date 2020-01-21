package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;

    private DriverManager(){}

    public static WebDriver getDriver(){
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

            /* Work with cookie
            * driver.manage().deleteAllCookies();
            * driver.manage().addCookie(new Cookie("name", "value"));
            */
        }
        return driver;
    }

    public static void killDriver(){
        driver.close();
        if(driver != null){
            driver = null;
        }
    }

}
