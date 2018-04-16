package pages.MyLibrary.MyLibaryList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AbstractPage;
import utils.CustomWebDriver;

/**
 * MyLibrary list page class
 */
public abstract class AbstractMyLibraryListPage extends AbstractPage {

    public AbstractMyLibraryListPage(CustomWebDriver driver) {
        super(driver);
    }

    private static final By TITLE_LOCATOR = By.name("nwl_pgTitle");
    private static final By CONTINUE_LOCATOR =By.cssSelector("a[href*='javascript:continueOrder()']");
    private static final By FIRST_WORK_LOCATOR= By.className("DefaultRadioButton");


    public String getTitle(){
        return driver.findElement(TITLE_LOCATOR).getText();
    }

    public AbstractMyLibraryListPage clickContinue(){
        driver.findElement(CONTINUE_LOCATOR).click();
        return this;
    }

    public AbstractMyLibraryListPage selectFirstWork(){
        driver.findElement(FIRST_WORK_LOCATOR).click();
        return this;

    }



}
