package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementAssertions.elementHasText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class TermsAndConditionsPage extends BasePage {

    @FindBy(css = ".entry-header h1")
    private WebElement termsAndConditionsPageTitle;

    @FindBy(className = "entry-content")
    private WebElement termsAndConditionsContent;

    public void checkIfTermsAndConditionsPageOpenedCorrectly() {
        String expectedTitle = "Terms and Conditions";
        LOGGER.info("Checking if the Terms and Conditions page has the correct title: " + expectedTitle);
        checkPageTitle(expectedTitle);

        String expectedParagraphFragment = "These Terms of Use constitute a legally binding agreement made between you, whether personally or on behalf " +
                "of an entity";
        LOGGER.info("Checking if the Terms and Conditions page has a paragraph that contains: " + expectedParagraphFragment);
        checkIfContentContainsText(expectedParagraphFragment);
    }

    private void checkPageTitle(String expectedTitle) {
        elementHasText(expectedTitle, termsAndConditionsPageTitle);
    }

    private void checkIfContentContainsText(String expectedParagraphFragment) {
        elementHasText(expectedParagraphFragment, termsAndConditionsContent);
    }

    public TermsAndConditionsPage(ChromeDriver driver) {
        super(driver);
    }
}
