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
    public void x_menu_item_y_url_should_point_to_the_right_page(String mainMenuItem, String url) {
        footer.checkIfFooterMainMenuItemUrlPointsToTheRightPage(mainMenuItem, url);
    }

    @When("I hover over the {string} sub-menu item")
    public void i_hover_over_the_x_sub_menu_item(String subMenuItem) {
        footer.hoverOverSubMenuItem(subMenuItem);
    }

    @Then("{string} sub-menu item {string} url should point to the right page")
    public void x_sub_menu_item_y_url_should_point_to_the_right_page(String subMenuItem, String url) {
        footer.checkIfSubMenuItemUrlPointsToTheRightPage(subMenuItem, url);
    }

    @When("I hover over the {string} link")
    public void i_hover_over_x_the_link(String socialLink) {
        footer.hoverOverSocialLink(socialLink);
    }

    @Then("{string} link {string} url should point to the right page")
    public void x_link_y_url_should_point_to_the_right_page(String socialLink, String url) {
        footer.checkIfSocialLinkUrlPointsToTheRightPage(socialLink, url);
    }

    @When("I click on the Terms and Conditions link")
    public void i_click_on_the_terms_and_conditions_link() {
        footer.clickOnTermsAndConditionsLink();
    }

    @When("I click on the Privacy Policy link")
    public void i_click_on_the_privacy_policy_link() {
        footer.clickOnPrivacyPolicyLink();
    }

    @When("I scroll down to the footer of the page")
    public void i_scroll_down_to_the_footer_of_the_page() {
        footer.scrollToFooter();
    }

    @Then("the copyright text should be displayed")
    public void the_copyright_text_should_be_displayed() {
        footer.checkIfCopyrightTextIsDisplayed();
    }
}
