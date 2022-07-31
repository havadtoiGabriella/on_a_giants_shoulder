package stepdefinition;

import com.giantshoulder.pageobject.HomePage;
import com.giantshoulder.pagetype.PageType;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePageStep extends BaseStepDefinition {
    private final HomePage homePage = new HomePage(driver);

    @Given("I navigate to the {pageType} blog page")
    public void i_navigate_to_the_x_blog_page(PageType pageType) {
        homePage.navigateToPage(pageType);
    }

    @And("I accept the data handling dialog box")
    public void i_accept_the_data_handling_dialog_box() {
        homePage.acceptDataConsentPanel();
    }
}
