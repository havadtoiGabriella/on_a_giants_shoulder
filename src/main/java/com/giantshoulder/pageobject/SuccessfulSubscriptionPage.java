package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementTextContains;
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

    public void validateSuccessMessageFor(String newsLetterType, String message) {
        switch (newsLetterType.toLowerCase()) {
            case "learn faster":
                waitForElementToBeVisible("success message for learn faster", driver, successfulSubscriptionMessageForLearnFaster);
                elementTextContains(message, successfulSubscriptionMessageForLearnFaster, "subscription message for learn faster");
                break;
            case "reach your goals":
                waitForElementToBeVisible("success message for reach your goals", driver, successfulSubscriptionMessageForReachYourGoals);
                elementTextContains(message, successfulSubscriptionMessageForReachYourGoals, "subscription message for reach your goals");
                break;
            case "improve focus":
                waitForElementToBeVisible("success message for improve focus", driver, successfulSubscriptionMessageForImproveFocus);
                elementTextContains(message, successfulSubscriptionMessageForImproveFocus, "subscription message for improve focus");
                break;
            case "stop procrastinating":
                waitForElementToBeVisible("success message for stop procrastinating", driver, successfulSubscriptionMessageForStopProcrastinating);
                elementTextContains(message, successfulSubscriptionMessageForStopProcrastinating, "subscription message for stop procrastinating");
                break;
        }
    }
}
