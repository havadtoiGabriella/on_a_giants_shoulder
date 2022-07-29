package stepdefinition;

import com.giantshoulder.pageobject.learninggenius.SparkYourLearningGeniusCourseRegistrationPage;
import com.giantshoulder.registrationdatatype.RegistrationDataType;
import cucumber.api.java.en.When;

public class SparkYourLearningGeniusRegistrationPageStep extends BaseStepDefinition {
    private final SparkYourLearningGeniusCourseRegistrationPage sparkYourLearningGeniusCourseRegistrationPage
            = new SparkYourLearningGeniusCourseRegistrationPage(driver);

    @When("I register for the 'Spark Your Learning Genius' course with {registrationDataType}")
    public void i_register_for_the_spark_your_learning_genius_course(RegistrationDataType USER) {
        sparkYourLearningGeniusCourseRegistrationPage.registerUser(USER.getName(), USER.getEmail(), "Watch Yesterday's Broadcast Now");
    }
}
