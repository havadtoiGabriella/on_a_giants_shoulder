package stepdefinition;

import com.giantshoulder.pageobject.learninggenius.SuperchargeMentalAbilityCourseRegistrationPage;
import cucumber.api.java.en.When;

public class SuperchargeMentalAbilityRegistrationPageStep extends BaseStepDefinition {
    SuperchargeMentalAbilityCourseRegistrationPage superchargeMentalAbilityCourseRegistrationPage
            = new SuperchargeMentalAbilityCourseRegistrationPage(driver);

    @When("I register for the 'Supercharge Your Mental Ability with 3 Simple Principles' course")
    public void i_register_for_the_supercharge_mental_ability_course() {
        superchargeMentalAbilityCourseRegistrationPage.registerUser("My Name", "onagiantsshoulder@gmail.com", "Watch Yesterday's Broadcast Now");
    }
}
