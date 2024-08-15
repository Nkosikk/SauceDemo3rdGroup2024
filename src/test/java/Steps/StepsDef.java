package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BrowserFactory;

public class StepsDef {
    WebDriver driver = null;
    BrowserFactory browserFactory = new BrowserFactory();
    LoginPage loginPage = null;

    @Given("login page is displayed")
    public void login_page_is_displayed() {
        driver = browserFactory.startApp("chrome","https://www.saucedemo.com/");
    }

    @And("I enter username (.*)$")
    public void i_enter_username_username(String username) {
        loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
    }

    @And("I enter password (.*)$")
    public void i_enter_password_password(String password) throws InterruptedException {
        //TODO Chipuriro to use the LoginPage class to enter password
        //TODO Chipuriro to nominate the next person to use the LoginPAge class to click the submit button

        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Homepage is displayed")
    public void homepage_is_displayed() {
        driver.findElement(By.xpath("//span[@class='title'][contains(.,'Products')]")).isDisplayed();

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
