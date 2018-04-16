package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CustomWebDriver;

/**
 * Login page class
 */
public class LoginPage extends AbstractPage {

    public LoginPage(CustomWebDriver driver) {
        super(driver);
    }

    private static final By USERNAME_LOCATOR = By.xpath("//input[@name='username']");
    private static final By PASSWORD_LOCATOR = By.xpath("//input[@name='password']");
    private static final By SIGNIN_LOCATOR = By.xpath("//*[@name='submit']");
    //private static final By TITLE_LOCATOR = By.xpath("//*[@name='submit']"); - Doesn't work!!!


    public LoginPage fillinUserName(String name) {
        WebElement field = driver.findElement(USERNAME_LOCATOR);
        //new Actions(driver).sendKeys(field, name).build().perform();
        driver.findElement(USERNAME_LOCATOR).sendKeys(name);
        return this;
    }

    public LoginPage fillinPassword(String name) {
        driver.findElement(PASSWORD_LOCATOR).sendKeys(name);
        return this;
    }

    public LoginPage clickSignIn() {
        driver.findElement(SIGNIN_LOCATOR).click();
        return this;
    }

    public LoginPage signIn(LoginPage page, String userName, String password) {
        page.fillinUserName(userName);
        page.fillinPassword(password);
        page.clickSignIn();
        return this;
    }

    public String getTitle() {
        return "";
    }


}
