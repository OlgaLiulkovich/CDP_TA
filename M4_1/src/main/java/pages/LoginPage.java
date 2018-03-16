package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Login page class
 */
public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final By USERNAME_LOCATOR = By.xpath("//input[@name='username']");
    private static final By PASSWORD_LOCATOR = By.xpath("//input[@name='password']");
    private static final By SIGNIN_LOCATOR = By.xpath("//*[@name='submit']");

    public LoginPage fillinUserName (String name){
        driver.findElement(USERNAME_LOCATOR).sendKeys(name);
        return new LoginPage(driver);
    }
    public LoginPage fillinPassword (String name){
        driver.findElement(PASSWORD_LOCATOR).sendKeys(name);
        return new LoginPage(driver);
    }
    public LoginPage signIn (){
        driver.findElement(SIGNIN_LOCATOR).click();
        return new LoginPage(driver);
    }





}
