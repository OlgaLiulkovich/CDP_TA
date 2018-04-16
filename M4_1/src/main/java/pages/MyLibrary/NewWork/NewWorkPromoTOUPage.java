package pages.MyLibrary.NewWork;

import org.openqa.selenium.WebDriver;

/**
 * New Work page for Promo Type of Use.
 */
public class NewWorkPromoTOUPage extends AbstractNewWorkPage implements INewWork{

    public NewWorkPromoTOUPage(WebDriver driver) {
        super(driver);
    }

    public NewWorkPromoTOUPage fillInNewWork(
            AbstractNewWorkPage page,
            NewWorkData data
    ) {
        NewWorkPromoTOUPage page1 = (NewWorkPromoTOUPage) page;
        page1.fillInTitle(data.getTitle());
        page1.fillInPublisher(data.getPublisher());
        page1.selectYear(data.getYear());
        return this;
    }

}
