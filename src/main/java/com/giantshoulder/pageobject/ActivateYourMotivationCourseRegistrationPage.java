package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import com.giantshoulder.logger.Logger;
import com.giantshoulder.util.WebElementAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActivateYourMotivationCourseRegistrationPage extends BasePage {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);
    private static final String urlFragmentForThirtyMinutesCourse = "aym-registration-v2";
    private final By dropdown = By.cssSelector(".selectAW-date-real.selectAW-date");
    private final Select selectDateDropdown = new Select(driver.findElement(dropdown));

    @FindBy(name = "name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "button-79065")
    private WebElement registerButtonThirtyMinutes;

    @FindBy(id = "row--61067")
    private WebElement registrationPanelThirtyMinutes;

    public String getUrlFragmentForThirtyMinutesCourse() {
        return urlFragmentForThirtyMinutesCourse;
    }

    public void waitForRegistrationPanelThirtyMinutes() {
        LOGGER.info("Waiting for registration panel to be visible.");
        waitForElementToBeVisible(registrationPanelThirtyMinutes, driver);
    }

    public void fillNameFieldWith(String name) {
        LOGGER.info("Filling name field with " + name);
        sendKeysTo(nameInputField, name);
    }

    public void fillEmailFieldWith(String email) {
        LOGGER.info("Filling email field with " + email);
        sendKeysTo(emailInputField, email);
    }

    public void fromDropdownSelect(String option) {
        LOGGER.info("Selecting from dropdown by visible name: " + option);
        selectByTextFrom(selectDateDropdown, option);
    }

    public void clickOnRegisterButtonThirtyMinutes() {
        LOGGER.info("Clicking on the registration button");
        clickOn(registerButtonThirtyMinutes, driver);
    }

    public ActivateYourMotivationCourseRegistrationPage(ChromeDriver driver) {
        super(driver);
    }
}
