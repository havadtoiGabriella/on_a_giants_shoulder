package stepdefinition;

import com.giantshoulder.pageobject.CourseVideoPage;
import cucumber.api.java.en.Then;

public class VideoPageStep extends BaseStepDefinition {

    private final CourseVideoPage courseVideoPage = new CourseVideoPage(driver);

    @Then("I should see the course video")
    public void i_should_see_the_course_video() {
        courseVideoPage.waitForVideoToBeDisplayed();
    }
}
