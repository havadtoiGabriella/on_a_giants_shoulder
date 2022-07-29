package stepdefinition;

import com.giantshoulder.pageobject.learninggenius.SuperchargeMentalAbilityCourseRegistrationPage;
import com.giantshoulder.registrationdatatype.RegistrationDataType;
import cucumber.api.java.en.When;

public class SuperchargeMentalAbilityRegistrationPageStep extends BaseStepDefinition {
    private final SuperchargeMentalAbilityCourseRegistrationPage superchargeMentalAbilityCourseRegistrationPage
            = new SuperchargeMentalAbilityCourseRegistrationPage(driver);

    @When("I register for the 'Supercharge Your Mental Ability' course with {registrationDataType}")
    public void i_register_for_the_supercharge_mental_ability_course(RegistrationDataType USER) {
        superchargeMentalAbilityCourseRegistrationPage.registerUser(USER.getName(), USER.getEmail(), USER.getDate());
    }
}