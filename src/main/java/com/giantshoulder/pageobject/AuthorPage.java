package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class AuthorPage extends BasePage {

    @FindBy(className = "author-name")
    WebElement authorName;

    public void validatingIfTheCorrectAuthorsPageIsLoaded(String author) {
        elementHasText(author, authorName);
    }

    public AuthorPage(ChromeDriver driver) {
        super(driver);
    }
}
