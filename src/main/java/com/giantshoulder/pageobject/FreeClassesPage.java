package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.clickOn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class FreeClassesPage extends BasePage {

    public FreeClassesPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Jumpstart My Motivation")
    private WebElement jumpstartMyMotivationButton;

    @FindBy(linkText = "Eliminate Procrastination")
    private WebElement eliminateProcrastinationButton;

    @FindBy(linkText = "Boost My Learning Power")
    private WebElement boostMyLearningPowerButton;

    public void clickOnJumpstartMyMotivationButton() {
        clickOn("Jumpstart My Motivation button", driver, jumpstartMyMotivationButton);
    }

    public void clickOnJEliminateProcrastinationButton() {
        clickOn("Eliminate Procrastination button", driver, eliminateProcrastinationButton);
    }

    public void clickOnBoostMyLearningPowerButton() {
        clickOn("Boost My Learning Power button", driver, boostMyLearningPowerButton);
    }
}
