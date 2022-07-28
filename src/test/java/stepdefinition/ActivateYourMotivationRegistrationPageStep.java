package stepdefinition;

import com.giantshoulder.pageobject.motivation.ActivateYourMotivationCourseRegistrationPage;
import cucumber.api.java.en.When;

public class ActivateYourMotivationRegistrationPageStep extends BaseStepDefinition {
    private final ActivateYourMotivationCourseRegistrationPage activateYourMotivationPage = new ActivateYourMotivationCourseRegistrationPage(driver);

    @When("I register for the 'Activate Your Motivation' course")
    public void i_register_for_the_activate_your_motivation_course() {
        activateYourMotivationPage.registerUser("My Name", "onagiantsshoulder@gmail.com", "Watch Yesterday's Broadcast Now");
    }
}
