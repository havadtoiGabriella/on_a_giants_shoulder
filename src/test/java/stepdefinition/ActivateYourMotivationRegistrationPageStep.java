package stepdefinition;

import com.giantshoulder.pageobject.ActivateYourMotivationRegistrationPage;
import cucumber.api.java.en.When;

public class ActivateYourMotivationRegistrationPageStep extends BaseStepDefinition {

    ActivateYourMotivationRegistrationPage activeMotivationPage = new ActivateYourMotivationRegistrationPage(driver);

    @When("I enter my name and e-mail address and select 'Watch yesterday's broadcast now'")
    public void i_enter_my_name_and_email_address_and_select_watch_yesterdays_broadcast_now() {
        activeMotivationPage.waitForRegistrationPanel();
        activeMotivationPage.fillNameFieldWith("My Name");
        activeMotivationPage.fillEmailFieldWith("onagiantsshoulder@gmail.com");
        activeMotivationPage.fromDropdownSelect("Watch yesterday's broadcast now");
    }
}
