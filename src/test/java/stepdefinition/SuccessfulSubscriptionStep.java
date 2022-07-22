package stepdefinition;

import com.giantshoulder.pageobject.SuccessfulSubscriptionPage;
import cucumber.api.java.en.Then;

/**
 * @author Gabriella_Havadtoi
 */
public class SuccessfulSubscriptionStep extends BaseStepDefinition {

    SuccessfulSubscriptionPage successfulSubscriptionPage = new SuccessfulSubscriptionPage(driver);

    @Then("I should get a successful subscription message for learn faster")
    public void i_should_get_a_successful_subscription_message_for_learn_faster() {
        String message = " Your email is confirmed and the FREE download will arrive in your inbox shortly.";
        successfulSubscriptionPage.validateSuccessMessageFor("Learn faster", message);
    }

    @Then("I should get a successful subscription message for stop procrastinating")
    public void i_should_get_a_successful_subscription_message_for_stop_procrastinating() {
        String message = " Your email is confirmed and the FREE download will arrive in your inbox shortly.";
        successfulSubscriptionPage.validateSuccessMessageFor("Stop procrastinating", message);
    }

    @Then("I should get a successful subscription message for reach your goals")
    public void i_should_get_a_successful_subscription_message_for_reach_your_goals() {
        String message = "Thanks for Subscribing!";
        successfulSubscriptionPage.validateSuccessMessageFor("Reach your goals", message);
    }

    @Then("I should get a successful subscription message for improve focus")
    public void i_should_get_a_successful_subscription_message_for_improve_focus() {
        String message = "Thanks for Subscribing!";
        successfulSubscriptionPage.validateSuccessMessageFor("Improve focus", message);
    }

}
