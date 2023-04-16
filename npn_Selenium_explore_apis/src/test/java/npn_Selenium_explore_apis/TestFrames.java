package npn_Selenium_explore_apis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFrames extends BaseClass {

	WebDriver driver;

	@Test
	public void testFrame() {
		driver = setup(driver);
		driver.navigate().to("https://www.learning.npntraining.com/selenium-practice/selenium-api/1/IFrame-Main.html");
		WebElement frameOne = driver.findElement(By.name("frame1"));
		waitForFrameAndSwitchToIt(driver, frameOne);

		driver.findElement(By.id("temp")).click();
		//getText() does not work here
		Assert.assertEquals(driver.findElement(By.id("txtName1")).getAttribute("value"), "30c");
		driver.switchTo().defaultContent();

		//observe the frame locator here.Because the frame does not have any attributes here
//		driver.switchTo().frame(1);
		WebElement frameTwo = driver.findElement(By.xpath("//iframe[2]"));
		waitForFrameAndSwitchToIt(driver, frameTwo);
		driver.findElement(By.id("temp")).click();
		Assert.assertEquals(driver.findElement(By.id("txtName2")).getAttribute("value"), "27c");

		driver.switchTo().defaultContent();

		tearDown(driver);

	}

}