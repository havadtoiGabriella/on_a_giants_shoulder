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
    private static final String urlFragmentForTwentyMinutesCourse = "aym-registration-9?";
    private final By dropdown = By.cssSelector(".selectAW-date-real.selectAW-date");
    private final Select selectDateDropdown = new Select(driver.findElement(dropdown));

    @FindBy(name = "name")
    private WebElement nameInputField;

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(id = "col-right-313")
    private WebElement registrationPanelTwentyMinutes;

    @FindBy(id = "tmp_button-34181")
    private WebElement registerButtonTwentyMinutes;

    public String getUrlForTwentyMinutesCourse() {
        return urlFragmentForTwentyMinutesCourse;
    }

    public void waitForRegistrationPanelTwentyMinutes() {
        LOGGER.info("Waiting for registration panel to be visible.");
        waitForElementToBeVisible(registrationPanelTwentyMinutes,  driver);
    }

    public void fillNameFieldWith(String name) {
        LOGGER.info("Filling name field with " + name);
        sendKeysTo(nameInputField, name);
    }

    public void fillEmailFieldWith(String email) {
        LOGGER.info("Filling email field with " + email);
        sendKeysTo(emailInputField, email);
    }

    public void fromDropdownSelect(String option) {
        LOGGER.info("Selecting from dropdown by visible name: " + option);
        selectByTextFrom(selectDateDropdown, option);
    }

    public void clickOnRegisterButtonTwentyMinutes() {
        LOGGER.info("Clicking on the registration button");
        clickOn(registerButtonTwentyMinutes, driver);
    }

    public SparkYourMotivationCourseRegistrationPage(ChromeDriver driver) {
        super(driver);
    }
}
