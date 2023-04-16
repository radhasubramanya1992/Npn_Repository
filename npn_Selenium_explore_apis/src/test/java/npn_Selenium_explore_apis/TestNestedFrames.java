package npn_Selenium_explore_apis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNestedFrames extends BaseClass
{
	WebDriver driver;

	@Test
	public void testNestedFrame() 
	{
		driver = setup(driver);
		driver.navigate().to("https://www.learning.npntraining.com/selenium-practice/selenium-api/frames/FrameInsideFrame.html");
		waitForFrameAndSwitchToIt(driver, driver.findElement(By.xpath("//iframe[@src='Frame.html']")));


		waitForFrameAndSwitchToIt(driver, driver.findElement(By.xpath("//iframe[@src='FrameInside.html']")));
		driver.findElement(By.id("txt3")).clear();
		driver.findElement(By.id("txt3")).sendKeys("Hi");
		driver.switchTo().parentFrame();
		
		//waitForFrameAndSwitchToIt(driver, driver.findElement(By.xpath("//iframe[@src='Frame.html']")));
		driver.findElement(By.id("txt2")).clear();
		driver.findElement(By.id("txt2")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.id("txt1")).clear();
		driver.findElement(By.id("txt1")).sendKeys("bye");
		tearDown(driver);
	}
}
