package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasText;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SuccessfulSubscriptionPage extends BasePage {

    public SuccessfulSubscriptionPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(id = "row-132")
    private WebElement successfulSubscriptionMessageForLearnFaster;

    @FindBy(id = "col-full-102-156-111")
    private WebElement successfulSubscriptionMessageForStopProcrastinating;

    @FindBy(css = "#col-full-102-156 #tmp_headline1-98717-134")
    private WebElement successfulSubscriptionMessageForReachYourGoals;

    @FindBy(css = "#col-full-102-156 #tmp_headline1-98717-134")
    private WebElement successfulSubscriptionMessageForImproveFocus;

    public void validateSuccessMessageForLearnFaster(String message) {
        waitForElementToBeVisible("success message for learn faster", driver, successfulSubscriptionMessageForLearnFaster);
        elementHasText(message, successfulSubscriptionMessageForLearnFaster, "subscription message for learn faster");
    }

    public void validateSuccessMessageForReachYourGoals(String message) {
        waitForElementToBeVisible("success message for reach your goals", driver, successfulSubscriptionMessageForReachYourGoals);
        elementHasText(message, successfulSubscriptionMessageForReachYourGoals, "subscription message for reach your goals");
    }

    public void validateSuccessMessageForImproveFocus(String message) {
        waitForElementToBeVisible("success message for improve focus", driver, successfulSubscriptionMessageForImproveFocus);
        elementHasText(message, successfulSubscriptionMessageForImproveFocus, "subscription message for improve focus");
    }

    public void validateSuccessMessageForStopProcrastinating(String message) {
        waitForElementToBeVisible("success message for stop procrastinating", driver, successfulSubscriptionMessageForStopProcrastinating);
        elementHasText(message, successfulSubscriptionMessageForStopProcrastinating, "subscription message for stop procrastinating");
    }
}
