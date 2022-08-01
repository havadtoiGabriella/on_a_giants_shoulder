package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasCorrectUrl;
import static com.giantshoulder.util.WebElementAssertions.elementIsDisplayed;
import static com.giantshoulder.util.WebElementHandler.*;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Footer extends BasePage {

    @FindBy(css = "#footer-menu > li > a")
    private List<WebElement> footerMainMenuItems;

    @FindBy(css = "#footer-menu ul > li > a")
    private List<WebElement> subMenuItems;

    @FindBy(css = ".social-links a")
    private List<WebElement> socialLinks;

    @FindBy(id = "menu-item-786461")
    private WebElement termsAndConditionsLink;

    @FindBy(id = "menu-item-786463")
    private WebElement privacyPolicyLink;

    @FindBy(className = "copyright")
    private WebElement copyright;

    public void hoverOverMainMenuItem(String mainMenuItem) {
        LOGGER.info("Hovering over the " + mainMenuItem + " main footer menu item");
        for (WebElement menuItem : footerMainMenuItems) {
            if (menuItem.getText().equals(mainMenuItem)) {
                hoverOver(menuItem, driver);
                break;
            }
        }
    }

    public void checkIfFooterMainMenuItemUrlPointsToTheRightPage(String mainMenuItem, String url) {
        LOGGER.info("Checking if " + mainMenuItem + " main footer menu item has the correct url: " + url);
        for (WebElement menuItem : footerMainMenuItems) {
            if (menuItem.getText().equals(mainMenuItem)) {
                elementHasCorrectUrl(url, menuItem);
                break;
            }
        }
    }

    public void hoverOverSubMenuItem(String subMenuItem) {
        LOGGER.info("Hovering over " + subMenuItem + " sub menu item");
        for (WebElement menuItem : subMenuItems) {
            if (menuItem.getText().equals(subMenuItem)) {
                hoverOver(menuItem, driver);
                break;
            }
        }
    }

    public void checkIfSubMenuItemUrlPointsToTheRightPage(String subMenuItem, String url) {
        LOGGER.info("Checking if " + subMenuItem + " sub menu item has the correct url: " + url);
        for (WebElement menuItem : subMenuItems) {
            if (menuItem.getText().equals(subMenuItem)) {
                elementHasCorrectUrl(url, menuItem);
                break;
            }
        }
    }

    public void hoverOverSocialLink(String link) {
        LOGGER.info("Hovering over " + link + " sub menu item");
        for (WebElement socialLink : socialLinks) {
            if (socialLink.getAttribute("href").contains(link)) {
                hoverOver(socialLink, driver);
                break;
            }
        }
    }

    public void checkIfSocialLinkUrlPointsToTheRightPage(String link, String url) {
        LOGGER.info("Checking if " + link + " link has the correct url: " + url);
        for (WebElement socialLink : socialLinks) {
            if (socialLink.getAttribute("href").contains(link)) {
                elementHasCorrectUrl(url, socialLink);
                break;
            }
        }
    }

    public void clickOnTermsAndConditionsLink() {
        LOGGER.info("Clicking on the Terms and Conditions link");
        clickOn(termsAndConditionsLink, driver);
    }

    public void clickOnPrivacyPolicyLink() {
        LOGGER.info("Clicking on the Privacy Policy link");
        clickOn(privacyPolicyLink, driver);
    }

    public void scrollToFooter() {
        LOGGER.info("Scrolling down to the footer of the page");
        scrollTo(termsAndConditionsLink, driver);
    }

    public void checkIfCopyrightTextIsDisplayed() {
        LOGGER.info("Checking if copyright text is displayed");
        elementIsDisplayed(copyright);
    }

    public Footer(ChromeDriver driver) {
        super(driver);
    }
}
