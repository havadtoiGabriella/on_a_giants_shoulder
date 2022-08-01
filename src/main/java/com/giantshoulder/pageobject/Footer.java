package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasCorrectUrl;
import static com.giantshoulder.util.WebElementHandler.hoverOver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Footer extends BasePage {

    @FindBy(css = "#footer-menu > li > a")
    List<WebElement> footerMainMenuItems;

    @FindBy(css = "#footer-menu ul > li > a")
    List<WebElement> subMenuItems;

    public Footer(ChromeDriver driver) {
        super(driver);
    }

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
}
