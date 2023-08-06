package npn_Selenium_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWebDriverWait 
{
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//page load wait is not used explicitly because by default , 
		//selenium sets pageload time to -1 i.e it waits for a page to load indefinitely
		//driver.manage(). timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
	
	@Test(priority = 1)
	public void WebDriverWaitExample()
	{
		driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ExplicitWait/TextBox_Wait.html");
		//WebDriver wait(explicit)
		//3 parameters in webdriverwait - (driver instance, timeout time, sleep time)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15), Duration.ofSeconds(1));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buggy1")));
		driver.findElement(By.id("buggy1")).sendKeys("One");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buggy2")));
		driver.findElement(By.id("buggy2")).sendKeys("Two");
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buggy3")));
		driver.findElement(By.id("buggy3")).sendKeys("Three");
	}
	
	@Test(priority = 2)
	public void FluentWaitExample()
	{
		driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ExplicitWait/TextBox_Wait.html");
		//Fluent wait(explicit)
		Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		fluent.until(ExpectedConditions.visibilityOfElementLocated(By.id("buggy1")));
		driver.findElement(By.id("buggy1")).sendKeys("One");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
