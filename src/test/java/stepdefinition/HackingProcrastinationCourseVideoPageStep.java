package stepdefinition;

import com.giantshoulder.pageobject.HackingProcrastinationCourseVideoPage;
import cucumber.api.java.en.Then;

public class HackingProcrastinationCourseVideoPageStep extends BaseStepDefinition{
    public final HackingProcrastinationCourseVideoPage hackingProcrastinationCourseVideoPage = new HackingProcrastinationCourseVideoPage(driver);

    @Then("I should see the 'Hacking Procrastination' course video")
    public void i_should_see_the_hacking_procrastination_course_video() {
        hackingProcrastinationCourseVideoPage.validatingIfCorrectVideoIsDisplayed();
    }
}
