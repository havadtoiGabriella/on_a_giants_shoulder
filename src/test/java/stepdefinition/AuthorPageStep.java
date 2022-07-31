package stepdefinition;

import com.giantshoulder.pageobject.ArticlePage;
import com.giantshoulder.pageobject.AuthorPage;
import com.giantshoulder.pageobject.BlogPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthorPageStep extends BaseStepDefinition {
    private final AuthorPage authorPage = new AuthorPage(driver);
    private final ArticlePage articlePage = new ArticlePage(driver);

    @Then("I should be redirected to the author's profile page")
    public void i_should_be_redirected_to_the_authors_profile_page() {
        authorPage.validatingIfTheCorrectAuthorsPageIsLoaded(articlePage.getAuthorsName());
    }

    @When("I click on 'Posts'")
    public void i_click_on_posts() {
        authorPage.clickOnPosts();
    }

    @Then("I should see that the posts contains the previous article")
    public void i_should_see_that_the_posts_contains_the_previous_article() {
        authorPage.validatingIfPostsContainsPreviousArticle(BlogPage.getArticleTitleFromBlogPage());
    }
}
