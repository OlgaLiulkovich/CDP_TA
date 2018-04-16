package pages.MyLibrary.NewWork;

import com.sun.webkit.WebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.AbstractPage;
import utils.CustomWebDriver;

/**
 * Abstract class for New Work pages
 */
public abstract class AbstractNewWorkPage extends AbstractPage implements INewWork  {

    private static final By PAGE_TITLE_LOCATOR = By.name("new_work_pgTitle11");
    private static final By TITLE_LOCATOR = By.name("addNewTitle");
    private static final By AUTHOR_LOCATOR = By.name("newCreator");
    private static final By PUBLISHER_LOCATOR = By.name("addNewPub");
    private static final By YEAR_LOCATOR = By.name("addNewPubYear");
    private static final By WORK_SIZE_LOCATOR = By.name("newWorkSize");
    private static final By CONTINUE_LOCATOR = By.linkText("CONTINUE");

    public AbstractNewWorkPage(CustomWebDriver driver) {
        super(driver);
    }

    public String getTitle(){

        String text = driver.findElement(PAGE_TITLE_LOCATOR).getText();

        System.out.println(text);

        return driver.findElement(PAGE_TITLE_LOCATOR).getText();
    }

    public abstract AbstractNewWorkPage fillInNewWork(AbstractNewWorkPage page, NewWorkData data);

    public AbstractNewWorkPage fillInTitle(String value) {
        driver.findElement(TITLE_LOCATOR).sendKeys(value);
        return this;
    }

    public AbstractNewWorkPage fillInAuthor(String value) {
        driver.findElement(AUTHOR_LOCATOR).sendKeys(value);
        return this;
    }

    public AbstractNewWorkPage fillInPublisher(String value) {
        driver.findElement(PUBLISHER_LOCATOR).sendKeys(value);
        return this;
    }

    public AbstractNewWorkPage selectYear(String value) {
        Select yearDdl = new Select(driver.findElement(YEAR_LOCATOR));
        yearDdl.selectByVisibleText(value);
        return this;
    }

    public AbstractNewWorkPage fillInWorkSize(String value) {
        driver.findElement(WORK_SIZE_LOCATOR).sendKeys(value);
        return this;
    }

    public AbstractNewWorkPage clickContinue() {
        driver.findElement(CONTINUE_LOCATOR).click();
        return this;
    }

}
