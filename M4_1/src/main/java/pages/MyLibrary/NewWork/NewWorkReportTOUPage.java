package pages.MyLibrary.NewWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.MyLibrary.NewWork.AbstractNewWorkPage;

/**
 * New Work page for Report Type of Use.
 */
public class NewWorkReportTOUPage extends AbstractNewWorkPage {

    public NewWorkReportTOUPage(WebDriver driver) {
        super(driver);
    }

    private static final By TITLE_LOCATOR = By.name("addNewTitle");
    private static final By AUTHOR_LOCATOR = By.name("newCreator");
    private static final By PUBLISHER_LOCATOR = By.name("addNewPub");
    private static final By YEAR_LOCATOR = By.name("addNewPubYear");
    private static final By WORK_SIZE_LOCATOR = By.name("newWorkSize");
    private static final By CONTINUE_LOCATOR = By.linkText("CONTINUE");

    public NewWorkReportTOUPage fillInTitle(String value) {
        driver.findElement(TITLE_LOCATOR).sendKeys(value);
        return this;
    }

    public NewWorkReportTOUPage fillInAuthor(String value) {
        driver.findElement(AUTHOR_LOCATOR).sendKeys(value);
        return this;
    }

    public NewWorkReportTOUPage fillInPublisher(String value) {
        driver.findElement(PUBLISHER_LOCATOR).sendKeys(value);
        return this;
    }

    public NewWorkReportTOUPage selectYear(String value) {
        Select yearDdl = new Select(driver.findElement(YEAR_LOCATOR));
        yearDdl.selectByVisibleText(value);
        return this;
    }

    public NewWorkReportTOUPage fillInWorkSize(String value) {
        driver.findElement(WORK_SIZE_LOCATOR).sendKeys(value);
        return this;
    }

    public NewWorkReportTOUPage clickContinue() {
        driver.findElement(CONTINUE_LOCATOR).click();
        return this;
    }

    public NewWorkReportTOUPage fillInNewWork(
            NewWorkReportTOUPage page,
            String title,
            String author,
            String publisher,
            String workSize,
            String year
    ) {
        page.fillInTitle(title);
        page.fillInAuthor(author);
        page.fillInPublisher(publisher);
        page.fillInWorkSize(workSize);
        page.selectYear(year);
        return this;
    }


}
