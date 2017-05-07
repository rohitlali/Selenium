package com.rohit.practice.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by rohit on 06-May-17.
 */
public enum DriverFactory {

    INSTANCE;

    ThreadLocal<WebDriver> driverContext = new ThreadLocal<WebDriver>();

    public enum BROWSER {
        FIREFOX, IE, CHROME, HEADLESS;
    }


    public DesiredCapabilities desiredCapabilities(BROWSER browser) {
        DesiredCapabilities capabilities = null;
        switch (browser) {
            case FIREFOX:
                capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability(FirefoxDriver.PROFILE, createProfile());
                break;
            // TODO: Add remaining


        }

        return capabilities;
    }

    public WebDriver initializeWebDriver(DesiredCapabilities desiredCapabilities) {
        WebDriver driver = null;
        switch (desiredCapabilities.getBrowserName()) {
            case BrowserType.FIREFOX:
                driver = new FirefoxDriver(desiredCapabilities);
                break;
            case BrowserType.HTMLUNIT:
                driver = new HtmlUnitDriver(desiredCapabilities);
                break;
            case BrowserType.PHANTOMJS:
                driver = new HtmlUnitDriver(desiredCapabilities);
                break;
            case BrowserType.CHROME:
                System.setProperty("webdriver.chrome.driver", "target/chromedriver");
                driver = new ChromeDriver(desiredCapabilities);
                break;
            default:
                throw new IllegalStateException("unknown browser " + desiredCapabilities.getBrowserName());
        }
        driverContext.set(driver);
        return driver;
    }

    public WebDriver getDriver() {
        return driverContext.get();
    }

    public void removeDriver() {
        driverContext.get().quit();
        driverContext.remove();
    }

    private FirefoxProfile createProfile() {
        FirefoxProfile profile = new FirefoxProfile();

        // Use native events on all platforms
        profile.setEnableNativeEvents(true);
        return profile;
    }
}