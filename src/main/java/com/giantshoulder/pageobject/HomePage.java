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

    public void acceptDataConsentPanel() {
        waitForElementToBeVisible(dataConsentButton, driver);
        clickOn(dataConsentButton, driver);
    }

    public void clickOnBlogMenuItem() {
        clickOn(blogMenuItem, driver);
    }

    public HomePage(ChromeDriver driver) {
        super(driver);
    }

    public void clickOnBlogPage(PageType pageType) {
        String urlFragment = pageType.getUrlFragment();
        driver.navigate().to(BASE_URL + urlFragment);
    }
}
