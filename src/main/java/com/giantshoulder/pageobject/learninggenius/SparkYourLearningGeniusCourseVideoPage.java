package com.giantshoulder.pageobject.learninggenius;

import static com.giantshoulder.util.WebElementAssertions.elementIsDisplayed;
import static com.giantshoulder.util.WebElementAssertions.validatePageTitle;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import com.giantshoulder.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SparkYourLearningGeniusCourseVideoPage extends BasePage {

    @FindBy(css = "[data-cfvimeo-url ='https://vimeo.com/499938270']")
    private WebElement video;

    public void validatingIfCorrectVideoIsDisplayed() {
        LOGGER.info("Waiting for page to load");
        waitForPageToLoad();
        LOGGER.info("Validating if correct page is loaded");
        validatingIfPageTitleIsCorrect();
        LOGGER.info("Waiting for the video to be visible.");
        validatingIfVideoIsDisplayed();
    }

    private void waitForPageToLoad() {
        waitForElementToBeVisible(video, driver);
    }

    private void validatingIfPageTitleIsCorrect() {
        String pageTitle = "Spark Your Learning Genius - A Lifehack Fast-Track Class";
        validatePageTitle(pageTitle, driver);
    }

    private void validatingIfVideoIsDisplayed() {
        elementIsDisplayed(video);
    }

    public SparkYourLearningGeniusCourseVideoPage(ChromeDriver driver) {
        super(driver);
    }
}