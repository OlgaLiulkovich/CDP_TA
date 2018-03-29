package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ADP.ReportTOUAdditionalDataPage;
import pages.DetailsPages.ReviewOrderPage;
import pages.LogOutPage;
import pages.LoginPage;
import pages.MyLibrary.MyLibaryList.ReportTOUMyLibraryListPage;
import pages.QuickPricePage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Test for Reuse in a Book TOU - JOb Ticket case, Work will be selected from the list
 *
 * @author Olga_Liulkovich
 */
public class ReuseInABookMRSelectWork {

    private WebDriver driver;

    @BeforeClass(description = "Start browser")
    private void initBrowser() throws MalformedURLException {
        Utils beforeClass = new Utils();
        driver = beforeClass.initBrowser();
    }

    @Test(dataProvider = "Reuse in a Book Job Ticket", description = "Smoke Test for refB TOU = reuse in a book - Job Ticket")
    public void ReuseInAReportStraightLicenseTest(
            String typeOfUse,
            String requesterType,
            String format,
            String portion,
            String numPortion,
            String translating,
            String price,

            String userName,
            String password,

            String orderRef,
            String portions,
            String circulation
    ) {

        // open landing page
        QuickPricePage refBPage = new QuickPricePage(driver).open();
        // fill in QPP
        refBPage.fillInQPP(typeOfUse, requesterType, format, portion, numPortion, translating);
        //calculate price and assert it
        refBPage.clickQuickPrice();
        Assert.assertEquals(refBPage.getPrice(), price, "Incorrect price estimated");
        // continue order flow
        refBPage.clickContinue();
        //login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signIn(loginPage, userName, password);
        //select first work from the list
        ReportTOUMyLibraryListPage myLibrary = new ReportTOUMyLibraryListPage(driver);
        Assert.assertTrue(myLibrary.isCurrent("About Your Works"), "Didn't get to MyLibrary List");
        myLibrary.selectFirstWork();
        myLibrary.clickContinue();
        //check that ADP is open
        ReportTOUAdditionalDataPage adp = new ReportTOUAdditionalDataPage(driver);
        Assert.assertTrue(adp.isCurrent("Additional Information"), "Didn't get to ADP");
        // fill in ADP
        adp.fillInOrderRef(orderRef);
        adp.fillInCirculation(circulation);
        adp.fillInPortions(portions);
        adp.clickContinue();
        //check that Order Review page got open
        ReviewOrderPage reviewOrder = new ReviewOrderPage(driver);
        // assert data on Review Order page
        reviewOrder.highlightHeader(driver);
        Assert.assertEquals(reviewOrder.getContentPublisher(), "refB Publishing Group Ltd.", "Wrong Content Publisher value on details page");
        Assert.assertEquals(reviewOrder.getContentPublication(), "RefB1", "Wrong Content Publication value on details page");

        // logout
        LogOutPage logOut = new LogOutPage(driver);
        logOut.clickLogout();
        Assert.assertTrue(logOut.isCurrent("Logout"), "Didn't get to Logout page");

    }

    @AfterClass(description = "Close browser")
    public void closeBrowser() {
        Utils afterClass = new Utils();
        afterClass.closeBrowser(driver);
    }


    @DataProvider(name = "Reuse in a Book Job Ticket")
    public static Object[][] validTestData() {
        return new Object[][]{
                {"reuse in a book/textbook", "Government", "Print and electronic", "Figure/table/extract", "11", "No", "Not Available",//QPP data
                        "oliulkovich@copyright.com", "123456", //login data
                        "OL test", "OL Test Portion", "100" //ADP data
                }

        };

    }
}

