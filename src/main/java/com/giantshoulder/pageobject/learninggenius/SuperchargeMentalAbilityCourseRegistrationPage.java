package com.giantshoulder.pageobject.learninggenius;

import static com.giantshoulder.util.WebElementHandler.*;
import com.giantshoulder.pageobject.BasePage;
import com.giantshoulder.registrationdatatype.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SuperchargeMentalAbilityCourseRegistrationPage extends BasePage {
    private final By dropdown = By.cssSelector(".selectAW-date-real.selectAW-date");
    private final Select selectDateDropdown = new Select(driver.findElement(dropdown));

    @FindBy(name = "name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "tmp_button-34181")
    private WebElement registerButton;

    @FindBy(id = "col-right-313")
    private WebElement registrationPanel;

    public void registerUser(RegistrationData user) {
        LOGGER.info("Waiting for registration panel to be visible.");
        waitForRegistrationPanel();
        LOGGER.info("Filling name field with '" + user.getName() + "'");
        fillNameFieldWith(user.getName());
        LOGGER.info("Filling email field with '" + user.getEmail() + "'");
        fillEmailFieldWith(user.getEmail());
        LOGGER.info("Selecting from dropdown by visible name: '" + user.getDate() + "'");
        fromDropdownSelect(user.getDate());
        LOGGER.info("Clicking on the registration button");
        clickOnRegisterButton();
    }

    private void waitForRegistrationPanel() {
        waitForElementToBeVisible(registrationPanel, driver);
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

    private void clickOnRegisterButton() {
        clickOn(registerButton, driver);
    }

    public SuperchargeMentalAbilityCourseRegistrationPage(ChromeDriver driver) {
        super(driver);
    }
}
