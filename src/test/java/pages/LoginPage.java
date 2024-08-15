package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    @FindBy(id = "user-name")
    WebElement username_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        username_id.sendKeys(username);
    }

    //ToDo create method to enter password - Thabiso

    //ToDo create method to click Login - Consy

    //ToDo create method to verify user is logged in - Consy please choose the guy to do this



}
