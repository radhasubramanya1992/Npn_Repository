package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFirstSeleniumDefinition 
{
	WebDriver driver;
	Wait wait;
	
	@Given("Launch Facebook")
	public void launch_facebook() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	@When("Enter Username")
	public void enter_username() {
		driver.findElement(By.id("email")).sendKeys("test@test.com");
	}
	@And("Enter Password")
	public void enter_password() {
		driver.findElement(By.id("pass")).sendKeys("Hello123");
	}
	@And("Click on login")
	public void click_on_login() {
		driver.findElement(By.name("login")).click();
	}
	@Then("Validate successful message")
	public void validate_successful_message() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@data-testid='assistive_id_dialog']"))));
	}
}
