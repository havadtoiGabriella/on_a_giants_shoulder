package com.giantshoulder.pageobject;

import static com.giantshoulder.util.WebElementHandler.clickOn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class FreeClassesPage extends BasePage {

    @FindBy(css = "[href='http://g.lifehack.org/activate-your-motivation-register?utm_source=blog&utm_medium=page&utm_campaign=free_classes']")
    private WebElement jumpstartMyMotivationButton;

    @FindBy(css = "[href*='http://g.lifehack.org/hacking-procrastination-register?utm_source=blog&utm_medium=page&utm_campaign=free_classes']")
    private WebElement eliminateProcrastinationButton;

    @FindBy(css = "[href='http://g.lifehack.org/spark-your-learning-genius-register?utm_source=blog&utm_medium=page&utm_campaign=free_classes']")
    private WebElement boostMyLearningPowerButton;

    public void clickOnJumpstartMyMotivationButton() {
        LOGGER.info("Clicking on 'Jumpstart My Motivation' button.");
        clickOn(jumpstartMyMotivationButton, driver);
    }

    public void clickOnEliminateProcrastinationButton() {
        LOGGER.info("Clicking on 'Eliminate Procrastination' button.");
        clickOn(eliminateProcrastinationButton, driver);
    }

    public void clickOnBoostMyLearningPowerButton() {
        LOGGER.info("Clicking on 'Boost My Learning Power' button.");
        clickOn(boostMyLearningPowerButton, driver);
    }

    public FreeClassesPage(ChromeDriver driver) {
        super(driver);
    }
}
