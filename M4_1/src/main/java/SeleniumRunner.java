//import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Runner for a scenario running
 *
 * @author Olga Liulkovich
 */


public class SeleniumRunner {
    //@Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // selecting env to run tests on
        String env = "pre"; // non prod env

        // open refB landing page
        driver.get("http://" + env + "100.copyright.com/AppDispatchServlet?publisherName=refB&publication=RefB1&author=Snoopy&orderBeanReset=true&title=refB+Title&volumeNum=34&issueNum=15&debug=1&contentID=10.3945/ajcn.115.122937&numPages=10&proxyOrder=false&publicationDate=July+6%2C+2008");

        // check & fill in elements on QPP

        Map<String, String> qppFields = QPPfields.fillInQPPFieldList();

        for (Map.Entry<String, String> entry : qppFields.entrySet()) {
            String name = entry.getKey();
            String value = entry.getValue();

            Select ddl = new Select(driver.findElement(By.name(name)));

            ddl.selectByVisibleText(value);

        }

        driver.findElement(By.name("quickprice")).click();

        String price = driver.findElement(By.name("priceDouble")).getText();

        // check price
        String expPrice = "822.75 USD";
        if (price.equals(expPrice)) {
            System.out.println("Price is correct");
        } else {
            System.out.println("Incorrect price estimated: " + price + " expected price: " + expPrice);
        }

        // navigate to Login page
        driver.findElement(By.name("continue")).click();

        // wait while CAS page is loaded & login
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("oliulkovich@copyright.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@name='submit']")).click();

        // wait while Works page loads & create a new work

        WebElement worksPage = (new WebDriverWait(driver, 10))
                .until(new ExpectedCondition<WebElement>() {
                    public WebElement apply(WebDriver webDriver) {
                        return webDriver.findElement(By.linkText("NEW WORK"));
                    }
                });

        driver.findElement(By.linkText("NEW WORK")).click();

        driver.findElement(By.name("addNewTitle")).sendKeys("OL test");
        driver.findElement(By.name("newCreator")).sendKeys("OL test");
        driver.findElement(By.name("addNewPub")).sendKeys("OL test");

        Select yearDdl = new Select(driver.findElement(By.name("addNewPubYear")));
        yearDdl.selectByVisibleText("2020");

        driver.findElement(By.name("newWorkSize")).sendKeys("50");

        driver.findElement(By.linkText("CONTINUE")).click();

        // fill in ADP
        driver.findElement(By.name("circulation")).sendKeys("100");
        driver.findElement(By.linkText("CONTINUE")).click();

        // check user's data on Review Order page

        // QPP data
        Map<String, String> qppDetailsFields = QPPDetailsfields.fillInQPPDetailsfields();

        for (Map.Entry<String, String> entry : qppDetailsFields.entrySet()) {
            String name = entry.getKey();
            String value = entry.getValue();

            String text = driver.findElement(By.name(name)).getText();
            if (!text.equals(value)) {
                System.out.println("Incorrect value is displayed for the field" + name + ", exp value is " + value);
            }
        }

        // price
        if (!driver.findElement(By.name("priceDouble")).getText().equals(expPrice)) {
            System.out.println("Incorrect price on Review Order page: " + price + " expected price: " + expPrice);
        } else {
            System.out.println("Price is correct on Order Review Page");
        }

        // check check boxes

        driver.findElement(By.name("termsAgree")).click();


        /*
        if ( !driver.findElement(By.name("termsAgree")).isSelected() )
        {
            driver.findElement(By.name("termsAgree")).click();
        }

        if ( !driver.findElement(By.name("hasContent")).isSelected() )
        {
            driver.findElement(By.name("hasContent")).click();
        }
*/

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.close();
    }
}
