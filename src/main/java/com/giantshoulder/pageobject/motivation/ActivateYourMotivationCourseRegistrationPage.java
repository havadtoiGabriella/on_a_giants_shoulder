package com.giantshoulder.pageobject.motivation;

import static com.giantshoulder.pagetype.RegistrationDataType.EMAIL;
import static com.giantshoulder.pagetype.RegistrationDataType.NAME;
import static com.giantshoulder.util.WebElementHandler.*;
import com.giantshoulder.pageobject.BasePage;
import com.giantshoulder.pagetype.RegistrationDataType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ActivateYourMotivationCourseRegistrationPage extends BasePage {
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

    public void registerUser(String name, String email, String option) {
        LOGGER.info("Waiting for registration panel to be visible.");
        waitForRegistrationPanel();
        LOGGER.info("Filling name field with '" + NAME.getData() + "'");
        fillNameFieldWith(NAME.getData());
        LOGGER.info("Filling email field with '" + EMAIL.getData() + "'");
        fillEmailFieldWith(EMAIL.getData());
        LOGGER.info("Selecting from dropdown by visible name: '" + option + "'");
        fromDropdownSelect(option);
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

    public ActivateYourMotivationCourseRegistrationPage(ChromeDriver driver) {
        super(driver);
    }
}
