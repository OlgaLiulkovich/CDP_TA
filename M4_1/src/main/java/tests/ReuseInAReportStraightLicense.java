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

import java.util.concurrent.TimeUnit;

/**
 * Test for Reuse in a Report TOU - straight license case
 *
 * @author Olga_Liulkovich
 */
public class ReuseInAReportStraightLicense {

    private WebDriver driver;

    @BeforeClass(description = "Start browser")
    private void initBrowser() {
        Utils beforeClass = new Utils();
        driver = beforeClass.initBrowser();
    }

    @Test(dataProvider = "Reuse in a Report Straight License", description = "Smoke Test for refB TOU = reuse in a report - Straight License")
    public void ReuseInAReportStraightLicenseTest(
            String typeOfUse,
            String requesterType,
            String format,
            String portion,
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
            String circulation
    ) {

        // open landing page
        QuickPricePage refBPage = new QuickPricePage(driver).open("s");
        // fill in QPP
        refBPage.fillInQPP(refBPage, typeOfUse, requesterType, format, portion, translating);
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



    @DataProvider(name = "Reuse in a Report Straight License")
    public static Object[][] validTestData() {
        return new Object[][]{
                {"reuse in a report", "Government", "Print and electronic", "Full article", "No", "822.75 USD",//QPP data
                        "oliulkovich@copyright.com", "123456", //login data }
                        "test title", "OL test", "OL test", "50", "2020", //new work data
                        "OL test", "100" //ADP data
                },

                {"reuse in a report", "Public Sector", "Electronic", "Full article", "No", "548.50 USD",//QPP data
                        "oliulkovich@copyright.com", "123456", //login data }
                        "test title", "OL test", "OL test", "50", "2020", //new work data
                        "OL test", "100" //ADP data
                }

        };

    }
}

