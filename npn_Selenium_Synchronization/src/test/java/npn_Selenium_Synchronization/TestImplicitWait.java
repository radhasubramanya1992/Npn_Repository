package npn_Selenium_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestImplicitWait 
{
	WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void TestImplicitExampleOne()
	{
		 driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ImplicitWait/Wait.html");
		 WebElement firstInputBox = driver.findElement(By.id("buggy1"));
		 WebElement secondInputBox = driver.findElement(By.id("buggy2"));
		 WebElement thirdInputBox = driver.findElement(By.id("buggy3"));
		 
		 firstInputBox.sendKeys("One");
		 secondInputBox.sendKeys("Two");
		 thirdInputBox.sendKeys("Three");
	}
	@Test
	public void TestImplicitExampleTwo()
	{
		driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ImplicitWait/RetrievingDetailsWithLoading.html");
		WebElement abtCompanyButton = driver.findElement(By.id("myButton"));
		abtCompanyButton.click();
		WebElement resultBox = driver.findElement(By.id("result"));
		Assert.assertEquals(resultBox.getText(), "Hello");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
