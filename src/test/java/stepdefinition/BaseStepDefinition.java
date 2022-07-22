package stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import static com.giantshoulder.driver.Driver.getChromeDriver;

public class BaseStepDefinition {
    static final String BASE_URL = "https://www.lifehack.org/";
    ChromeDriver driver = getChromeDriver();
}

