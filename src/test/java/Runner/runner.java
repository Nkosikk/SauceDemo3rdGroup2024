package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"Steps"},
        plugin = {"html:target/cucumberBasicHtmlReport.html"},
        tags =  "@login"
)
public class runner extends AbstractTestNGCucumberTests {
}
