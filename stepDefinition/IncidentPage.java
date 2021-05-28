package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class IncidentPage extends BaseStep {
	@And("Click And Enter State")
	public void enterStae() {
		WebElement incidentstate = driver.findElement(By.id("incident.state")); 
		new Select(incidentstate).selectByIndex(4); 
	}
	@Then("Click Assignment group")
	public void clickAssignmentGrp() {
		driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']//span[1]")).click();
	}
	@And("Click And Search Assignment Group (.*)$")
	public void searchAssignment(String search) {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(search,Keys.ENTER);
	}
	@Then("Click First Match For Assignment Group")
	public void firstMatch() {
		driver.findElement(By.linkText("Software")).click();
	}
	@Then("Enter Update Short Description (.*)$")
	public void updateDescription(String value1) {
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("incident.short_description")).sendKeys(value1);
	}
	@And("Enter To The Solved Notes (.*)$")
	public void solvedNotes(String notes) {
		driver.findElement(By.id("incident.work_notes")).sendKeys(notes);
	}
	@And("Click Resolution Information")
	public void clickResolution() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Resolution Information']")).click();
		Thread.sleep(3000);
	}
	@Then("Select Resolution Code")
	public void typeResolution() throws InterruptedException {
		Thread.sleep(2000);
		WebElement incidentclosecode = driver.findElement(By.id("incident.close_code")); 
		new Select(incidentclosecode).selectByValue("Closed/Resolved by Caller"); 
	}
	@Then("Finally Click Update")
	public void clickFinalUpdate() {
		driver.findElement(By.xpath("//button[text()='Update']")).click();
	}

	
}
