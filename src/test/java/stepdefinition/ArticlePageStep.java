package stepdefinition;

import com.giantshoulder.pageobject.ArticlePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ArticlePageStep extends BaseStepDefinition {
    private final ArticlePage articlePage = new ArticlePage(driver);

    @Then("I should be redirected to the {string} article's landing page")
    public void i_should_be_redirected_to_the_x_articles_landing_page(String articleTitle) {
        articlePage.checkIfCorrectPageIsLoaded(articleTitle);
    }

    @When("I click on {string} author's name")
    public void i_click_on_authors_name(String author) {
        articlePage.clickOnAuthorsName(author);
    }
}
