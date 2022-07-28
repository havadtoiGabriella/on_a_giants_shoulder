package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementIsDisplayed;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import com.giantshoulder.logger.Logger;
import com.giantshoulder.util.WebElementAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CourseVideoPage extends BasePage {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);
    @FindBy(id = "tmp_video-52449")
    private WebElement videoOverlay;

    public void waitForVideoToBeDisplayed() {
        LOGGER.info("Waiting for the video to be visible.");
        waitForElementToBeVisible(videoOverlay, driver);
        elementIsDisplayed(videoOverlay, "video overlay");
    }

    public CourseVideoPage(ChromeDriver driver) {
        super(driver);
    }
}
