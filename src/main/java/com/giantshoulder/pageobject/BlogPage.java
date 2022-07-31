package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.*;
import java.util.List;
import com.giantshoulder.pagetype.PageType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {
    private static String currentArticleTitle;
    private final By articleTitle = By.cssSelector("h6 a");

    @FindBy(css = ".fc-button.fc-cta-consent.fc-primary-button")
    private WebElement dataConsentButton;

    @FindBy(css = "h6 a")
    private List<WebElement> articleTitles;

    @FindBy(css = "[href='javascript:void(0);']")
    private WebElement seeOlderPostsButton;

    public void navigateToPage(PageType pageType) {
        LOGGER.info("Navigating to " + pageType + " page.");
        driver.navigate().to(BASE_URL + pageType.getUrlFragment());
    }

    public void acceptDataConsentPanel() {
        LOGGER.info("Accepting the data consent panel.");
        waitForElementToBeVisible(dataConsentButton, driver);
        clickOn(dataConsentButton, driver);
    }

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
    public static String getArticleTitleFromBlogPage(){
        return currentArticleTitle;
    }

    public BlogPage(ChromeDriver driver) {
        super(driver);
    }
}
