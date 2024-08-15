package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class InventoryPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
    WebElement productTitle_xpath;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyProductPage() {
        Assert.assertEquals(productTitle_xpath.getText(), "Products");
    }
}
