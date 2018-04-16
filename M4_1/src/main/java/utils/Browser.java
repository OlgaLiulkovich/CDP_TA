package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Browser class
 */
public class Browser {

    private static WebDriver driver = null;
    private static CustomWebDriver instance = null;


    private Browser( WebDriver driver){
        this.driver = driver;

    }; // update it based on the discussion

    public static CustomWebDriver initBrowser() {
        if (instance != null){
            return instance;
        }
        return instance = init();
    }

    private static CustomWebDriver init(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = null;
        CustomWebDriver myDriver = null;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        myDriver = new CustomWebDriver(driver); //???????
        //WebDriver driver = new RemoteWebDriver(new URL("http://192.168.2.250:4444/wd/hub"), DesiredCapabilities.firefox());
        //driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.manage().window().maximize(); */
        System.out.println(myDriver);
        return myDriver;
    }

    public static void closeBrowser(WebDriver driver) {
        if (instance != null) {
            try {
                instance.quit();
            } catch (Exception e) {
            } finally {
                instance = null;
            }
        }

    }

}
