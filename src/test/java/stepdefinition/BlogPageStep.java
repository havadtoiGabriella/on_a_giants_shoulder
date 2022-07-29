package stepdefinition;

import com.giantshoulder.pageobject.HomePage;
import com.giantshoulder.pagetype.PageType;
import cucumber.api.java.en.Given;

public class BlogPageStep extends BaseStepDefinition {

    @Given("I navigate to the {pageType} blog page")
    public void i_navigate_to_the_x_blog_page(PageType pageType) {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnBlogMenuItem();
        homePage.clickOnBlogPage(pageType);
    }

    @Given("I navigate to the {string} blog page")
    public void iNavigateToTheBlogPage(String arg0) {
    }
}
