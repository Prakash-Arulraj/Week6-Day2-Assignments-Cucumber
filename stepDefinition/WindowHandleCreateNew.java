package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class WindowHandleCreateNew extends BaseStep {

	Set<String> allWindowHandles = driver.getWindowHandles();

	List<String> NextWindowHandles = new ArrayList<String>(allWindowHandles);

	@And("Window Handling To CallerId SubWindow")
	public void switchToSubWindow1() {
		System.out.println("WindowHandling: " + allWindowHandles.size());
		System.out.println(" ");

		driver.switchTo().window(NextWindowHandles.get(1));

		System.out.println("Sub-Window Title: " + driver.getTitle());
		System.out.println("Sub-Window URL: " + driver.getCurrentUrl());
		System.out.println(" ");
	}

	@Then("Sub Window Again Comes To Parent Window")
	public void comesParentWindow() {
		// Comes Again Parent Window
		driver.switchTo().window(NextWindowHandles.get(0));
	}

}
