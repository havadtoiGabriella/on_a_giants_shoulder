package stepdefinition;

import com.giantshoulder.pageobject.motivation.ActivateYourMotivationCourseRegistrationPage;
import com.giantshoulder.registrationdatatype.RegistrationDataType;
import cucumber.api.java.en.When;

public class ActivateYourMotivationRegistrationPageStep extends BaseStepDefinition {
    private final ActivateYourMotivationCourseRegistrationPage activateYourMotivationPage = new ActivateYourMotivationCourseRegistrationPage(driver);

    @When("I register for the 'Activate Your Motivation' course with {registrationDataType}")
    public void i_register_for_the_activate_your_motivation_course(RegistrationDataType USER) {
        activateYourMotivationPage.registerUser(USER.getName(), USER.getEmail(), "Watch Yesterday's Broadcast Now");
    }
}
