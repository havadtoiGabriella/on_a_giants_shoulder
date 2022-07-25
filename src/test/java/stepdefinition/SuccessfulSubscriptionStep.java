package stepdefinition;

import cucumber.api.java.en.Then;

public class SuccessfulSubscriptionStep extends BaseStepDefinition {

    private final SuccessfulSubscriptionPage successfulSubscriptionPage = new SuccessfulSubscriptionPage(driver);

    @Then("I should get a successful subscription {string} for learn faster")
    public void i_should_get_a_successful_subscription_message_for_learn_faster(String message) {
        successfulSubscriptionPage.validateSuccessMessageForLearnFaster(message);
    }

    @Then("I should get a successful subscription {string} for stop procrastinating")
    public void i_should_get_a_successful_subscription_message_for_stop_procrastinating(String message) {
        successfulSubscriptionPage.validateSuccessMessageForStopProcrastinating(message);
    }

    @Then("I should get a successful subscription {string} for reach your goals")
    public void i_should_get_a_successful_subscription_message_for_reach_your_goals(String message) {
        successfulSubscriptionPage.validateSuccessMessageForReachYourGoals(message);
    }

    @Then("I should get a successful subscription {string} for improve focus")
    public void i_should_get_a_successful_subscription_message_for_improve_focus(String message) {
        successfulSubscriptionPage.validateSuccessMessageForImproveFocus(message);
    }
}
