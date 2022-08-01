package stepdefinition;

import com.giantshoulder.pageobject.PrivacyPolicyPage;
import cucumber.api.java.en.Then;

public class PrivacyPolicyPageStep extends BaseStepDefinition {
    PrivacyPolicyPage privacyPolicyPage = new PrivacyPolicyPage(driver);

    @Then("the page for Privacy Policy should open")
    public void the_page_for_privacy_policy_should_open() {
        privacyPolicyPage.checkIfPrivacyPolicyPageOpenedCorrectly();
    }
}
