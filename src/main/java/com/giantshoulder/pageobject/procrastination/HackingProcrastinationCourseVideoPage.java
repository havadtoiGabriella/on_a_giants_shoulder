package com.giantshoulder.pageobject.procrastination;

import static com.giantshoulder.util.WebElementAssertions.elementIsDisplayed;
import static com.giantshoulder.util.WebElementAssertions.validatePageTitle;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import com.giantshoulder.pageobject.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HackingProcrastinationCourseVideoPage extends BasePage {

    @FindBy(css = "[data-cfvimeo-url ='https://vimeo.com/580655913']")
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
        String pageTitle = "Hacking Procrastination - A Lifehack Mini Series";
        validatePageTitle(pageTitle, driver);
    }

    private void validatingIfVideoIsDisplayed() {
        elementIsDisplayed(video);
    }

    public HackingProcrastinationCourseVideoPage(ChromeDriver driver) {
        super(driver);
    }
}
