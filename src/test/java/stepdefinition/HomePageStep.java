package stepdefinition;

import com.giantshoulder.pageobject.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class HomePageStep extends BaseStepDefinition {

    HomePage homePage = new HomePage(driver);

    @And("I choose 'Learn faster' newsletter")
    public void i_chose_learn_faster_newsletter_types() {
        homePage.clickOnNewsLetterButtonFor("learn faster");
    }

    @And("I choose 'Stop procrastinating' newsletter")
    public void i_chose_stop_procrastinating_types() {
        homePage.clickOnNewsLetterButtonFor("stop procrastinating");
    }

    @And("I choose 'Reach your goals' newsletter")
    public void i_chose_reach_your_goals_newsletter_types() {
        homePage.clickOnNewsLetterButtonFor("reach your goals");
    }

    @And("I choose 'Improve focus' newsletter")
    public void i_chose_improve_focus_newsletter_types() {
        homePage.clickOnNewsLetterButtonFor("improve focus");
    }

    @When("I enter my e-mail address for 'Learn faster'")
    public void i_enter_my_email_address_for_learn_faster() {
        homePage.fillEmailFieldFor("learn faster", "onagiantsshoulder@gmail.com");
        homePage.submitEmailFor("learn faster");
        homePage.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Stop procrastinating'")
    public void i_enter_my_email_address_for_stop_procrastinating() {
        homePage.fillEmailFieldFor("stop procrastinating", "onagiantsshoulder@gmail.com");
        homePage.submitEmailFor("stop procrastinating");
        homePage.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Reach your goals'")
    public void i_enter_my_email_address_for_reach_your_goals() {
        homePage.fillEmailFieldFor("reach your goals", "onagiantsshoulder@gmail.com");
        homePage.submitEmailFor("reach your goals");
        homePage.waitForVisibilityOfEmailValidatedPopup();
    }

    @When("I enter my e-mail address for 'Improve focus'")
    public void i_enter_my_email_address_for_improve_focus() {
        homePage.fillEmailFieldFor("improve focus", "onagiantsshoulder@gmail.com");
        homePage.submitEmailFor("improve focus");
        homePage.waitForVisibilityOfEmailValidatedPopup();
    }
}
