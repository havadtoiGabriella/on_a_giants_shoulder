package stepdefinition;

import com.giantshoulder.pageobject.BlogPage;
import cucumber.api.java.en.When;

public class BlogPageStep extends BaseStepDefinition {
    private final BlogPage blogPage = new BlogPage(driver);

    @When("I choose the {string} article")
    public void i_choose_the_x_article(String articleTitle) {
        blogPage.clickOnArticle(articleTitle);
    }

    @When("I click on the 'See older posts' link")
    public void i_click_on_the_see_older_posts_link() throws InterruptedException {
        blogPage.clickOnSeeOlderPostsButton();
    }
}
