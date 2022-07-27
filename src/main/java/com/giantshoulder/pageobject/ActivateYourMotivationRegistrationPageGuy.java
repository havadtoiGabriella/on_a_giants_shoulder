package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActivateYourMotivationRegistrationPageGuy extends BasePage {

    public ActivateYourMotivationRegistrationPageGuy(ChromeDriver driver) {
        super(driver);
    }

    private final By dropdown = By.cssSelector(".selectAW-date-real.selectAW-date");
    private final Select selectDateDropdown = new Select(driver.findElement(dropdown));

    @FindBy(name = "name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "tmp_button-34181")
    private WebElement registerButton;

    @FindBy(id = "col-right-313")
    private WebElement registrationPanelGuy;

    @FindBy(id = "tmp_button-34181")
    private WebElement registerButtonGuy;

    public void waitForRegistrationPanel() {
        waitForElementToBeVisible("registration panel", driver, registrationPanelGuy);
    }

    public void waitForRegistrationPanelGuy() {
        waitForElementToBeVisible("registration panel", driver, registrationPanelGuy);
    }

    public void fillNameFieldWith(String name) {
        sendKeysTo("name field", nameInputField, name);
    }

    public void fillEmailFieldWith(String email) {
        sendKeysTo("email field", emailInputField, email);
    }

    public void fromDropdownSelect(String option) {
        selectByTextFrom("date selector", selectDateDropdown, option);
    }

    public void clickOnRegisterButtonGuy() {
        clickOn("register button", driver, registerButtonGuy);
    }

    public void clickOnRegisterButton() {
        clickOn("register button", driver, registerButton);
    }
}
