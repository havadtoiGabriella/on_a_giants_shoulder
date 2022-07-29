package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ArticlePage extends BasePage {
    public ArticlePage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(css = "h1.article-heading")
    WebElement articleHeading;

    public void checkIfCorrectPageIsLoaded(String articleTitle) {
        elementHasText(articleTitle, articleHeading);
    }
}
