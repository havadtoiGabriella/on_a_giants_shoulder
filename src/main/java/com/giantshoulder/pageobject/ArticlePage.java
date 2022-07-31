package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasText;
import com.giantshoulder.util.WebElementHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage {

    @FindBy(css = "h1.article-heading")
    WebElement articleHeading;

    @FindBy(className = "author-name")
    WebElement authorName;

    public void checkIfCorrectPageIsLoaded(String articleTitle) {
        LOGGER.info("Checking if the page with the correct title, '" + articleTitle + "' is loaded.");
        elementHasText(articleTitle, articleHeading);
    }

    public void clickOnAuthorsName() {
        LOGGER.info("Clicking on the name of the author: " + authorName.getText());
        WebElementHandler.clickOn(authorName, driver);
    }

    public String getAuthorsName() {
        return authorName.getText();
    }

    public ArticlePage(ChromeDriver driver) {
        super(driver);
    }
}
