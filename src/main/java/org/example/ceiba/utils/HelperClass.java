package org.example.ceiba.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HelperClass {

    private static HelperClass helperClass;

    private static WebDriver driver;
    public final static int TIMEOUT = 10;

    private HelperClass() {

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless"); // Run mode (without a GUI)

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (helperClass == null) {
            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {

        if(driver!=null) {
            driver.close();
            driver.quit();
        }
        helperClass = null;
    }

}