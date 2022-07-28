package stepdefinition;

import com.giantshoulder.pageobject.learninggenius.SparkYourLearningGeniusCourseVideoPage;
import cucumber.api.java.en.Then;

public class SparkYourLearningGeniusCourseVideoPageStep extends BaseStepDefinition {
    private final SparkYourLearningGeniusCourseVideoPage sparkYourLearningGeniusCourseVideoPage = new SparkYourLearningGeniusCourseVideoPage(driver);

    @Then("I should see the 'Spark Your Learning Genius' course video")
    public void i_should_see_the_spark_your_learning_genius_video() {
        sparkYourLearningGeniusCourseVideoPage.validatingIfCorrectVideoIsDisplayed();
    }
}
