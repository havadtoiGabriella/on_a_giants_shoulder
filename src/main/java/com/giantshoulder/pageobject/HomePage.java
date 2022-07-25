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

    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement dataConsentButton;

    @FindBy(id = "menu-item-849490")
    private WebElement coursesMenuItem;

    @FindBy(id = "menu-item-857782")
    private WebElement freeClassesDropdownMenuItem;

    public void acceptDataConsentPanel() {
        waitForElementToBeVisible("consent button", driver, dataConsentButton);
        clickOn("data consent button", driver, dataConsentButton);
    }

    public void clickOnCourseMenuItem() {
        clickOn("Courses menu item", driver, coursesMenuItem);
    }

    public void clickOnFreeClassesDropdownMenuItem() {
        clickOn("Free classes dropdown menu item", driver, freeClassesDropdownMenuItem);
    }
}
