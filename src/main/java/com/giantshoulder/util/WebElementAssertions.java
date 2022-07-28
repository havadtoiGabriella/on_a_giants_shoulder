package com.giantshoulder.util;

import static org.assertj.core.api.Assertions.assertThat;
import com.giantshoulder.logger.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class WebElementAssertions {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    private WebElementAssertions() {
    }

    public static void elementIsDisplayed(WebElement element) {
        LOGGER.debug("Validating if the element is displayed.");
        assertThat(element.isDisplayed()).isTrue();
    }

    public static void validatePageTitle(String expectedTitle, ChromeDriver driver) {
        LOGGER.debug("Validating if the page has the correct title.");
        assertThat(driver.getTitle()).isEqualTo(expectedTitle);
    }
}
