package stepdefinition;

import com.giantshoulder.pageobject.ActivateYourMotivationRegistrationPageGirls;
import cucumber.api.java.en.When;

public class ActivateYourMotivationRegistrationPageStep extends BaseStepDefinition {

    private static final String urlFragmentGirls = "aym-registration-v2";
    private final ActivateYourMotivationRegistrationPageGirls activeMotivationPage = new ActivateYourMotivationRegistrationPageGirls(driver);

    @When("I enter my name and e-mail address and select 'Watch yesterday's broadcast now'")
    public void i_enter_my_name_and_email_address_and_select_watch_yesterdays_broadcast_now() {
        String url = driver.getCurrentUrl();
        if (url.contains(urlFragmentGirls)) {
            activeMotivationPage.waitForRegistrationPanel();
        } else {
            activeMotivationPage.waitForRegistrationPanelGuy();
        }
        activeMotivationPage.fillNameFieldWith("My Name");
        activeMotivationPage.fillEmailFieldWith("onagiantsshoulder@gmail.com");
        activeMotivationPage.fromDropdownSelect("Watch Yesterday's Broadcast Now");
        if (url.contains(urlFragmentGirls)) {
            activeMotivationPage.clickOnRegisterButton();
        } else {
            activeMotivationPage.clickOnRegisterButtonGuy();
        }
    }
}