package stepdefinition;

import com.giantshoulder.pageobject.motivation.SparkYourMotivationCourseRegistrationPage;
import com.giantshoulder.registrationdatatype.RegistrationDataType;
import cucumber.api.java.en.When;

public class SparkYourMotivationRegistrationPageStep extends BaseStepDefinition {
    private final SparkYourMotivationCourseRegistrationPage sparkYourMotivationCourseRegistrationPage
            = new SparkYourMotivationCourseRegistrationPage(driver);

    @When("I register for the '3 Steps To Spark Your Motivation' course with {registrationDataType}")
    public void i_register_for_the_3_steps_to_spark_your_motivation_course(RegistrationDataType USER) {
        sparkYourMotivationCourseRegistrationPage.registerUser(USER.getName(), USER.getEmail(), USER.getDate());
    }
}