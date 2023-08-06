package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFirstDefinition 
{
	@Given("preconditions")
	public void preconditions() {
		 System.out.println("precodition");
	}
	@When("Test steps")
	public void test_steps() {
		 System.out.println("Steps");
	}
	@Then("Validations")
	public void validations() {
	    System.out.println("Then condition");
	}
}
