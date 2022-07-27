package stepdefinition;

import com.giantshoulder.pageobject.SparkYourLearningGeniusPage;
import cucumber.api.java.en.When;

public class SparkYourLearningGeniusPageStep extends BaseStepDefinition {

    private final SparkYourLearningGeniusPage sparkYourLearningGeniusPage = new SparkYourLearningGeniusPage(driver);

    @When("I enter my name and my e-mail address and select 'Watch yesterday's broadcast now'")
    public void i_enter_my_name_and_my_email_address_and_select_watch_yesterdays_broadcast_now() {
        sparkYourLearningGeniusPage.waitForRegistrationPanel();
        sparkYourLearningGeniusPage.fillNameFieldWith("My Name");
        sparkYourLearningGeniusPage.fillEmailFieldWith("onagiantsshoulder@gmail.com");
        sparkYourLearningGeniusPage.fromDropdownSelect("Watch Yesterday's Broadcast Now");
        sparkYourLearningGeniusPage.clickOnRegisterButton();
    }
}
