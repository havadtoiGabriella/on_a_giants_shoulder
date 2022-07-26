package stepdefinition;

import com.giantshoulder.pageobject.FreeClassesPage;
import cucumber.api.java.en.Given;

public class FreeClassesStep extends BaseStepDefinition {

    private final FreeClassesPage freeClassesPage = new FreeClassesPage(driver);

    @Given("I choose 'Activate Your Motivation' course")
    public void i_choose_activate_your_motivation_course() {
        freeClassesPage.clickOnJumpstartMyMotivationButton();
    }

    @Given("I choose 'Hacking Procrastination 4-Day Workshop' course")
    public void i_choose_hacking_procrastination_course() {
        freeClassesPage.clickOnJEliminateProcrastinationButton();
    }

    @Given("I choose 'Spark Your Learning Genius' course")
    public void i_choose_spark_your_learning_genius_course() {
        freeClassesPage.clickOnBoostMyLearningPowerButton();
    }
}
