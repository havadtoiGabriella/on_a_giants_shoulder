package stepdefinition;

import com.giantshoulder.pageobject.ArticlePage;
import cucumber.api.java.en.Then;

public class ArticlePageStep extends BaseStepDefinition {

    @Then("I should be redirected to the {string} article's landing page")
    public void i_should_be_redirected_to_the_x_articles_landing_page(String articleTitle) {
        ArticlePage articlePage = new ArticlePage(driver);
        articlePage.checkIfCorrectPageIsLoaded(articleTitle);
    }
}
