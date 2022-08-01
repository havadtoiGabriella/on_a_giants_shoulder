package com.giantshoulder.util;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import java.util.List;
import com.giantshoulder.logger.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WebElementHandler {
    private static final Logger LOGGER = new Logger(WebElementHandler.class);
    private static final long DEFAULT_TIMEOUT = 10;
    private static final long WAIT_TIMEOUT = 5;

    private WebElementHandler() {
    }

    public static void waitForElementToBeVisible(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Waiting for the element to be visible.");
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(visibilityOf(element));
    }

    public static void clickOn(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Clicking on the element.");
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(elementToBeClickable(element));
        element.click();
    }

    public static void hoverOver(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Hovering over the element.");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static void scrollTo(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Scrolling down to element.");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
