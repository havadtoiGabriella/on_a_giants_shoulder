package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {
    private final By articleTitle = By.cssSelector("h6 a");

    @FindBy(css = "h6 a")
    List<WebElement> articleTitles;

    @FindBy(xpath = "//a[text()='See Older Posts']")
    WebElement seeOlderPostsButton;

    public void clickOnArticle(String articleTitle) {
        LOGGER.info("Opening the article with the title '" + articleTitle + "'");
        for (WebElement title : articleTitles) {
            if (title.getText().equals(articleTitle)) {
                clickOn(title, driver);
                break;
            }
        }
    }

    public void clickOnSeeOlderPostsButton() {
        LOGGER.info("Clicking on the 'See Older Posts' button'");
        int size = articleTitles.size();
        scrollIntoView(seeOlderPostsButton, driver);
        clickOn(seeOlderPostsButton, driver);
        waitForNumberOfElementsToBeMoreThan(size, articleTitle, driver);
    }

    public BlogPage(ChromeDriver driver) {
        super(driver);
    }
}
