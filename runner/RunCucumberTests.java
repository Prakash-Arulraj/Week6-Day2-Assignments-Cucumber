package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		features = {"src/test/java/features/DeleteIncident.feature"},
		glue = {"stepDefinition","hooks"},
		monochrome = true
		//Resolution code, Close notes
		
		)
public class RunCucumberTests extends AbstractTestNGCucumberTests{

}
