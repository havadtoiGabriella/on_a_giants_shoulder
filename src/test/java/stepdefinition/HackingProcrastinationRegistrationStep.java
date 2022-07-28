package stepdefinition;

import com.giantshoulder.pageobject.HackingProcrastinationCourseRegistrationPage;
import cucumber.api.java.en.When;

public class HackingProcrastinationRegistrationStep extends BaseStepDefinition {
    private final HackingProcrastinationCourseRegistrationPage hackProcrastinationPage = new HackingProcrastinationCourseRegistrationPage(driver);

    @When("I register for the 'Hacking Procrastination' course")
    public void i_register_for_the_hacking_procrastination_course() {
        hackProcrastinationPage.registerUser("My name", "onagiantsshoulder@gmail.com");
    }
}
