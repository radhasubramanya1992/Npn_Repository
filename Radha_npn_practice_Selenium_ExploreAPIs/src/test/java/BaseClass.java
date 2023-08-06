import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass 
{
	JavascriptExecutor js;
	WebDriverWait wait;
 public WebDriver setUp(WebDriver driver)
 {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 return driver;
 }
 
 public void waitForTheElement(WebDriver driver,WebElement element)
 {
	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOf(element));
 }
 
 public void waitForFrameAndSwitchToIt(WebDriver driver,WebElement frameElement)
 {
	 wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
 }
 public void tearDown(WebDriver driver)
 {
	 driver.quit();
 }
}
