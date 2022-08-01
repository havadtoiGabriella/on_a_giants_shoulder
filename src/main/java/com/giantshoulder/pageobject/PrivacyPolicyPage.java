package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class PrivacyPolicyPage extends BasePage {

    @FindBy(className = "iub_header")
    private WebElement privacyPolicyPageTitle;

    @FindBy(id = "wbars")
    private WebElement privacyPolicyContent;

    public void checkIfPrivacyPolicyPageOpenedCorrectly() {
        String expectedTitle = "Privacy Policy of Lifehack";
        LOGGER.info("Checking if the Privacy Policy page has the correct title: " + expectedTitle);
        checkPageTitle(expectedTitle);

        String expectedParagraphFragment = "Users who are uncertain about which Personal Data is mandatory are welcome to contact the Owner.";
        LOGGER.info("Checking if the Privacy Policy page has a paragraph that contains: " + expectedParagraphFragment);
        checkIfContentContainsText(expectedParagraphFragment);
    }

    private void checkPageTitle(String expectedTitle) {
        elementHasText(expectedTitle, privacyPolicyPageTitle);
    }

    private void checkIfContentContainsText(String expectedParagraphFragment) {
        elementHasText(expectedParagraphFragment, privacyPolicyContent);
    }

    public PrivacyPolicyPage(ChromeDriver driver) {
        super(driver);
    }
}
