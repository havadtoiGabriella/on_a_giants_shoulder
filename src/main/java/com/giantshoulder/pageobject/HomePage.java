package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.clickOn;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement dataConsentButton;

    @FindBy(id = "element3421730-content")
    private WebElement subscribeButton;

    public void acceptDataConsentPanel() {
        LOGGER.info("Accepting data consent panel");
        waitForElementToBeVisible(dataConsentButton, driver);
        clickOn(dataConsentButton, driver);
    }

    public HomePage(ChromeDriver driver) {
        super(driver);
    }
}
