package com.giantshoulder.util;

import static org.assertj.core.api.Assertions.assertThat;
import com.giantshoulder.logger.Logger;
import org.openqa.selenium.WebElement;

public final class WebElementAssertions {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    private WebElementAssertions() {
    }

    public static void elementIsDisplayed(WebElement element, String elementName) {
        LOGGER.debug("Validating if the element is displayed.");
        assertThat(element.isDisplayed()).isTrue();
    }
}
