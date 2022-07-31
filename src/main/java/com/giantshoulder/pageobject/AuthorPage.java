package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasText;
import static com.giantshoulder.util.WebElementAssertions.listHasElement;
import static com.giantshoulder.util.WebElementHandler.clickOn;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class AuthorPage extends BasePage {

    @FindBy(className = "author-name")
    WebElement authorName;

    @FindBy(id = "posts-tab")
    WebElement postsLink;

    @FindBy(css = "h6 a")
    List<WebElement> articles;

    public void validatingIfTheCorrectAuthorsPageIsLoaded(String author) {
        LOGGER.info("Validating if the author, " + author + " page is loaded.");
        elementHasText(author, authorName);
    }

    public void clickOnPosts() {
        LOGGER.info("Clicking on the 'Posts' link");
        clickOn(postsLink, driver);
    }

    public void validatingIfPostsContainsAuthorsArticle(String article) {
        LOGGER.info("Validating if the author's, " + authorName.getText() + ", posts contains the article: " + article);
        for (WebElement articleTitle : articles) {
            listHasElement(articles, articleTitle);
        }
    }

    public AuthorPage(ChromeDriver driver) {
        super(driver);
    }
}
