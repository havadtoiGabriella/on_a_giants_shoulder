package stepdefinition;

import com.giantshoulder.pageobject.ActivateYourMotivationCourseRegistrationPage;
import com.giantshoulder.pageobject.SparkYourMotivationCourseRegistrationPage;
import cucumber.api.java.en.When;

public class ActivateYourMotivationRegistrationPageStep extends BaseStepDefinition {
    private final String url = driver.getCurrentUrl();
    private final ActivateYourMotivationCourseRegistrationPage activateYourMotivationPage = new ActivateYourMotivationCourseRegistrationPage(driver);
    private final SparkYourMotivationCourseRegistrationPage activeForTwenty = new SparkYourMotivationCourseRegistrationPage(driver);

/*    @When("I enter my name and e-mail address and select 'Watch yesterday's broadcast now'")
    public void i_enter_my_name_and_email_address_and_select_watch_yesterdays_broadcast_now() {
        if (url.contains(activeForTwenty.getUrlForTwentyMinutesCourse())) {
            activeForTwenty.waitForRegistrationPanelTwentyMinutes();
            activeForTwenty.fillNameFieldWith("My Name");
            activeForTwenty.fillEmailFieldWith("onagiantsshoulder@gmail.com");
            activeForTwenty.fromDropdownSelect("Watch Yesterday's Broadcast Now");
            activeForTwenty.clickOnRegisterButtonTwentyMinutes();
        }
    }*/

    @When("I register for the 'Activate Your Motivation' course")
    public void i_register_for_the_activate_your_motivation_course() {
        activateYourMotivationPage.registerUser("My Name", "onagiantsshoulder@gmail.com", "Watch Yesterday's Broadcast Now");
    }
}
