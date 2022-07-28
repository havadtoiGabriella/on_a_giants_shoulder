package stepdefinition;

import com.giantshoulder.pageobject.HomePage;
import com.giantshoulder.pagetype.PageType;
import cucumber.api.java.en.Given;

public class BlogPageStep extends BaseStepDefinition {

    @Given("I navigate to the {String} blog page")
    public void i_navigate_to_the_x_blog_page(PageType pageType) {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnBlogMenuItem();
        homePage.clickOnBlogPage(pageType);
    }
}
