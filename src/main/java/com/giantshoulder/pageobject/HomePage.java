package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.clickOn;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement dataConsentButton;

    public void acceptDataConsentPanel() {
        waitForElementToBeVisible("consent button", driver, dataConsentButton);
        clickOn("data consent button", driver, dataConsentButton);
    }

    public HomePage(ChromeDriver driver) {
        super(driver);
    }
}
