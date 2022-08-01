package stepdefinition;

import com.giantshoulder.pageobject.Footer;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FooterStep extends BaseStepDefinition {
    private final Footer footer = new Footer(driver);

    @When("I hover over the {string} main footer menu item")
    public void i_hover_over_the_x_main_footer_menu_item(String mainMenuItem) {
        footer.hoverOverMainMenuItem(mainMenuItem);
    }

    @Then("{string} main menu item {string} url should point to the right page")
    public void menu_item_url_should_point_to_the_right_page(String mainMenuItem, String url) {
        footer.checkIfFooterMainMenuItemUrlPointsToTheRightPage(mainMenuItem, url);
    }

    @When("I hover over the {string} sub-menu item")
    public void i_hover_over_the_main_menu_item_sub_menu_item(String subMenuItem) {
        footer.hoverOverSubMenuItem(subMenuItem);
    }

    @Then("{string} sub-menu item {string} url should point to the right page")
    public void subMenuItemUrlShouldPointToTheRightPage(String subMenuItem, String url) {
        footer.checkIfSubMenuItemUrlPointsToTheRightPage(subMenuItem, url);
    }
}
