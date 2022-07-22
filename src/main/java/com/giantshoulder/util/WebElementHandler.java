package com.giantshoulder.util;

import com.giantshoulder.logger.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * @author Gabriella_Havadtoi
 */
public class WebElementHandler {
    private static final Logger LOGGER = new Logger(WebElementHandler.class);
    private static final long DEFAULT_TIMEOUT = 10;
    private static final long WAIT_TIMEOUT = 5;

    private WebElementHandler() {

    }

    public static void waitForElementToBeVisible(String elementName, ChromeDriver driver, WebElement element) {
        LOGGER.info("Waiting for '" + elementName + "' to be visible.");
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(visibilityOf(element));
    }

    public static void waitForElementToBeInVisible(String elementName, ChromeDriver driver, WebElement element) {
        LOGGER.info("Waiting for '" + elementName + "' to be invisible.");
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(invisibilityOf(element));
    }

    public static void clickOn(String elementName, ChromeDriver driver, WebElement element) {
        LOGGER.info("Clicking on '" + elementName + "'.");
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(elementToBeClickable(element));
        element.click();
    }

    public static void sendKeysTo(String elementName, WebElement inputField, String text) {
        LOGGER.info("Sending text " + "'" + text + "'" + "to " + elementName + ".");
        inputField.sendKeys(text);
    }
}
