package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IncidentsPage extends BaseStep {

	@Then("Click And Search Incidents Number")
	public void clickNumber() {
		driver.switchTo().frame("gsft_main");
		WebElement forTextNum = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		new Select(forTextNum).selectByIndex(1);
	}
	@And("Type The Update Incident Number (.*)$")
	public void typeNumber(String number) {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(number);
	}
	@And("Select The Check Box")
	public void selectBox() {
		driver.findElement(By.xpath("//label[@class='checkbox-label']")).click();
	}
	@And("Click Priority Check Box")
	public void clickPriority() {
		driver.findElement(By.xpath("//table[@id='incident_table']/thead[1]/tr[1]/th[7]/span[1]/i[1]")).click();
	}
	@Then("Click Priority Update Selected Box")
	public void updateSelect() {
		driver.findElement(By.xpath("//div[text()='Update Selected']")).click();
	}
	@Then("Verify The Resolved Incidents")
	public void verifyResole() {
		String ele = driver.findElement(By.xpath("//td[text()='Resolved']")).getText();
		System.out.println(ele);
		if (ele.contains("Resolved")) {
			System.out.println("Resolved Incident Is Successfully");
			
		}
	}
	@And("Click Delete Incident Name Link Button")
	public void clickName() {
		driver.findElement(By.xpath("//a[@class='linked']")).click();
	}

}
