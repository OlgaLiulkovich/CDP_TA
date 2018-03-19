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
    //private static final By TITLE_LOCATOR = By.xpath("//*[@name='submit']"); - Doesn't work!!!


    public LoginPage fillinUserName (String name){
        driver.findElement(USERNAME_LOCATOR).sendKeys(name);
        return new LoginPage(driver);
    }
    public LoginPage fillinPassword (String name){
        driver.findElement(PASSWORD_LOCATOR).sendKeys(name);
        return new LoginPage(driver);
    }
    public LoginPage clickSignIn (){
        driver.findElement(SIGNIN_LOCATOR).click();
        return new LoginPage(driver);
    }

    public LoginPage signIn(LoginPage page, String userName, String password){
        page.fillinUserName(userName);
        page.fillinPassword(password);
        page.clickSignIn();
        return new LoginPage(driver);
    }

    public String getTitle(){
        return "";
    }





}
