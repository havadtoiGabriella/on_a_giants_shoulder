package stepdefinition;

import static com.giantshoulder.driver.Driver.getChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseStepDefinition {
    static final String BASE_URL = "https://www.lifehack.org/";
    ChromeDriver driver = getChromeDriver();
}
