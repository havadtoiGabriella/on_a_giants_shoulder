package stepdefinition;

import com.giantshoulder.pageobject.HackingProcrastinationRegistrationPage;
import cucumber.api.java.en.When;

public class HackingProcrastinationRegistrationStep extends BaseStepDefinition {

    private final HackingProcrastinationRegistrationPage hackProcrastinatonPage = new HackingProcrastinationRegistrationPage(driver);

    @When("I enter my name and e-mail address")
    public void i_enter_my_name_and_email_address() {
        hackProcrastinatonPage.fillNameFieldWith("My name");
        hackProcrastinatonPage.fillEmailFieldWith("onagiantsshoulder@gmail.com");
        hackProcrastinatonPage.clickOnRegisterButton();
    }
}
