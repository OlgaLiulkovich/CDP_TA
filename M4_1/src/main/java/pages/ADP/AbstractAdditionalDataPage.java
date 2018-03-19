package pages.ADP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AbstractPage;

/**
 * Abstract Additional DAta Page class
 */
public class AbstractAdditionalDataPage extends AbstractPage {

    public AbstractAdditionalDataPage(WebDriver driver) {
        super(driver);
    }

    private static final By PAGE_TITLE_LOCATOR = By.name("adh_pgTitle");
    private static final By ORDER_REFERENCE_LOCATOR = By.name("PONumber");
    private static final By CONTINUE_LOCATOR = By.linkText("CONTINUE");

    public String getTitle(){
        return driver.findElement(PAGE_TITLE_LOCATOR).getText();
    }

    public AbstractAdditionalDataPage fillInOrderRef(String value){
        driver.findElement(ORDER_REFERENCE_LOCATOR).sendKeys(value);
        return new AbstractAdditionalDataPage(driver);
    }

    public AbstractAdditionalDataPage clickContinue(){
        driver.findElement(CONTINUE_LOCATOR).click();
        return new AbstractAdditionalDataPage(driver);
    }





}
