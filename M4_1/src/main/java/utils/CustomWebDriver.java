package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/**
 * Custom web driver class - used to do a log when browser starts
 */

public class CustomWebDriver implements WebDriver {

    protected WebDriver driver;

    public CustomWebDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void get(String s) {
        driver.get(s);
    }

    public String getCurrentUrl() {

        return driver.getCurrentUrl();
    }

    public String getTitle() {

        return driver.getTitle();
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public String getPageSource() {

        return driver.getPageSource();
    }

    public void close() {
        driver.close();
        System.out.println("closing webdriver");

    }

    public void quit() {
        driver.close();
    }

    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    public Navigation navigate() {
        return driver.navigate();
    }

    public Options manage() {

        return driver.manage();
    }
}
