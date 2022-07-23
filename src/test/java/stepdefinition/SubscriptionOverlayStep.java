package stepdefinition;

import com.giantshoulder.pageobject.SubscriptionOverlay;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class SubscriptionOverlayStep extends BaseStepDefinition {

    SubscriptionOverlay subscriptionOverlay = new SubscriptionOverlay(driver);

    @And("I choose 'Learn faster' newsletter")
    public void i_chose_learn_faster_newsletter_types() {
        subscriptionOverlay.clickOnNewsLetterButtonForLearnFaster();
    }

    @And("I choose 'Stop procrastinating' newsletter")
    public void i_chose_stop_procrastinating_types() {
        subscriptionOverlay.clickOnNewsLetterButtonForStopProcrastinating();
    }

    @And("I choose 'Reach your goals' newsletter")
    public void i_chose_reach_your_goals_newsletter_types() {
        subscriptionOverlay.clickOnNewsLetterButtonForReachYourGoals();
    }

    @And("I choose 'Improve focus' newsletter")
    public void i_chose_improve_focus_newsletter_types() {
        subscriptionOverlay.clickOnNewsLetterButtonForImproveFocus();
    }

    @When("I enter my e-mail address for 'Learn faster'")
    public void i_enter_my_email_address_for_learn_faster() {
        subscriptionOverlay.fillEmailFieldForLearnFaster("onagiantsshoulder@gmail.com");
        subscriptionOverlay.submitEmailForLearnFaster();
        subscriptionOverlay.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Stop procrastinating'")
    public void i_enter_my_email_address_for_stop_procrastinating() {
        subscriptionOverlay.fillEmailFieldForStopProcrastinating("onagiantsshoulder@gmail.com");
        subscriptionOverlay.submitEmailForStopProcrastinating();
        subscriptionOverlay.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Reach your goals'")
    public void i_enter_my_email_address_for_reach_your_goals() {
        subscriptionOverlay.fillEmailFieldForReachYourGoals("onagiantsshoulder@gmail.com");
        subscriptionOverlay.submitEmailForReachYourGoals();
        subscriptionOverlay.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Improve focus'")
    public void i_enter_my_email_address_for_improve_focus() {
        subscriptionOverlay.fillEmailFieldForImproveFocus("onagiantsshoulder@gmail.com");
        subscriptionOverlay.submitEmailForImproveFocus();
        subscriptionOverlay.waitForVisibilityOfEmailValidatedPopup();
    }
}
