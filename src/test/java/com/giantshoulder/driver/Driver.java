package com.giantshoulder.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * @author Gabriella_Havadtoi
 */

public class Driver {
    private static ChromeDriver driver;

    @BeforeTest
    public static void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterTest
    public static void closeDriver() {
        driver.quit();
    }
}
