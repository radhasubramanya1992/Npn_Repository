package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicSeleniumStepDefinition {
	
	WebDriver driver;
	
	@Given("LaunchChromeBrowser")
	public void launchchromebrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\NPN\\NPN Training - Selenium Architect Training\\drivers\\chromedriver.exe");	//Initiated the system properties for Chrome browser
		driver= new ChromeDriver();	//Initated the chrome driver
	   
	}

	@When("Navigate To NPN Training Website")
	public void navigate_To_NPN_Training_Website() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.npntraining.com/");	//Launched NPN Training website
	    
	}

	@Then("Verify Whether NPN Training Website was launched or not")
	public void verify_Whether_NPN_Training_Website_was_launched_or_not() {
		String Expected = "Big Data, Spark Training & Selenium Testing Institutes In Bangalore";
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, Expected);
	}
		
	@When("Navigate to Courses")
	public void navigate_to_courses() {
		System.out.println("Navigate to Courses");
		
	}
	
	@Then("Verify Whether the courses are displayed or not")
	public void verify_whether_courses_displayed_or_not() {
		System.out.println("Corses were displayed");
	}
	    

}
