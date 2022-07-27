package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActivateYourMotivationRegistrationThirtyMinutesCoursePage extends BasePage {

    public ActivateYourMotivationRegistrationThirtyMinutesCoursePage(ChromeDriver driver) {
        super(driver);
    }

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
        waitForElementToBeVisible("registration panel", driver, registrationPanelThirtyMinutes);
    }

    public void fillNameFieldWith(String name) {
        sendKeysTo("name field", nameInputField, name);
    }

    public void fillEmailFieldWith(String email) {
        sendKeysTo("email field", emailInputField, email);
    }

    public void fromDropdownSelect(String option) {
        selectByTextFrom("Date selector", selectDateDropdown, option);
    }

    public void clickOnRegisterButtonThirtyMinutes() {
        clickOn("register button", driver, registerButtonThirtyMinutes);
    }
}
