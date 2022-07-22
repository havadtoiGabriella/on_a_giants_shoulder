package com.giantshoulder.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import static com.giantshoulder.util.WebElementHandler.*;

/**
 * @author Gabriella_Havadtoi
 */
public class MainPage extends BasePage {

    public MainPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(id = "element3421730-content")
    private WebElement subscribeButton;

    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement dataConsentButton;

    @FindBy(id = "element1294352-content")
    private  WebElement dailyInspirationBoxTitle;

    @FindBy(id = "element1294352-content")
    private  WebElement learnFasterNewsletterTypeButton;

    @FindBy(id = "element1294351-content")
    private  WebElement stopProcrastinatingNewsletterTypeButton;

    @FindBy(id = "element1294355-content")
    private WebElement improveFocusNewsletterTypeButton;

    @FindBy(id = "element1294354-content")
    private WebElement reachYourGoalsNewsletterTypeButton;

    @FindBy(css = "#element1294344_form [data-field='email'] input")
    private  WebElement emailInputFieldForLearnFaster;

    @FindBy(css = "#element1294347_form [type='email']")
    private  WebElement emailInputFieldForStopProcrastinating;

    @FindBy(css = "#element1294338_form [type='email']")
    private  WebElement emailInputFieldForReachYourGoals;

    @FindBy(css = "#element1294341_form [type='email']")
    private WebElement emailInputFieldForImproveFocus;

    @FindBy(css = "button[data-element-id='1294344']")
    private WebElement submitEmailButtonForLearnFaster;

    @FindBy(css = "button[data-element-id='1294347']")
    private  WebElement submitEmailButtonForStopProcrastinating;

    @FindBy(css = "button[data-element-id='1294338']")
    private  WebElement submitEmailButtonForReachYourGoals;

    @FindBy(css = "button[data-element-id='1294341']")
    private  WebElement submitEmailButtonForImproveFocus;

    @FindBy(css = "img[src*='big-success']")
    private  WebElement emailValidatedPopup;

    public void clickOnSubscribeButton() {
        waitForElementToBeVisible("subscribe button", driver, subscribeButton);
        clickOn("subscribe button", driver, subscribeButton);
    }

    public void acceptDataConsentPanel() {
        waitForElementToBeVisible("consent button", driver, dataConsentButton);
        clickOn("data consent button", driver, dataConsentButton);
    }

    public void clickOnNewsLetterButtonFor(String newsLetterType) {
        waitForElementToBeVisible("subscribe panel", driver, dailyInspirationBoxTitle);
        switch (newsLetterType.toLowerCase()) {
            case "learn faster":
                clickOn("Learn faster news letter type", driver, learnFasterNewsletterTypeButton);
                break;
            case "reach your goals":
                clickOn("Reach your goals news letter type", driver, reachYourGoalsNewsletterTypeButton);
                break;
            case "improve focus":
                clickOn("Improve focus news letter type", driver, improveFocusNewsletterTypeButton);
                break;
            case "stop procrastinating":
                clickOn("Stop procrastinating news letter type", driver, stopProcrastinatingNewsletterTypeButton);
                break;
        }
    }

    public void fillEmailFieldFor(String newsLetterType, String emailAddress) {
        switch (newsLetterType.toLowerCase()) {
            case "learn faster":
                sendKeysTo("email input field for learn faster", emailInputFieldForLearnFaster, emailAddress);
                break;
            case "reach your goals":
                sendKeysTo("email input field for reach your goals", emailInputFieldForReachYourGoals, emailAddress);
                break;
            case "improve focus":
                sendKeysTo("email input field for improve focus", emailInputFieldForImproveFocus, emailAddress);
                break;
            case "stop procrastinating":
                sendKeysTo("email input field for stop procrastinating", emailInputFieldForStopProcrastinating, emailAddress);
                break;
        }
    }

    public void submitEmailFor(String newsLetterType) {
        switch (newsLetterType.toLowerCase()) {
            case "learn faster":
                clickOn("Submit email button for Learn faster", driver, submitEmailButtonForLearnFaster);
                break;
            case "reach your goals":
                clickOn("Submit email button for Reach your goals", driver, submitEmailButtonForReachYourGoals);
                break;
            case "improve focus":
                clickOn("Submit email button for Improve focus", driver, submitEmailButtonForImproveFocus);
                break;
            case "stop procrastinating":
                clickOn("Submit email button for Stop procrastinating", driver, submitEmailButtonForStopProcrastinating);
                break;
        }
    }

    public void waitForVisibilityOfEmailValidatedPopup() {
        waitForElementToBeVisible("email validated popup", driver, emailValidatedPopup);
    }
}
