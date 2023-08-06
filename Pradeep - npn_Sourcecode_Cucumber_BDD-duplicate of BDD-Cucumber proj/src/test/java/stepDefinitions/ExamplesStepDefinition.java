package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExamplesStepDefinition {
	
    @Given("^I want to write a step with (.+)$")
    public void i_want_to_write_a_step_with(String name){
    	System.out.println("The Name is:"+name);
    
    }

    @When("^I check for the (.+) in step$")
    public void i_check_for_the_in_step(String value){
    	System.out.println("The Value is:" +value);
     
    }

    @Then("^I verify the (.+) in step$")
    public void i_verify_the_in_step(String status){
    	System.out.println("The Status is:" +status);
    
    }

}
