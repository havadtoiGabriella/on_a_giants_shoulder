package com.giantshoulder.util;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import com.giantshoulder.logger.Logger;
import org.openqa.selenium.WebElement;

public final class WebElementAssertions {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    private WebElementAssertions() {
    }

    public static void elementHasText(String expectedString, WebElement element) {
        LOGGER.debug("Validating if the element has the text:  " + expectedString);
        assertThat(element.getText().trim())
                .isEqualTo(expectedString);
    }

    public static void listHasElementWithText(String text, List<WebElement> list) {
        LOGGER.debug("Validating if the list has the element with text:  " + text);
        for (WebElement element : list) {
            if (element.getText().equals(text)) {
                assertThat(list.contains(element)).isTrue();
                break;
            }
        }
    }
}
