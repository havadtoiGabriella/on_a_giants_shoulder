package com.giantshoulder.util;

import com.giantshoulder.logger.Logger;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Gabriella_Havadtoi
 */
public class WebElementAssertions {

    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    private WebElementAssertions() {
    }

    public static void elementTextContains(String expectedString, WebElement element, String elementName) {
        LOGGER.info("Validating if the " + elementName + " contains the text:  " + expectedString);
        assertThat(element.getText())
                .contains(expectedString);
    }

}
