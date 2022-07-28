package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementIsDisplayed;
import static com.giantshoulder.util.WebElementAssertions.validatePageTitle;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import com.giantshoulder.logger.Logger;
import com.giantshoulder.util.WebElementAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MotivationCourseVideoPage extends BasePage {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);
    private final String pageTitle = "Activate Your Motivation - A Lifehack Fast-Track Class";

    @FindBy(css = "[data-cfvimeo-url ='https://vimeo.com/358702273']")
    private WebElement video;

    private void validatingIfCorrectPageIsLoaded() {
        validatePageTitle(pageTitle, driver);
    }

    private void waitForVideoToBeDisplayed() {
        waitForElementToBeVisible(video, driver);
        elementIsDisplayed(video, "video");
    }

    public void validatingIfCorrectVideoIsDisplayed() {
        LOGGER.info("Validating if correct page is loaded");
        validatingIfCorrectPageIsLoaded();
        LOGGER.info("Waiting for the video to be visible.");
        waitForVideoToBeDisplayed();
    }

    public MotivationCourseVideoPage(ChromeDriver driver) {
        super(driver);
    }
}
