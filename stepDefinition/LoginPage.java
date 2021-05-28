package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseStep {
	
	//Given Launch The Chrome Browser
	@Then("Load Url {string}")
	public void loadUrl(String url) {
		driver.get(url);
	}
	@When("Type Username As {string}")
	public void typeUsername(String username) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(username);
	}
	@And("Type Password As {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("user_password")).sendKeys(password);
	}
	@And("Click Login Button")
	public void clickLogin() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

}
