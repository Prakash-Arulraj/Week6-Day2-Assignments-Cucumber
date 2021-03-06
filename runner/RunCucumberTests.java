package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		features = {"src/test/java/features/Login.feature","src/test/java/features/CreateIncident.feature","src/test/java/features/ResolveIncident.feature","src/test/java/features/DeleteIncident.feature","src/test/java/features/UpdateExistingIncident.feature"},
		glue = {"stepDefinition","hooks"},
		monochrome = true
		//Resolution code, Close notes
		
		)
public class RunCucumberTests extends AbstractTestNGCucumberTests{

}
