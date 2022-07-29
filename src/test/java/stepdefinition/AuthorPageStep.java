package stepdefinition;

import com.giantshoulder.pageobject.AuthorPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthorPageStep extends BaseStepDefinition {
    private final AuthorPage authorPage = new AuthorPage(driver);

    @Then("I should be redirected to {string} author's profile page")
    public void i_should_be_redirected_to_x_authors_profile_page(String authorsName) {
        authorPage.validatingIfTheCorrectAuthorsPageIsLoaded(authorsName);
    }

    @When("I click on 'Posts'")
    public void i_click_on_posts() {
        authorPage.clickOnPosts();
    }

    @Then("I should see that the posts that {string} wrote contains {string}")
    public void i_should_see_all_the_posts_that_wrote(String authorsName, String article) {
        authorPage.validatingIfPostsContainsAuthorsArticle(authorsName, article);
    }
}
