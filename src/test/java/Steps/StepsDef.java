package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;
import utils.BrowserFactory;

import java.net.PasswordAuthentication;

public class StepsDef {
    WebDriver driver = null;
    BrowserFactory browserFactory = new BrowserFactory();
    LoginPage loginPage = null;
    InventoryPage inventoryPage;
    CartPage cartPage;

    @Given("login page is displayed")
    public void login_page_is_displayed() {
        driver = browserFactory.startApp("edge", "https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
    }

    @And("I enter username (.*)$")
    public void i_enter_username_username(String username) {

        loginPage.enterUsername(username);
    }

    @And("I enter password (.*)$")
    public void i_enter_password_password(String password) throws InterruptedException {
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLogin();

    }


    @Then("Homepage is displayed")
    public void homepage_is_displayed() {
        inventoryPage.verifyProductPage();
    }


    @And("I add item to cart")
    public void userAddItemToCart() {
        inventoryPage.addItemToCart();
    }

    @And("I clicks the Shopping cart")
    public void userClicksTheShoppingCart() {
        inventoryPage.viewShoppingCart();
    }

    @Then("I click the checkout Btn")
    public void iClickTheCheckoutBtn() {
        cartPage.clickCheckout();
    }


//    @After
//    public void closeBrowser() {
//        driver.quit();
//    }
}
