package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import stepDefinition.BaseStep;

public class PreAndPostConditions extends BaseStep {
	
	@Before
	@Given("Launch The Chrome Browser")
	public void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@After
	@Then("Close The Browser")
	public void closeBrowser() {
		driver.close();
	}
	

}
