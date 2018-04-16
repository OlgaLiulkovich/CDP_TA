package pages.MyLibrary.NewWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.MyLibrary.NewWork.AbstractNewWorkPage;

/**
 * New Work page for Report Type of Use.
 */
public class NewWorkReportTOUPage extends AbstractNewWorkPage implements INewWork{

    public NewWorkReportTOUPage(WebDriver driver) {
        super(driver);
    }

    public NewWorkReportTOUPage fillInNewWork(
            AbstractNewWorkPage page,
            NewWorkData data
    ) {
        NewWorkReportTOUPage page1 = (NewWorkReportTOUPage) page;
        page1.fillInTitle(data.getTitle());
        page1.fillInAuthor(data.getAuthor());
        page1.fillInPublisher(data.getPublisher());
        page1.fillInWorkSize(data.getWorkSize());
        page1.selectYear(data.getYear());
        return this;
    }

}
