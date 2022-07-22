package stepdefinition;

import com.giantshoulder.pageobject.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

/**
 * @author Gabriella_Havadtoi
 */
public class BackgroundStep extends BaseStepDefinition {

    MainPage mainPage = new MainPage(driver);

    @Given("I navigate to the main page")
    public void i_navigate_to_main_page() {
        driver.navigate().to(BASE_URL);
    }

    @And("I accept the data handling dialog box")
    public void i_accept_the_data_handling_dialog_box() {
        mainPage.acceptDataConsentPanel();
    }

    @And("I click on the Subscribe button")
    public void i_click_on_the_subscribe_button() {
        mainPage.clickOnSubscribeButton();
    }
}
