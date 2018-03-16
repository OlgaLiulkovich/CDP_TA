package pages.MyLibrary.NewWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AbstractPage;

/**
 * Abstract class for New Work pages
 */
public abstract class AbstractNewWorkPage extends AbstractPage {

    public AbstractNewWorkPage(WebDriver driver) {
        super(driver);
    }

    private static final By PAGE_TITLE_LOCATOR = By.name("new_work_pgTitle11");

    public String getTitle(){
        return driver.findElement(PAGE_TITLE_LOCATOR).getText();
    }


}
