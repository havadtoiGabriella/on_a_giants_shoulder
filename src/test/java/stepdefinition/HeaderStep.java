package stepdefinition;

import com.giantshoulder.pageobject.Header;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeaderStep extends BaseStepDefinition {
    private final Header header = new Header(driver);

    @When("I hover over the page logo")
    public void i_hover_over_the_page_logo() {
        header.hoverOverPageLogo();
    }

    @Then("the page logo url should point to the home page")
    public void the_page_logo_url_should_point_to_the_home_page() {
        header.checkIfLogosUrlPointsToTheHomaPage();
    }

    @When("I hover over the {string} menu item")
    public void i_hover_over_the_x_menu_item(String menuItem) {
        header.hoverOverMenuElement(menuItem);
    }

    @Then("{string} menu item {string} url should point to the right page")
    public void x_menu_item_url_should_point_to_the_right_page(String menuItem, String url) {
        header.checkIfUrlPointsToTheRightPage(menuItem, url);
    }
}
