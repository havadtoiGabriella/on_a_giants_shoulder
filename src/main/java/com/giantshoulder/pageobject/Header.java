package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasCorrectUrl;
import static com.giantshoulder.util.WebElementAssertions.elementIsDisplayed;
import static com.giantshoulder.util.WebElementHandler.hoverOver;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {

    @FindBy(className = "navbar-brand")
    private WebElement logo;

    @FindBy(css = "#main-menu > li > a")
    private List<WebElement> navbarMenuItems;

    @FindBy(className = "dropdown-menu")
    private WebElement dropdownForStartHere;

    @FindBy(css = "#menu-item-849490 .dropdown-menu")
    private WebElement dropdownForCourses;

    @FindBy(css = "#menu-item-811183 .dropdown-menu")
    private WebElement dropdownForBlog;

    @FindBy(css = ".dropdown-menu.show > li > a")
    private List<WebElement> dropdownMenuItems;

    @FindBy(id = "element3421730-content")
    private WebElement subscribeButton;

    public void hoverOverPageLogo() {
        hoverOver(logo, driver);
    }

    public void checkIfLogoUrlPointsToTheHomaPage() {
        LOGGER.info("Checking if page logo url points to the home page");
        String homePageUrl = "https://www.lifehack.org/";
        elementHasCorrectUrl(homePageUrl, logo);
    }

    public void hoverOverMenuElement(String element) {
        LOGGER.info("Hovering over the " + element + "navbar menu item");
        for (WebElement menuItem : navbarMenuItems) {
            if (menuItem.getAttribute("title").equals(element)) {
                hoverOver(menuItem, driver);
                break;
            }
        }
    }

    public void checkIfNavbarMenuItemUrlPointsToTheRightPage(String element, String url) {
        LOGGER.info("Checking if " + element + " navbar menu item has the correct url: " + url);
        for (WebElement menuItem : navbarMenuItems) {
            if (menuItem.getAttribute("title").equals(element)) {
                elementHasCorrectUrl(url, menuItem);
                break;
            }
        }
    }

    public void checkIfDropDownIsOpenFor(String navbarMenuItem) {
        LOGGER.info("Checking if dropdown for " + navbarMenuItem + " navbar menu is open");
        switch (navbarMenuItem) {
            case "Start Here":
                elementIsDisplayed(dropdownForStartHere);
                break;
            case "Courses":
                elementIsDisplayed(dropdownForCourses);
                break;
            case "Blog":
                elementIsDisplayed(dropdownForBlog);
                break;
        }
    }

    public void checkIfDropdownItemUrlPointsToTheRightPage(String element, String url) {
        LOGGER.info("Checking if " + element + " dropdown menu item has the correct url: " + url);
        for (WebElement menuItem : dropdownMenuItems) {
            if (menuItem.getAttribute("title").equals(element)) {
                elementHasCorrectUrl(url, menuItem);
                break;
            }
        }
    }

    public void waitForSubscribeButtonToBeVisible() {
        LOGGER.info("Waiting for Subscribe button to be visible");
        waitForElementToBeVisible(subscribeButton, driver);
    }

    public void checkIfSubscribeButtonIsDisplayed() {
        LOGGER.info("Checking if Subscribe button is displayed");
        elementIsDisplayed(subscribeButton);
    }

    public Header(ChromeDriver driver) {
        super(driver);
    }
}
