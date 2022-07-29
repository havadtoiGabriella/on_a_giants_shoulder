package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.clickOn;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {
    public BlogPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(css = "h6 a")
    List<WebElement> listOfArticleTitles;

    public void clickOnArticle(String articleTitle) {
        for (WebElement title : listOfArticleTitles) {
            if (title.getText().equals(articleTitle)) {
                clickOn(title, driver);
                break;
            }
        }
    }
}
