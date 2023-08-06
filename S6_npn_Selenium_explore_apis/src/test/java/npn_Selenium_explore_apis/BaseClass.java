package npn_Selenium_explore_apis;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
//	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	
	public WebDriver setup(WebDriver driver) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	public void tearDown(WebDriver driver) {
		driver.quit();
	}
	
	public void waitForTheElement(WebDriver driver, WebElement element) {
//		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForFrameAndSwitchToIt(WebDriver driver, WebElement frameElement) {
//		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}
}