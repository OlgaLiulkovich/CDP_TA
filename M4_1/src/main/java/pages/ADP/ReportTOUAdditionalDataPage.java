package pages.ADP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * ADP class for Report TOU
 */
public class ReportTOUAdditionalDataPage extends AbstractAdditionalDataPage {

    public ReportTOUAdditionalDataPage(WebDriver driver) {
        super(driver);
    }

    private static final By CIRCULATION_LOCATOR = By.name("circulation");
    private static final By PORTIONS_LOCATOR = By.name("detailsOfUse");


    public ReportTOUAdditionalDataPage fillInCirculation(String value){
        driver.findElement(CIRCULATION_LOCATOR).sendKeys(value);
        return new ReportTOUAdditionalDataPage(driver);
    }

    public ReportTOUAdditionalDataPage fillInPortions(String value){
        driver.findElement(PORTIONS_LOCATOR).sendKeys(value);
        return new ReportTOUAdditionalDataPage(driver);
    }






}
