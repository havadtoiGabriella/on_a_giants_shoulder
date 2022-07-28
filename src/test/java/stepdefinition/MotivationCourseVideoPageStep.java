package stepdefinition;

import com.giantshoulder.pageobject.motivation.MotivationCourseVideoPage;
import cucumber.api.java.en.Then;

public class MotivationCourseVideoPageStep extends BaseStepDefinition {
    private final MotivationCourseVideoPage motivationCourseVideoPage = new MotivationCourseVideoPage(driver);

    @Then("I should see the 'Activate Your Motivation' course video")
    public void i_should_see_the_activate_your_motivation_course_video() {
        motivationCourseVideoPage.validatingIfCorrectVideoIsDisplayed();
    }
}
