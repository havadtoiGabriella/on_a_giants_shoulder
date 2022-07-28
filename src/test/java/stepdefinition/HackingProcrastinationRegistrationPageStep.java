package stepdefinition;

import com.giantshoulder.pageobject.procrastination.HackingProcrastinationCourseRegistrationPage;
import cucumber.api.java.en.When;

public class HackingProcrastinationRegistrationPageStep extends BaseStepDefinition {
    private final HackingProcrastinationCourseRegistrationPage hackProcrastinationPage = new HackingProcrastinationCourseRegistrationPage(driver);

    @When("I register for the 'Hacking Procrastination' course")
    public void i_register_for_the_hacking_procrastination_course() {
        hackProcrastinationPage.registerUser("My name", "onagiantsshoulder@gmail.com");
    }
}
