package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import com.giantshoulder.logger.Logger;
import com.giantshoulder.util.WebElementAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HackingProcrastinationCourseRegistrationPage extends BasePage {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    @FindBy(name = "first_name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "tmp_button-13711-173")
    private WebElement registerButton;

    @FindBy(id = "row-163")
    private WebElement registrationPanel;

    public void registerUser(String name, String emailAddress) {
        LOGGER.info("Waiting for registration panel to be visible.");
        waitForRegistrationPanel();
        LOGGER.info("Registering user for 'Hacking Procrastination' webinar");
        fillNameFieldWith(name);
        fillEmailFieldWith(emailAddress);
        clickOnRegisterButton();
    }

    private void waitForRegistrationPanel() {
        waitForElementToBeVisible(registrationPanel, driver);
    }

    private void fillNameFieldWith(String name) {
        LOGGER.info("Filling name field with " + name);
        sendKeysTo(nameInputField, name);
    }

    private void fillEmailFieldWith(String email) {
        LOGGER.info("Filling email field with " + email);
        sendKeysTo(emailInputField, email);
    }

    private void clickOnRegisterButton() {
        LOGGER.info("Clicking on the registration button");
        clickOn(registerButton, driver);
    }

    public HackingProcrastinationCourseRegistrationPage(ChromeDriver driver) {
        super(driver);
    }
}
