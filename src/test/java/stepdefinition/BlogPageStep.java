package stepdefinition;

import com.giantshoulder.pageobject.BlogPage;
import com.giantshoulder.pagetype.PageType;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BlogPageStep extends BaseStepDefinition {
    private final BlogPage blogPage = new BlogPage(driver);

    @Given("I open the {pageType} blog page")
    public void i_open_the_x_blog_page(PageType pageType) {
        blogPage.navigateToPage(pageType);
    }

    @And("I accept the data handling dialog box")
    public void i_accept_the_data_handling_dialog_box() {
        blogPage.acceptDataConsentPanel();
    }

    @When("I choose the {int}. article")
    public void i_choose_the_x_article(int index) {
        blogPage.clickOnArticle(index);
    }

    @When("I click on the 'See older posts' link")
    public void i_click_on_the_see_older_posts_link() {
        blogPage.clickOnSeeOlderPostsButton();
    }
}
