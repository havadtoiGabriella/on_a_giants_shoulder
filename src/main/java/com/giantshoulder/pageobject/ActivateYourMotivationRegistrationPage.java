package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActivateYourMotivationRegistrationPage extends BasePage {

    public ActivateYourMotivationRegistrationPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-99629")
    private WebElement nameInputField;

    @FindBy(id = "input-72471")
    private WebElement emailInputField;

    @FindBy(id = "awdt-33426")
    private Select selectDateDropdown;

    @FindBy(id = "button-79065")
    private WebElement registerButton;

    @FindBy(id = "row--61067")
    private WebElement registrationPanel;

    public void waitForRegistrationPanel(){
        waitForElementToBeVisible("registration panel", driver, registrationPanel);
    }

    public void fillNameFieldWith(String name) {
        sendKeysTo("namefield", nameInputField, name);
    }

    public void fillEmailFieldWith(String email) {
        sendKeysTo("email field", emailInputField, email);
    }

    public void fromDropdownSelect(String option) {
        selectByTextFrom("Date selector", selectDateDropdown, option);
    }
}
