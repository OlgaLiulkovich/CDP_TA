package pages.ADP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AbstractPage;
import utils.CustomWebDriver;

/**
 * Abstract Additional DAta Page class
 */
public class AbstractAdditionalDataPage extends AbstractPage {

    public AbstractAdditionalDataPage(CustomWebDriver driver) {
        super(driver);
    }

    private static final By PAGE_TITLE_LOCATOR = By.name("adh_pgTitle");
    private static final By ORDER_REFERENCE_LOCATOR = By.name("PONumber");
    private static final By CONTINUE_LOCATOR = By.linkText("CONTINUE");
    private static final By CIRCULATION_LOCATOR = By.name("circulation");
    private static final By PORTIONS_LOCATOR = By.name("detailsOfUse");


    public String getTitle(){
        return driver.findElement(PAGE_TITLE_LOCATOR).getText();
    }

    public AbstractAdditionalDataPage fillInOrderRef(String value){
        driver.findElement(ORDER_REFERENCE_LOCATOR).sendKeys(value);
        return this;
    }

    public AbstractAdditionalDataPage clickContinue(){
        driver.findElement(CONTINUE_LOCATOR).click();
        return this;
    }

    public AbstractAdditionalDataPage fillInCirculation(String value){
        driver.findElement(CIRCULATION_LOCATOR).sendKeys(value);
        return this;
    }

    public AbstractAdditionalDataPage fillInPortions(String value){
        driver.findElement(PORTIONS_LOCATOR).sendKeys(value);
        return this;
    }




}
