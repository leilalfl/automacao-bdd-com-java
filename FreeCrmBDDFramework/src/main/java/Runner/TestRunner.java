package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/Inmetrics/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/contacts.feature"
		,glue= {"stepDefinitions"},
		format= {"pretty","html:test-outout"},
		monochrome = true,
		strict = true,
		dryRun = false
		)

public class TestRunner {

}
