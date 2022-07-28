package stepdefinition;

import com.giantshoulder.pageobject.ActivateYourMotivationCourseRegistrationPage;
import com.giantshoulder.pageobject.SparkYourMotivationCourseRegistrationPage;
import cucumber.api.java.en.When;

public class ActivateYourMotivationRegistrationPageStep extends BaseStepDefinition {
    private final String url = driver.getCurrentUrl();
    private final ActivateYourMotivationCourseRegistrationPage activateYourMotivationPage = new ActivateYourMotivationCourseRegistrationPage(driver);
    private final SparkYourMotivationCourseRegistrationPage activeForTwenty = new SparkYourMotivationCourseRegistrationPage(driver);

    @When("I register for the 'Activate Your Motivation' course")
    public void i_register_for_the_activate_your_motivation_course() {
        activateYourMotivationPage.registerUser("My Name", "onagiantsshoulder@gmail.com", "Watch Yesterday's Broadcast Now");
    }
}
