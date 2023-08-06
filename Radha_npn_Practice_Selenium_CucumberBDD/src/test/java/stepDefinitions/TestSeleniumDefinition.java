package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSeleniumDefinition 
{
WebDriver driver;
@Given("Launch Facebook")
public void launchFacebook()
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");	
}
@When("Enter Username")
public void enterUserName()
{
	driver.findElement(By.id("email")).sendKeys("test@test.com");
}
@And("Enter Password")
public void enterPassword()
{
	driver.findElement(By.id("pass")).sendKeys("Welcome123");
}
@And("Click on login")
public void clickLogin()
{
	driver.findElement(By.name("login")).click();;
}
@Then("Validate confirmation message")
public void validateConfirmationMsg()
{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='assistive_id_dialog']")));
	
}
}
