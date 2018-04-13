package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Class for clicking LogOut button
 */
public class LogOutPage extends AbstractPage {

    private static final By LOGOUT_LOCATOR =By.cssSelector("a[href*='javascript:doCasLogout()']");
    private static final By TITLE_LOCATOR = By.name("lo_pgTitle");

    public LogOutPage clickLogout(){
        driver.findElement(LOGOUT_LOCATOR).click();
        return this;
    }

    public LogOutPage(WebDriver driver){super(driver);}

    public String getTitle(){
        return driver.findElement(TITLE_LOCATOR).getText();
    }

}
