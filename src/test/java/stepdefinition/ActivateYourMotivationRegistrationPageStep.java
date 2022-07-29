package stepdefinition;

import com.giantshoulder.pageobject.motivation.ActivateYourMotivationCourseRegistrationPage;
import com.giantshoulder.pagetype.RegistrationDataType;
import cucumber.api.java.en.When;

public class ActivateYourMotivationRegistrationPageStep extends BaseStepDefinition {
    private final ActivateYourMotivationCourseRegistrationPage activateYourMotivationPage = new ActivateYourMotivationCourseRegistrationPage(driver);

    @When("I register for the 'Activate Your Motivation' course with <name> and <email>")
    public void i_register_for_the_activate_your_motivation_course_with_x_and_y(String name, String email, String option) {
        activateYourMotivationPage.registerUser(name, email, "Watch Yesterday's Broadcast Now");
    }
}
