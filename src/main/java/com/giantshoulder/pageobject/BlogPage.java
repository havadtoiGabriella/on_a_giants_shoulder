package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {
    private final By articleTitle = By.cssSelector("h6 a");
    private static String currentArticleTitle;

    @FindBy(css = "h6 a")
    List<WebElement> articleTitles;

    @FindBy(css = "[href='javascript:void(0);']")
    WebElement seeOlderPostsButton;

    public void clickOnArticle(int index) {
        LOGGER.info("Opening the article with the title '" + articleTitles.get(index).getText() + "'");
        currentArticleTitle = articleTitles.get(index).getText();
        clickOn(articleTitles.get(index), driver);
    }

    public void clickOnSeeOlderPostsButton() {
        LOGGER.info("Clicking on the 'See Older Posts' button'");
        int size = articleTitles.size();
        scrollIntoView(seeOlderPostsButton, driver);
        clickOn(seeOlderPostsButton, driver);
        waitForNumberOfElementsToBeMoreThan(size, articleTitle, driver);
    }
    public static String getCurrentArticleTitle(){
        return currentArticleTitle;
    }

    public BlogPage(ChromeDriver driver) {
        super(driver);
    }
}
