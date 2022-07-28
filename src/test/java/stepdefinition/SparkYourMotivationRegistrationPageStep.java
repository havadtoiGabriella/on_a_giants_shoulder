package stepdefinition;

import com.giantshoulder.pageobject.motivation.SparkYourMotivationCourseRegistrationPage;
import cucumber.api.java.en.When;

public class SparkYourMotivationRegistrationPageStep extends BaseStepDefinition {
    private final SparkYourMotivationCourseRegistrationPage sparkYourMotivationCourseRegistrationPage
            = new SparkYourMotivationCourseRegistrationPage(driver);

    @When("I register for the '3 Steps To Spark Your Motivation And Take Action... ' course")
    public void i_register_for_the_3_steps_to_spark_your_motivation_course() {
        sparkYourMotivationCourseRegistrationPage.registerUser("My Name", "onagiantsshoulder@gmail.com", "Watch Yesterday's Broadcast Now");
    }
}
