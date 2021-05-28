package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePage extends BaseStep{
	@And("Click Fillter And Search Tab (.*)$")
	public void clickFillter(String value) {
		driver.findElement(By.id("filter")).sendKeys(value);
	}
	@Then("click Create New Button")
	public void clickCreateNew() {
		driver.findElement(By.xpath("//div[text()='Create New']")).click();
	}
	@And("Click Fillter And Search Tab To Incidents(.*)$")
	public void clickFillterUpdate(String value) {
		driver.findElement(By.id("filter")).sendKeys(value);
	}
	@And("Click Service Desk Incidents")
	public void clickIncidents() {
		driver.findElement(By.xpath("(//div[text()='Incidents'])[2]")).click();
	}
	

}
