package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.clickOn;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import com.giantshoulder.logger.Logger;
import com.giantshoulder.util.WebElementAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement dataConsentButton;

    @FindBy(id = "menu-item-849490")
    private WebElement coursesMenuItem;

    @FindBy(id = "menu-item-857782")
    private WebElement freeClassesDropdownMenuItem;

    public void acceptDataConsentPanel() {
        LOGGER.info("Waiting for data consent button to be visible.");
        waitForElementToBeVisible(dataConsentButton, driver);
        LOGGER.info("Clicking on the data consent button");
        clickOn(dataConsentButton, driver);
    }

    public void clickOnCourseMenuItem() {
        LOGGER.info("Clicking on the 'Courses' menu item");
        clickOn(coursesMenuItem, driver);
    }

    public void clickOnFreeClassesDropdownMenuItem() {
        LOGGER.info("Clicking on the 'Free classes' dropdown menu item");
        clickOn(freeClassesDropdownMenuItem, driver);
    }

    public HomePage(ChromeDriver driver) {
        super(driver);
    }
}
