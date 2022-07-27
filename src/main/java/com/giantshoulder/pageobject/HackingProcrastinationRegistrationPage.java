package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HackingProcrastinationRegistrationPage extends BasePage {

    public HackingProcrastinationRegistrationPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(name = "first_name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "tmp_button-13711-173")
    private WebElement registerButton;

    @FindBy(id = "row-163")
    private WebElement registrationPanel;

    public void waitForRegistrationPanel() {
        waitForElementToBeVisible("registration panel", driver, registrationPanel);
    }

    public void fillNameFieldWith(String name) {
        sendKeysTo("name field", nameInputField, name);
    }

    public void fillEmailFieldWith(String email) {
        sendKeysTo("email field", emailInputField, email);
    }

    public void clickOnRegisterButton() {
        clickOn("register button", driver, registerButton);
    }
}
