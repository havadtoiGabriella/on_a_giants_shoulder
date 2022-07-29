package com.giantshoulder.util;

import static java.time.Duration.ofSeconds;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import com.giantshoulder.logger.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WebElementHandler {
    private static final Logger LOGGER = new Logger(WebElementHandler.class);
    private static final long DEFAULT_TIMEOUT = 10;
    private static final long WAIT_TIMEOUT = 5;

    private WebElementHandler() {
    }

    public static void waitForElementToBeVisible(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Waiting for element to be visible.");
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(visibilityOf(element));
    }

    public static void clickOn(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Clicking on element.");
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(elementToBeClickable(element));
        element.click();
    }

    public static void scrollIntoView(WebElement element, ChromeDriver driver) {
        LOGGER.debug("Moving to element");
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void waitForNumberOfElementsToBeMoreThan(int number, By locator, ChromeDriver driver) {
        LOGGER.debug("Waiting for number of elements to be more than " + number);
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.withTimeout(ofSeconds(WAIT_TIMEOUT)).until(numberOfElementsToBeMoreThan(locator, number));
    }
}
