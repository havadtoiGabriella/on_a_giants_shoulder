package com.giantshoulder.util;

import static org.assertj.core.api.Assertions.assertThat;
import com.giantshoulder.logger.Logger;
import org.openqa.selenium.WebElement;

public final class WebElementAssertions {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    private WebElementAssertions() {
    }

    public static void elementHasText(String expectedString, WebElement element, String elementName) {
        LOGGER.debug("Validating if the " + elementName + " has the text:  " + expectedString);
        assertThat(element.getText().trim())
                .isEqualTo(expectedString);
    }

    public static void elementHasCorrectUrl(String expectedUrl, WebElement element){
        LOGGER.debug("Validating if the element url points to the right page");
        assertThat(element.getAttribute("href")).isEqualTo(expectedUrl);
    }
}
