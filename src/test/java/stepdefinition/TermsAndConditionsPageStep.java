package stepdefinition;

import com.giantshoulder.pageobject.TermsAndConditionsPage;
import cucumber.api.java.en.Then;

public class TermsAndConditionsPageStep extends BaseStepDefinition {
    private final TermsAndConditionsPage termsAndConditionsPage = new TermsAndConditionsPage(driver);

    @Then("the page for Terms and Conditions should open")
    public void the_page_for_terms_and_conditions_should_open() {
        termsAndConditionsPage.checkIfTermsAndConditionsPageOpenedCorrectly();
    }
}
