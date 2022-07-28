package stepdefinition;

import com.giantshoulder.pageobject.learninggenius.SparkYourLearningGeniusCourseRegistrationPage;
import cucumber.api.java.en.When;

public class SparkYourLearningGeniusRegistrationPageStep extends BaseStepDefinition {

    SparkYourLearningGeniusCourseRegistrationPage sparkYourLearningGeniusCourseRegistrationPage
            = new SparkYourLearningGeniusCourseRegistrationPage(driver);

    @When("I register for the 'Spark Your Learning Genius' course")
    public void i_register_for_the_spark_your_learning_genius_course() {
        sparkYourLearningGeniusCourseRegistrationPage.registerUser("My Name", "onagiantsshoulder@gmail.com", "Watch Yesterday's Broadcast Now");
    }
}
