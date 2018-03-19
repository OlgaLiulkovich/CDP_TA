package pages.MyLibrary.NewWork;

import com.sun.webkit.WebPage;
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

        String text = driver.findElement(PAGE_TITLE_LOCATOR).getText();

        System.out.println(text);

        return driver.findElement(PAGE_TITLE_LOCATOR).getText();
    }

}
