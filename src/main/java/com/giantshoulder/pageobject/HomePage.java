package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.clickOn;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(id = "element3421730-content")
    private WebElement subscribeButton;

    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement dataConsentButton;

    public void clickOnSubscribeButton() {
        waitForElementToBeVisible("subscribe button", driver, subscribeButton);
        clickOn("subscribe button", driver, subscribeButton);
    }

    public void acceptDataConsentPanel() {
        waitForElementToBeVisible("consent button", driver, dataConsentButton);
        clickOn("data consent button", driver, dataConsentButton);
    }
}
