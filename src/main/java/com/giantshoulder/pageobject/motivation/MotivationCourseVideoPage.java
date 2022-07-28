package com.giantshoulder.pageobject.motivation;

import static com.giantshoulder.util.WebElementAssertions.elementIsDisplayed;
import static com.giantshoulder.util.WebElementAssertions.validatePageTitle;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import com.giantshoulder.logger.Logger;
import com.giantshoulder.pageobject.BasePage;
import com.giantshoulder.util.WebElementAssertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MotivationCourseVideoPage extends BasePage {
    private static final Logger LOGGER = new Logger(WebElementAssertions.class);

    @FindBy(css = "[data-cfvimeo-url ='https://vimeo.com/358702273']")
    private WebElement video;

    public void validatingIfCorrectVideoIsDisplayed() {
        LOGGER.info("Validating if correct page is loaded");
        validatingIfCorrectPageIsLoaded();
        LOGGER.info("Waiting for the video to be visible.");
        waitForVideoToBeDisplayed();
    }

    private void validatingIfCorrectPageIsLoaded() {
        String pageTitle = "Activate Your Motivation - A Lifehack Fast-Track Class";
        validatePageTitle(pageTitle, driver);
    }

    private void waitForVideoToBeDisplayed() {
        waitForElementToBeVisible(video, driver);
        elementIsDisplayed(video, "video");
    }

    public MotivationCourseVideoPage(ChromeDriver driver) {
        super(driver);
    }
}