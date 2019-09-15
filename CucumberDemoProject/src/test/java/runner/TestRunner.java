package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue = "stepDefinations" ,
		plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" } ,
		monochrome = true
		)
public class TestRunner {
}