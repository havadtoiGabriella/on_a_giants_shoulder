package stepdefinition;

import com.giantshoulder.pageobject.procrastination.HackingProcrastinationCourseRegistrationPage;
import com.giantshoulder.registrationdatatype.RegistrationData;
import cucumber.api.java.en.When;

public class HackingProcrastinationRegistrationPageStep extends BaseStepDefinition {
    private final HackingProcrastinationCourseRegistrationPage hackProcrastinationPage = new HackingProcrastinationCourseRegistrationPage(driver);

    @When("I register for the 'Hacking Procrastination' course with {}")
    public void i_register_for_the_hacking_procrastination_course(RegistrationData user) {
        hackProcrastinationPage.registerUser(user);
    }
}
