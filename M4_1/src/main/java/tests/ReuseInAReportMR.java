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
import pages.MyLibrary.NewWork.NewWorkReportTOUPage;
import pages.QuickPricePage;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


/**
 * Test for Reuse in a Report TOU - JOb Ticket case, New Work is created
 *
 * @author Olga_Liulkovich
 */
public class ReuseInAReportMR {

    private WebDriver driver;

    @BeforeClass(description = "Start browser")
    private void initBrowser() throws MalformedURLException {
        Utils beforeClass = new Utils();
        driver = beforeClass.initBrowser();
    }

    @Test(dataProvider = "Reuse in a Report Job Ticket", description = "Smoke Test for refB TOU = reuse in a report - Job Ticket")
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

            String title,
            String author,
            String publisher,
            String workSize,
            String year,

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
        //create New Work
        NewWorkReportTOUPage newWork = new NewWorkReportTOUPage(driver);
        Assert.assertTrue(newWork.isCurrent("About Your Work"), "Didn't get to New Works page");
        newWork.fillInNewWork(newWork, title, author, publisher, workSize, year);
        newWork.clickContinue();
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



    @DataProvider(name = "Reuse in a Report Job Ticket")
    public static Object[][] validTestData() {
        return new Object[][]{
                {"reuse in a report", "Government", "Print and electronic", "Figure/table/extract", "11", "No", "Not Available",//QPP data
                        "oliulkovich@copyright.com", "123456", //login data }
                        "test title", "OL test", "OL test", "50", "2020", //new work data
                        "OL test", "OL Test Portion", "100" //ADP data
                }

        };

    }
}

