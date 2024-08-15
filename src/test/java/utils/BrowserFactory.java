package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserFactory {
   private static WebDriver driver;

    public static WebDriver startApp(String browser, String url){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("mozilla")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        }
        else {
            driver = new EdgeDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        return  driver;
    }

    @Test
    public void testMe(){
        BrowserFactory.startApp("firefoxxx","https://www.saucedemo.com/");
    }

}
