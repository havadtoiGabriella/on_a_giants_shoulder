package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasCorrectUrl;
import static com.giantshoulder.util.WebElementHandler.clickOn;
import static com.giantshoulder.util.WebElementHandler.hoverOver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {
    static final String BASE_URL = "https://www.lifehack.org/";

    @FindBy(className = "navbar-brand")
    WebElement logo;

    @FindBy(id = "menu-item-851362")
    WebElement startHereMenuItem;

    @FindBy(xpath = "//ul[@id='main-menu']/li/a")
    List<WebElement> menuItems;

    public void clickOnPageLogo() {
        clickOn(logo, driver);
    }

    public void hoverOverPageLogo() {
        hoverOver(logo, driver);
    }

    public void checkIfLogosUrlPointsToTheHomaPage() {
        LOGGER.info("Checking if page logo url points to the home page");
        elementHasCorrectUrl(BASE_URL, logo);
    }

    public void hoverOverMenuElement(String element) {
        LOGGER.info("Hovering over the " + element + " menu item");
        for (WebElement menuItem : menuItems) {
            if (menuItem.getAttribute("title").equals(element)) {
                hoverOver(menuItem, driver);
            }
        }
    }

    public void checkIfUrlPointsToTheRightPage(String element, String url) {
        LOGGER.info("Checking if " + element + " menu item has the correct url: " + url);
        for (WebElement menuItem : menuItems) {
            if (menuItem.getAttribute("title").equals(element)) {
                elementHasCorrectUrl(url, menuItem);
            }
        }
    }

    public Header(ChromeDriver driver) {
        super(driver);
    }
}
