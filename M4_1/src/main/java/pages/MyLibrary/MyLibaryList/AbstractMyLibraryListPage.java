package pages.MyLibrary.MyLibaryList;

import org.openqa.selenium.WebDriver;
import pages.AbstractPage;

/**
 * MyLibrary list page class
 */
public class AbstractMyLibraryListPage extends AbstractPage {

    public AbstractMyLibraryListPage(WebDriver driver) {
        super(driver);
    }

    public AbstractMyLibraryListPage clickNew(){

        return new AbstractMyLibraryListPage(driver);
    }




}
