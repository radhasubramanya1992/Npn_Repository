package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestFirstDefinition 
{

@Given("Preconditions")
public void preconditions()
{
	System.out.println("Preconditions");
}
@When("Test Steps")
public void steps()
{
	System.out.println("STR");
}
@Then("Validation")
public void validation()
{
	System.out.println("Assert");
}
}
