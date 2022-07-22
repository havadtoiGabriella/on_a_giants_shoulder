package stepdefinition;

import com.giantshoulder.pageobject.SuccessfulSubscriptionPage;
import cucumber.api.java.en.Then;

/**
 * @author Gabriella_Havadtoi
 */
public class SuccessfulSubscriptionStep extends BaseStepDefinition {

    SuccessfulSubscriptionPage successfulSubscriptionPage = new SuccessfulSubscriptionPage(driver);

    @Then("I should get a successful subscription {string} for learn faster")
    public void i_should_get_a_successful_subscription_message_for_learn_faster(String message) {
        successfulSubscriptionPage.validateSuccessMessageFor("Learn faster", message);
    }

    @Then("I should get a successful subscription {string} for stop procrastinating")
    public void i_should_get_a_successful_subscription_message_for_stop_procrastinating(String message) {
        successfulSubscriptionPage.validateSuccessMessageFor("Stop procrastinating", message);
    }

    @Then("I should get a successful subscription {string} for reach your goals")
    public void i_should_get_a_successful_subscription_message_for_reach_your_goals(String message) {
        successfulSubscriptionPage.validateSuccessMessageFor("Reach your goals", message);
    }

    @Then("I should get a successful subscription {string} for improve focus")
    public void i_should_get_a_successful_subscription_message_for_improve_focus(String message) {
        successfulSubscriptionPage.validateSuccessMessageFor("Improve focus", message);
    }
}
