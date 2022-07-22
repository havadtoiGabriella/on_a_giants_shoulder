package com.giantshoulder.pageobject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Gabriella_Havadtoi
 */

public class BasePage {

    protected ChromeDriver driver;

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}