package stepdefinition;

import com.giantshoulder.pageobject.FreeClassesPage;
import cucumber.api.java.en.Given;

public class FreeClassesStep extends BaseStepDefinition {

    FreeClassesPage freeClassesPage = new FreeClassesPage(driver);

    @Given("I choose 'Activate Your Motivation' course")
    public void i_choose_activate_your_motivation_course() {
        freeClassesPage.clickOnJumpstartMyMotivatonButton();
    }
}
