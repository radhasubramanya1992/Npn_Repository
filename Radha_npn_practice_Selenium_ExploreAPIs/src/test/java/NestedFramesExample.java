import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NestedFramesExample extends BaseClass
{
WebDriver driver;
@Test
 public void testNestedFrames() throws InterruptedException
 {
	 driver = setUp(driver);
	 driver.get("https://www.learning.npntraining.com/selenium-practice/selenium-api/frames/FrameInsideFrame.html");
	 
	 waitForFrameAndSwitchToIt(driver,driver.findElement(By.xpath("//iframe[@src='Frame.html']")));
	 waitForFrameAndSwitchToIt(driver,driver.findElement(By.xpath("//iframe[@src='FrameInside.html']")));
	 driver.findElement(By.id("txt3")).sendKeys("frame2 inside frame1");
	 driver.switchTo().parentFrame();
	 
	 driver.findElement(By.id("txt2")).sendKeys("element inside frame1");
	 driver.switchTo().defaultContent();
	 
	 driver.findElement(By.id("txt1")).sendKeys("element not inside any frame");
	 
	 Thread.sleep(5000);
	 
	 tearDown(driver);
 }
}
