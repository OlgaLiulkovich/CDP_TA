package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
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

    @Test(description = "Smoke Test for refB TOU = reuse in a report - Straight License")
    public void ReuseInAReportStraightLicenseTest() {
        // open landing page
        QuickPricePage refBPage = new QuickPricePage(driver).open("s");
        // fill in QPP
        refBPage.selectTypeOfUse("reuse in a report");
        refBPage.selectRequesterType("Government");
        refBPage.selectFormat("Print and electronic");
        refBPage.selectPortion("Full article");
        refBPage.selectTranslating("No");
        //calculate price and assert it
        refBPage.clickQuickPrice();
        Assert.assertEquals(refBPage.getPrice(),"822.75 USD", "Incorrect price estimated");
        // continue order flow
        refBPage.clickContinue();
        //login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillinUserName("oliulkovich@copyright.com");
        loginPage.fillinPassword("123456");
        loginPage.signIn();
        //create New Work
        NewWorkReportTOUPage newWork = new NewWorkReportTOUPage(driver);
        Assert.assertEquals(newWork.getTitle(), "About Your Work", "Didn't get to New Works page");
        newWork.fillInTitle("test title");
        newWork.fillInAuthor("OL test");
        newWork.fillInPublisher("OL test");
        newWork.fillInWorkSize("50");
        newWork.selectYear("2020");
        newWork.clickContinue();
        //check that ADP is open
        ReportTOUAdditionalDataPage adp = new ReportTOUAdditionalDataPage(driver);
        boolean checkTitleResult = adp.verifyTitle();
        //Assert.assertEquals(checkTitleResult,true,"Didn't get to ADP"); // can this be used or this is a bad practice???
        // fill in ADP
        adp.fillInOrderRef("OL test");
        adp.fillInCirculation("100");
        adp.clickContinue();
        //check that Order Review page got open
        ReviewOrderPage reviewOrder = new ReviewOrderPage(driver);
        Assert.assertEquals(reviewOrder.getPageTitle(),"Review Order","Didn't get to Review Order page");
        // assert data on Review Order page
        Assert.assertEquals(reviewOrder.getContentPublisher(),"refB Publishing Group Ltd.","Wrong Content Publisher value on details page");
        Assert.assertEquals(reviewOrder.getContentPublication(),"RefB1","Wrong Content Publication value on details page");








    }

    /*@AfterClass(description = "Close browser")
    public void closeBrowser() {
        driver.close();
    }
    */


}
