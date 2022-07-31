package stepdefinition;

import com.giantshoulder.pageobject.ArticlePage;
import com.giantshoulder.pageobject.BlogPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ArticlePageStep extends BaseStepDefinition {
    private final ArticlePage articlePage = new ArticlePage(driver);

    @Then("I should be redirected to the article's landing page")
    public void i_should_be_redirected_to_the_x_articles_landing_page() {
        articlePage.checkIfCorrectPageIsLoaded(BlogPage.getCurrentArticleTitle());
    }

    @When("I click on the author's name")
    public void i_click_on_the_authors_name() {
        articlePage.clickOnAuthorsName();
    }
}
