package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Quick Price Page object
 *
 * @author Olga_Liulkovich
 */
public class QuickPricePage extends AbstractPage {

    private static final By TYPE_OF_USE_LOCATOR = By.name("offerIDValue");
    private static final By REQUESTER_TYPE_LOCATOR = By.name("requesterType");
    private static final By FORMAT_LOCATOR = By.name("format");
    private static final By PORTION_LOCATOR = By.name("portionUsed");
    private static final By TRANSLATING_LOCATOR = By.name("translating");
    private static final By QUICK_PRICE_LOCATOR = By.name("quickprice");
    private static final By ESTIMATED_PRICE_LOCATOR = By.name("priceDouble");
    private static final By CONTINUE_LOCATOR = By.name("continue");


    public QuickPricePage(WebDriver driver) {
        super(driver);
    }

    public QuickPricePage open(String env) {
        //env = "s"; // non prod env
        driver.get("http://" + env + "100.copyright.com/AppDispatchServlet?publisherName=refB&publication=RefB1&author=Snoopy&orderBeanReset=true&title=refB+Title&volumeNum=34&issueNum=15&debug=1&contentID=10.3945/ajcn.115.122937&numPages=10&proxyOrder=false&publicationDate=July+6%2C+2008");
        return this;
    }

    public QuickPricePage selectTypeOfUse(String value) {
        Select ddl = new Select(driver.findElement(TYPE_OF_USE_LOCATOR));
        ddl.selectByVisibleText(value);
        return new QuickPricePage(driver);
    }

    public QuickPricePage selectRequesterType(String value){
        Select ddl = new Select(driver.findElement(REQUESTER_TYPE_LOCATOR));
        ddl.selectByVisibleText(value);
        return new QuickPricePage(driver);
    }

    public QuickPricePage selectFormat(String value){
        Select ddl = new Select(driver.findElement(FORMAT_LOCATOR));
        ddl.selectByVisibleText(value);
        return new QuickPricePage(driver);
    }
    public QuickPricePage selectPortion(String value){
        Select ddl = new Select(driver.findElement(PORTION_LOCATOR));
        ddl.selectByVisibleText(value);
        return new QuickPricePage(driver);
    }
    public QuickPricePage selectTranslating(String value){
        Select ddl = new Select(driver.findElement(TRANSLATING_LOCATOR));
        ddl.selectByVisibleText(value);
        return new QuickPricePage(driver);
    }
    public QuickPricePage clickQuickPrice(){
        driver.findElement(QUICK_PRICE_LOCATOR).click();
        return new QuickPricePage(driver);
    }

    public String getPrice(){
        String estPrice = driver.findElement(ESTIMATED_PRICE_LOCATOR).getText();
        return estPrice;
    }

    public QuickPricePage clickContinue(){
        driver.findElement(CONTINUE_LOCATOR).click();
        return new QuickPricePage(driver);
    }





}
