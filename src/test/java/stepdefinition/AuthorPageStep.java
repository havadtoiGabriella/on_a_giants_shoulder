package stepdefinition;

import com.giantshoulder.pageobject.AuthorPage;
import cucumber.api.java.en.Then;

public class AuthorPageStep extends BaseStepDefinition {

    @Then("I should be redirected to {string} author's profile page")
    public void i_should_be_redirected_to_x_authors_profile_page(String authorsName) {
        AuthorPage authorPage = new AuthorPage(driver);
        authorPage.validatingIfTheCorrectAuthorsPageIsLoaded(authorsName);
    }
}
