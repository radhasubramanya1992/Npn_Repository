import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesExample 
{
WebDriver driver;
@Test
public void testFrame()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.learning.npntraining.com/selenium-practice/selenium-api/1/IFrame-Main.html");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("frame1")));
	
	driver.findElement(By.id("temp")).click();
	//getText() does not work here
	Assert.assertEquals(driver.findElement(By.id("txtName1")).getAttribute("value"), "30c");
	driver.switchTo().defaultContent();
	
	//observe the frame locator here.Because the frame does not have any attributes here
//	driver.switchTo().frame(1);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[2]")));
	driver.findElement(By.id("temp")).click();
	Assert.assertEquals(driver.findElement(By.id("txtName2")).getAttribute("value"), "27c");
	driver.switchTo().defaultContent();
	
	driver.quit();
	
	//OR - you can extend Base class and call its methods, as shown below:
	
//	driver = setup(driver);
//	driver.navigate().to("https://www.learning.npntraining.com/selenium-practice/selenium-api/1/IFrame-Main.html");
//	WebElement frameOne = driver.findElement(By.name("frame1"));
//	waitForFrameAndSwitchToIt(driver, frameOne);
//
//	driver.findElement(By.id("temp")).click();
//	//getText() does not work here
//	Assert.assertEquals(driver.findElement(By.id("txtName1")).getAttribute("value"), "30c");
//	driver.switchTo().defaultContent();
//
//	//observe the frame locator here.Because the frame does not have any attributes here
////	driver.switchTo().frame(1);
//	WebElement frameTwo = driver.findElement(By.xpath("//iframe[2]"));
//	waitForFrameAndSwitchToIt(driver, frameTwo);
//	driver.findElement(By.id("temp")).click();
//	Assert.assertEquals(driver.findElement(By.id("txtName2")).getAttribute("value"), "27c");
//
//	driver.switchTo().defaultContent();
//
//	tearDown(driver);

}
}
