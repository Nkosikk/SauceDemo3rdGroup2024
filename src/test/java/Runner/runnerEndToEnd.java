package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"Steps"},
        plugin = {"html:target/cucumberEndToEndReport.html"},
        tags =  "@endToEnd"
)
public class runnerEndToEnd extends AbstractTestNGCucumberTests {
}
