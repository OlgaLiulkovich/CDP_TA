package pages.DetailsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ADP.AbstractAdditionalDataPage;
import pages.AbstractPage;
import utils.CustomWebDriver;

/**
 * Abstract class for Details pages
 */
public abstract class AbstractDetailsPage extends AbstractPage {

    public AbstractDetailsPage(CustomWebDriver driver) {
        super(driver);
    }

    //private static final By PAGE_TITLE_LOCATOR = By.name("co_pgTitleRO");

    private static final By PAGE_TITLE_LOCATOR = By.cssSelector(".PageTitle");

    private static final By LICENSED_CONTENT_PUBLISHER_LOCATOR = By.name("orderContentPublisher");
    private static final By LICENSED_CONTENT_PUBLICATION_LOCATOR = By.name("orderContentPublication");
    private static final By LICENSED_CONTENT_TITLE_LOCATOR = By.name("orderContentTitle");
    private static final By LICENSED_CONTENT_PUBLISHER_AUTHOR = By.name("orderContentAuthor");


    //private static final By LICENSED_CONTENT_PUBLISHER_LOCATOR = By.name("orderContentPublisher");

    public String getTitle(){
        return driver.findElement(PAGE_TITLE_LOCATOR).getText();
    }

    public String getContentPublisher(){
        return driver.findElement(LICENSED_CONTENT_PUBLISHER_LOCATOR).getText();
    }

    public String getContentPublication(){
        return driver.findElement(LICENSED_CONTENT_PUBLICATION_LOCATOR).getText();
    }

    public String getContentTitle(){
        return driver.findElement(LICENSED_CONTENT_TITLE_LOCATOR).getText();
    }

    public String getContentPublisherAuthor(){
        return driver.findElement(LICENSED_CONTENT_PUBLISHER_AUTHOR).getText();
    }

    public void highlightHeader(CustomWebDriver driver) {

        //this.highlightElement(driver, driver.findElement(PAGE_TITLE_LOCATOR));

    }


}
