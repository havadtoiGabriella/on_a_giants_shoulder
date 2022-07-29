package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage {

    @FindBy(css = "h1.article-heading")
    WebElement articleHeading;

    public void checkIfCorrectPageIsLoaded(String articleTitle) {
        LOGGER.info("Checking if the page with the correct title, '"+articleTitle+"' is loaded.");
        elementHasText(articleTitle, articleHeading);
    }

    public ArticlePage(ChromeDriver driver) {
        super(driver);
    }
}
