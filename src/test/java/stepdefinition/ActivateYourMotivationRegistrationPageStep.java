package stepdefinition;

import com.giantshoulder.pageobject.ActivateYourMotivationRegistrationThirtyMinutesCoursePage;
import com.giantshoulder.pageobject.ActivateYourMotivationRegistrationTwentyMinutesCoursePage;
import cucumber.api.java.en.When;

public class ActivateYourMotivationRegistrationPageStep extends BaseStepDefinition {

    private static final String urlFragmentForTwentyMinutesCourse = "aym-registration-9?";
    private final ActivateYourMotivationRegistrationThirtyMinutesCoursePage activeForThirty = new ActivateYourMotivationRegistrationThirtyMinutesCoursePage(driver);
    private final ActivateYourMotivationRegistrationTwentyMinutesCoursePage activeForTwenty = new ActivateYourMotivationRegistrationTwentyMinutesCoursePage(driver);

    @When("I enter my name and e-mail address and select 'Watch yesterday's broadcast now'")
    public void i_enter_my_name_and_email_address_and_select_watch_yesterdays_broadcast_now() {
        String url = driver.getCurrentUrl();
        if (url.contains(urlFragmentForTwentyMinutesCourse)) {
            activeForTwenty.waitForRegistrationPanelTwentyMinutes();
            activeForTwenty.fillNameFieldWith("My Name");
            activeForTwenty.fillEmailFieldWith("onagiantsshoulder@gmail.com");
            activeForTwenty.fromDropdownSelect("Watch Yesterday's Broadcast Now");
            activeForTwenty.clickOnRegisterButtonTwentyMinutes();
        } else {
            activeForThirty.waitForRegistrationPanelThirtyMinutes();
            activeForThirty.fillNameFieldWith("My Name");
            activeForThirty.fillEmailFieldWith("onagiantsshoulder@gmail.com");
            activeForThirty.fromDropdownSelect("Watch Yesterday's Broadcast Now");
            activeForThirty.clickOnRegisterButtonThirtyMinutes();
        }
    }
}
