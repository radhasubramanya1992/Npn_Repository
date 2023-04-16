package npn_Selenium_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFluentWait 
{
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void FluentWaitExampleTwo()
	{
		driver.get("https://www.learning.npntraining.com/selenium-practice/waits/FluentWait/DropDown.html");
		
		Select select = new Select(driver.findElement(By.id("userexp")));
		select.selectByValue("success_calls");
		
		//Fluent wait(explicit)
		Wait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		
		fluent.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
		Assert.assertEquals(driver.findElement(By.id("result")).getText(), "1");	
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
