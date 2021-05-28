package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePage extends BaseStep {
	
	//String number = driver.findElement(By.id("incident.number")).getAttribute("value");
	
	@Then("get Number To Incident Number")
	public void getNumber() {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[@id='lookup.incident.caller_id']//span[1]")).click();
		String number = driver.findElement(By.id("incident.number")).getAttribute("value");
		System.out.println("incident number is" + number);
	}

	@When("Click CallerId Button")
	public void clickCallerId() {
		// driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("lookup.incident.caller_id")).click();
	}

	@Then("Click Search Button (.*)$")
	public void clickSearch(String name) throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(name, Keys.ENTER);
		Thread.sleep(5000);
	}

	@Then("Click First Match And Select")
	public void clickFirstMatch() {
		driver.findElement(By.xpath("//tr[@collapsed='true']//a")).click();
	}

	@And("Click And Type Short Description (.*)$")
	public void clickDescription(String sentence) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("incident.short_description")).sendKeys(sentence);
	}

	@Then("Submit Create New Incident")
	public void clickSubmit() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	/*
	 * When Verify Create New Incident Name
	 * @When("Verify Create New Incident Name") public void verifyIncident() {
	 * WebElement forTextNum = driver.findElement(By.
	 * xpath("//select[@class='form-control default-focus-outline']")); new
	 * Select(forTextNum).selectByIndex(1);
	 * driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(
	 * number, Keys.ENTER); }
	 */

}
