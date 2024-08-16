package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class InventoryPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
    WebElement productTitle_xpath;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")
    WebElement sauceLabsBackpack_xpath;

    @FindBy(xpath = "//a[contains(@class,'shopping_cart_link')]")
    WebElement shoppingCartLink_xpath;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyProductPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productTitle_xpath));
        Assert.assertEquals(productTitle_xpath.getText(), "Products");
    }

    public void addItemToCart() {
        sauceLabsBackpack_xpath.click();
    }

    public void viewShoppingCart() {
        shoppingCartLink_xpath.click();
    }
}
