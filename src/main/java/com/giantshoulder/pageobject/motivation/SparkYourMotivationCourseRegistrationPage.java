package com.giantshoulder.pageobject.motivation;

import static com.giantshoulder.util.WebElementHandler.*;
import com.giantshoulder.pageobject.BasePage;
import com.giantshoulder.registrationdatatype.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SparkYourMotivationCourseRegistrationPage extends BasePage {
    private final By dropdown = By.cssSelector(".selectAW-date-real.selectAW-date");
    private final Select selectDateDropdown = new Select(driver.findElement(dropdown));

    @FindBy(name = "name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "col-right-313")
    private WebElement registrationPanel;

    @FindBy(id = "button-79065")
    private WebElement registerButton;

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

    public SparkYourMotivationCourseRegistrationPage(ChromeDriver driver) {
        super(driver);
    }
}
