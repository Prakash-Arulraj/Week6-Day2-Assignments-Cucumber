package stepDefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class UserDeletePage extends BaseStep {
	
	@And("Click Delete Incident Button")
	public void clickDelete() {
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
	}
	@Then("Click And Delete Confirm Alert Box")
	//Then Click And Delete Confirm Alert Box
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert: " + alert.getText());
		alert.accept();
	}

}
