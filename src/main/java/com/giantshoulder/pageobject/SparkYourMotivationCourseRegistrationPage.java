package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import com.giantshoulder.logger.Logger;
import com.giantshoulder.util.WebElementAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SparkYourMotivationCourseRegistrationPage extends BasePage {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);
    private final By dropdown = By.cssSelector(".selectAW-date-real.selectAW-date");
    private final Select selectDateDropdown = new Select(driver.findElement(dropdown));

    @FindBy(name = "name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "col-right-313")
    private WebElement registrationPanel;

    @FindBy(id = "tmp_button-34181")
    private WebElement registerButton;

    public void registerUser(String name, String email, String option) {
        LOGGER.info("Waiting for registration panel to be visible.");
        waitForElementToBeVisible(registrationPanel, driver);
        LOGGER.info("Filling name field with " + name);
        sendKeysTo(nameInputField, name);
        LOGGER.info("Filling email field with " + email);
        sendKeysTo(emailInputField, email);
        LOGGER.info("Selecting from dropdown by visible name: " + option);
        selectByTextFrom(selectDateDropdown, option);
        LOGGER.info("Clicking on the registration button");
        clickOn(registerButton, driver);
    }

    private void fillNameFieldWith(String name) {
        sendKeysTo(nameInputField, name);
    }

    private void fillEmailFieldWith(String email) {
        sendKeysTo(emailInputField, email);
    }

    private void fromDropdownSelect(String option) {
        selectByTextFrom(selectDateDropdown, option);
    }

    private void clickOnRegisterButtonThirtyMinutes() {
        clickOn(registerButton, driver);
    }

    public SparkYourMotivationCourseRegistrationPage(ChromeDriver driver) {
        super(driver);
    }
}
