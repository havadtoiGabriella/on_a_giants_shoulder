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

    public void clickOnJumpstartMyMotivatonButton() {
        clickOn("Jumpstart My Motivation button", driver, jumpstartMyMotivationButton);
    }
}
