package stepdefinition;

import com.giantshoulder.pageobject.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class BackgroundStep extends BaseStepDefinition {

    private final HomePage homePage = new HomePage(driver);

    @Given("I navigate to the main page")
    public void i_navigate_to_main_page() {
        driver.navigate().to(BASE_URL);
    }

    @And("I accept the data handling dialog box")
    public void i_accept_the_data_handling_dialog_box() {
        homePage.acceptDataConsentPanel();
    }

    @And("I click on the Subscribe button")
    public void i_click_on_the_subscribe_button() {
        homePage.clickOnSubscribeButton();
    }
}
