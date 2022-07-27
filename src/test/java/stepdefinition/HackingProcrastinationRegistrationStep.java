package stepdefinition;

import com.giantshoulder.pageobject.HackingProcrastinationRegistrationPage;
import cucumber.api.java.en.When;

public class HackingProcrastinationRegistrationStep extends BaseStepDefinition {

    private final HackingProcrastinationRegistrationPage hackProcrastinationPage = new HackingProcrastinationRegistrationPage(driver);

    @When("I enter my name and e-mail address")
    public void i_enter_my_name_and_email_address() {
        hackProcrastinationPage.fillNameFieldWith("My name");
        hackProcrastinationPage.fillEmailFieldWith("onagiantsshoulder@gmail.com");
        hackProcrastinationPage.clickOnRegisterButton();
    }
}
