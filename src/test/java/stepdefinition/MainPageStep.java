package stepdefinition;

import com.giantshoulder.pageobject.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * @author Gabriella_Havadtoi
 */

public class MainPageStep extends BaseStepDefinition {

    MainPage mainPage = new MainPage(driver);

    @And("I choose 'Learn faster' newsletter")
    public void i_chose_learn_faster_newsletter_types() {
        mainPage.clickOnNewsLetterButtonFor("learn faster");
    }

    @And("I choose 'Stop procrastinating' newsletter")
    public void i_chose_stop_procrastinating_types() {
        mainPage.clickOnNewsLetterButtonFor("stop procrastinating");
    }

    @And("I choose 'Reach your goals' newsletter")
    public void i_chose_reach_your_goals_newsletter_types() {
        mainPage.clickOnNewsLetterButtonFor("reach your goals");
    }

    @And("I choose 'Improve focus' newsletter")
    public void i_chose_improve_focus_newsletter_types() {
        mainPage.clickOnNewsLetterButtonFor("improve focus");
    }

    @When("I enter my e-mail address for 'Learn faster'")
    public void i_enter_my_email_address_for_learn_faster() {
        mainPage.fillEmailFieldFor("learn faster", "sample@gmail.com");
        mainPage.submitEmailFor("learn faster");
        mainPage.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Stop procrastinating'")
    public void i_enter_my_email_address_for_stop_procrastinating() {
        mainPage.fillEmailFieldFor("stop procrastinating", "sample@gmail.com");
        mainPage.submitEmailFor("stop procrastinating");
        mainPage.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Reach your goals'")
    public void i_enter_my_email_address_for_reach_your_goals() {
        mainPage.fillEmailFieldFor("reach your goals", "sample@gmail.com");
        mainPage.submitEmailFor("reach your goals");
        mainPage.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Improve focus'")
    public void i_enter_my_email_address_for_improve_focus() {
        mainPage.fillEmailFieldFor("improve focus", "sample@gmail.com");
        mainPage.submitEmailFor("improve focus");
        mainPage.waitForVisibilityOfEmailValidatedPopup();
    }
}
