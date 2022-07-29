package com.giantshoulder.pageobject;

import com.giantshoulder.logger.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static final Logger LOGGER = new Logger(BasePage.class);
    static final String BASE_URL = "https://www.lifehack.org/";
    protected ChromeDriver driver;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
