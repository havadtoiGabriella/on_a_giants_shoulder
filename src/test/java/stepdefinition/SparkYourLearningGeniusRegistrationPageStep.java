package stepdefinition;

import com.giantshoulder.pageobject.SparkYourLearningGeniusCourseRegistrationPage;
import cucumber.api.java.en.When;

public class SparkYourLearningGeniusRegistrationPageStep extends BaseStepDefinition {

    private final SparkYourLearningGeniusCourseRegistrationPage sparkYourLearningGeniusCourseRegistrationPage = new SparkYourLearningGeniusCourseRegistrationPage(driver);

    @When("I enter my name and my e-mail address and select 'Watch yesterday's broadcast now'")
    public void i_enter_my_name_and_my_email_address_and_select_watch_yesterdays_broadcast_now() {
        sparkYourLearningGeniusCourseRegistrationPage.waitForRegistrationPanel();
        sparkYourLearningGeniusCourseRegistrationPage.fillNameFieldWith("My Name");
        sparkYourLearningGeniusCourseRegistrationPage.fillEmailFieldWith("onagiantsshoulder@gmail.com");
        sparkYourLearningGeniusCourseRegistrationPage.fromDropdownSelect("Watch Yesterday's Broadcast Now");
        sparkYourLearningGeniusCourseRegistrationPage.clickOnRegisterButton();
    }
}
