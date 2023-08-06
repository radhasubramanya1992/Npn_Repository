package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstStepDefinition {
	
	@Given("First Pre-Condition")
	public void first_Pre_Condition() {
	   System.out.println("This is FIRST Given");
	}

	@When("First when condition")
	public void first_when_condition() {
	    System.out.println("This is FIRST When");
	}

	@Then("Verify the conditions")
	public void verify_the_conditions() {
		System.out.println("This is FIRST Then");
	}
	
	

}
