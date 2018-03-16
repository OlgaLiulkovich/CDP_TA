package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ADP.ReportTOUAdditionalDataPage;
import pages.DetailsPages.ReviewOrderPage;
import pages.LoginPage;
//import pages.MyLibrary.MyLibraryListPage;
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
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
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
        refBPage.selectTypeOfUse(typeOfUse);
        refBPage.selectRequesterType(requesterType);
        refBPage.selectFormat(format);
        refBPage.selectPortion(portion);
        refBPage.selectTranslating(translating);
        //calculate price and assert it
        refBPage.clickQuickPrice();
        Assert.assertEquals(refBPage.getPrice(), price, "Incorrect price estimated");
        // continue order flow
        refBPage.clickContinue();
        //login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillinUserName(userName);
        loginPage.fillinPassword(password);
        loginPage.signIn();
        //create New Work
        NewWorkReportTOUPage newWork = new NewWorkReportTOUPage(driver);
        Assert.assertEquals(newWork.getTitle(), "About Your Work", "Didn't get to New Works page");
        newWork.fillInTitle(title);
        newWork.fillInAuthor(author);
        newWork.fillInPublisher(publisher);
        newWork.fillInWorkSize(workSize);
        newWork.selectYear(year);
        newWork.clickContinue();
        //check that ADP is open
        ReportTOUAdditionalDataPage adp = new ReportTOUAdditionalDataPage(driver);
        boolean checkTitleResult = adp.verifyTitle();
        //Assert.assertEquals(checkTitleResult,true,"Didn't get to ADP"); // can this be used or this is a bad practice???
        // fill in ADP
        adp.fillInOrderRef(orderRef);
        adp.fillInCirculation(circulation);
        adp.clickContinue();
        //check that Order Review page got open
        ReviewOrderPage reviewOrder = new ReviewOrderPage(driver);
        Assert.assertEquals(reviewOrder.getPageTitle(), "Review Order", "Didn't get to Review Order page");
        // assert data on Review Order page
        Assert.assertEquals(reviewOrder.getContentPublisher(), "refB Publishing Group Ltd.", "Wrong Content Publisher value on details page");
        Assert.assertEquals(reviewOrder.getContentPublication(), "RefB1", "Wrong Content Publication value on details page");


    }

    /*@AfterClass(description = "Close browser")
    public void closeBrowser() {
        driver.close();
    }
    */


    @DataProvider(name = "Reuse in a Report Straight License")
    public static Object[][] validTestData() {
        return new Object[][]{
                {"reuse in a report", "Government", "Print and electronic", "Full article", "No", "822.75 USD",//QPP data
                        "oliulkovich@copyright.com", "123456", //login data }
                        "test title", "OL test", "OL test", "50", "2020", //new work data
                        "OL test", "100" //ADP data
                }


        };

    }
}

