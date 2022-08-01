package stepdefinition;

import com.giantshoulder.pageobject.Header;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HeaderStep extends BaseStepDefinition {
    private final Header header = new Header(driver);

    @When("I hover over the page logo")
    public void i_hover_over_the_page_logo() {
        header.hoverOverPageLogo();
    }

    @Then("the page logo url should point to the Home Page")
    public void the_page_logo_url_should_point_to_the_home_page() {
        header.checkIfLogoUrlPointsToTheHomaPage();
    }

    @When("I hover over the {string} navbar menu item")
    public void i_hover_over_the_x_navbar_menu_item(String menuItem) {
        header.hoverOverMenuElement(menuItem);
    }

    @Then("{string} navbar menu item {string} url should point to the right page")
    public void x_navbar_menu_item_y_url_should_point_to_the_right_page(String menuItem, String url) {
        header.checkIfNavbarMenuItemUrlPointsToTheRightPage(menuItem, url);
    }

    @Then("a dropdown for {string} should open with the menu items")
    public void a_dropdown_should_open_with_the_menu_items(String navbarMenuItem) {
        header.checkIfDropDownIsOpenFor(navbarMenuItem);
    }

    @And("dropdown {string} menu item {string} url should point to the right page")
    public void dropdown_x_menu_item_y_url_should_point_to_the_right_page(String menuItem, String url) {
        header.checkIfDropdownItemUrlPointsToTheRightPage(menuItem, url);
    }

    @When("I wait until the page is fully loaded")
    public void i_wait_until_the_page_is_fully_loaded() {
        header.waitForSubscribeButtonToBeVisible();
    }

    @Then("the Subscribe button should be displayed")
    public void the_subscribe_button_should_be_displayed() {
        header.checkIfSubscribeButtonIsDisplayed();
    }
}
