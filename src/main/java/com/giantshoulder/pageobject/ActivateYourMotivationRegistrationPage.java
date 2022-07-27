package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActivateYourMotivationRegistrationPage extends BasePage {

    public ActivateYourMotivationRegistrationPage(ChromeDriver driver) {
        super(driver);
    }

    private final By dropdown = By.cssSelector(".selectAW-date-real.selectAW-date");

    @FindBy(name = "name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "button-79065")
    private WebElement registerButton;

    @FindBy(id = "row--61067")
    private WebElement registrationPanel;

    @FindBy(id = "col-right-313")
    private WebElement registrationPanelTwentyMinutes;

    @FindBy(id = "tmp_button-34181")
    private WebElement registerButtonTwentyMinutes;

    private final Select selectDateDropdown = new Select(driver.findElement(dropdown));

    public void waitForRegistrationPanel() {
        waitForElementToBeVisible("registration panel", driver, registrationPanel);
    }

    public void waitForRegistrationPanelTwentyMinutes() {
        waitForElementToBeVisible("registration panel", driver, registrationPanelTwentyMinutes);
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

    public void clickOnRegisterButton(){
        clickOn("register button", driver, registerButton);
    }

    public void clickOnRegisterButtonTwentyMinutes(){
        clickOn("register button", driver, registerButtonTwentyMinutes);
    }
}
