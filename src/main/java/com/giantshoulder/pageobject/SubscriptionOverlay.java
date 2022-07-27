package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SubscriptionOverlay extends BasePage {

    public SubscriptionOverlay(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(id = "element1294352-content")
    private WebElement dailyInspirationBoxTitle;

    @FindBy(id = "element1294352-content")
    private WebElement learnFasterNewsletterTypeButton;

    @FindBy(id = "element1294351-content")
    private WebElement stopProcrastinatingNewsletterTypeButton;

    @FindBy(id = "element1294355-content")
    private WebElement improveFocusNewsletterTypeButton;

    @FindBy(id = "element1294354-content")
    private WebElement reachYourGoalsNewsletterTypeButton;

    @FindBy(css = "#element1294344_form [data-field='email'] input")
    private WebElement emailInputFieldForLearnFaster;

    @FindBy(css = "#element1294347_form [type='email']")
    private WebElement emailInputFieldForStopProcrastinating;

    @FindBy(css = "#element1294338_form [type='email']")
    private WebElement emailInputFieldForReachYourGoals;

    @FindBy(css = "#element1294341_form [type='email']")
    private WebElement emailInputFieldForImproveFocus;

    @FindBy(css = "button[data-element-id='1294344']")
    private WebElement submitEmailButtonForLearnFaster;

    @FindBy(css = "button[data-element-id='1294347']")
    private WebElement submitEmailButtonForStopProcrastinating;

    @FindBy(css = "button[data-element-id='1294338']")
    private WebElement submitEmailButtonForReachYourGoals;

    @FindBy(css = "button[data-element-id='1294341']")
    private WebElement submitEmailButtonForImproveFocus;

    @FindBy(css = "img[src*='big-success']")
    private WebElement emailValidatedPopup;

    public void clickOnNewsLetterButtonForLearnFaster() {
        waitForElementToBeVisible("subscribe panel", driver, dailyInspirationBoxTitle);
        clickOn("Learn faster news letter type", driver, learnFasterNewsletterTypeButton);
    }

    public void clickOnNewsLetterButtonForReachYourGoals() {
        waitForElementToBeVisible("subscribe panel", driver, dailyInspirationBoxTitle);
        clickOn("Reach your goals news letter type", driver, reachYourGoalsNewsletterTypeButton);
    }

    public void clickOnNewsLetterButtonForImproveFocus() {
        waitForElementToBeVisible("subscribe panel", driver, dailyInspirationBoxTitle);
        clickOn("Improve focus news letter type", driver, improveFocusNewsletterTypeButton);
    }

    public void clickOnNewsLetterButtonForStopProcrastinating() {
        waitForElementToBeVisible("subscribe panel", driver, dailyInspirationBoxTitle);
        clickOn("Stop procrastinating news letter type", driver, stopProcrastinatingNewsletterTypeButton);
    }

    public void fillEmailFieldForLearnFaster(String emailAddress) {
        sendKeysTo("email input field for learn faster", emailInputFieldForLearnFaster, emailAddress);
    }

    public void fillEmailFieldForReachYourGoals(String emailAddress) {
        sendKeysTo("email input field for reach your goals", emailInputFieldForReachYourGoals, emailAddress);
    }

    public void fillEmailFieldForImproveFocus(String emailAddress) {
        sendKeysTo("email input field for improve focus", emailInputFieldForImproveFocus, emailAddress);
    }

    public void fillEmailFieldForStopProcrastinating(String emailAddress) {
        sendKeysTo("email input field for stop procrastinating", emailInputFieldForStopProcrastinating, emailAddress);
    }

    public void submitEmailForLearnFaster() {
        clickOn("Submit email button for Learn faster", driver, submitEmailButtonForLearnFaster);
    }

    public void submitEmailForReachYourGoals() {
        clickOn("Submit email button for Reach your goals", driver, submitEmailButtonForReachYourGoals);
    }

    public void submitEmailForImproveFocus() {
        clickOn("Submit email button for Improve focus", driver, submitEmailButtonForImproveFocus);
    }

    public void submitEmailForStopProcrastinating() {
        clickOn("Submit email button for Stop procrastinating", driver, submitEmailButtonForStopProcrastinating);
    }

    public void waitForVisibilityOfEmailValidatedPopup() {
        waitForElementToBeVisible("email validated popup", driver, emailValidatedPopup);
    }
}
