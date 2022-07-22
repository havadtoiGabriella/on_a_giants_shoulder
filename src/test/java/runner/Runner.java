package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

import static com.giantshoulder.driver.Driver.closeDriver;
import static com.giantshoulder.driver.Driver.initDriver;

/**
 * @author Zoltan_Limpek
 */
@CucumberOptions(
        plugin = "pretty",
        glue = "stepdefinition",
        features = "src/test/resources/feature"
)
public class Runner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @DataProvider
    public Object[][] scenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @BeforeMethod
    public void initBrowser() {
        initDriver();
    }

    @Test(dataProvider = "scenarios")
    public void runScenario(PickleEventWrapper pickleWrapper, CucumberFeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickleEvent());
    }

    @AfterMethod
    public void quitBrowser() {
        closeDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }
}
