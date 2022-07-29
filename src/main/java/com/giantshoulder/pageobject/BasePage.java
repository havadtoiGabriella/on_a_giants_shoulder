package com.giantshoulder.pageobject;

import com.giantshoulder.logger.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static final Logger LOGGER = new Logger(BasePage.class);
    protected ChromeDriver driver;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
