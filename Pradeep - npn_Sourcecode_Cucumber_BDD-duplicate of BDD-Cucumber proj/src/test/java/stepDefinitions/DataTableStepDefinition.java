package stepDefinitions;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDefinition {
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    System.out.println("Launch the browser");
	}

	@When("Enter username and password")
	public void enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   List<String> obj = dataTable.row(0);
	   System.out.println("The Username Is::" +obj.get(0));
	   System.out.println("The Password Is::" +obj.get(1));
	   
	}

	@Then("Verify the authentication")
	public void verify_the_authentication() {
	    System.out.println("Verification is Done!!");
	}

}
