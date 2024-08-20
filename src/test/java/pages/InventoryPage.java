package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InventoryPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='title'][contains(.,'Products')]")
    WebElement productTitle_xpath;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyProductPage() {
        Assert.assertEquals(productTitle_xpath.getText(), "Products1");
    }

//    By productTitle_xpath2 = By.xpath("//span[@class='title'][contains(.,'Products')]");
//    public void verifyProductPage2() {
//        Assert.assertEquals(driver.findElement(productTitle_xpath2).getText(),"Products");
//    }
}
