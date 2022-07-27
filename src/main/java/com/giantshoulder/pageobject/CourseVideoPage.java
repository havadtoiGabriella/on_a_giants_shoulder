package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementIsDisplayed;
import static com.giantshoulder.util.WebElementHandler.waitForElementToBeVisible;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CourseVideoPage extends BasePage {

    public CourseVideoPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(id = "tmp_video-52449")
    private WebElement videoOverlay;

    public void waitForVideoToBeDisplayed() {
        waitForElementToBeVisible("video overlay", driver, videoOverlay);
        elementIsDisplayed(videoOverlay, "video overlay");
    }
}
