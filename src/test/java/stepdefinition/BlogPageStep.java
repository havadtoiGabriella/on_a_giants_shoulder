package stepdefinition;

import com.giantshoulder.pageobject.BlogPage;
import cucumber.api.java.en.When;

public class BlogPageStep extends BaseStepDefinition {

    @When("I choose the {string} article")
    public void i_choose_the_x_article(String articleTitle) {
        BlogPage blogPage = new BlogPage(driver);
        blogPage.clickOnArticle(articleTitle);
    }
}
