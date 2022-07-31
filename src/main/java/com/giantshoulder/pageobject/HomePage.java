package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.clickOn;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import com.giantshoulder.pagetype.PageType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement dataConsentButton;

    @FindBy(id = "menu-item-811183")
    private WebElement blogMenuItem;

    public void navigateToPage(PageType pageType) {
        LOGGER.info("Navigating to " + pageType + " page.");
        driver.navigate().to(BASE_URL + pageType.getUrlFragment());
    }

    public void acceptDataConsentPanel() {
        LOGGER.info("Accepting the data consent panel.");
        waitForElementToBeVisible(dataConsentButton, driver);
        clickOn(dataConsentButton, driver);
    }

    public HomePage(ChromeDriver driver) {
        super(driver);
    }
}
