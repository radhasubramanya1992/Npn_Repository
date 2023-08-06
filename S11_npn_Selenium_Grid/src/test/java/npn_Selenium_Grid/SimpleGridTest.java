package npn_Selenium_Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SimpleGridTest 
{
	WebDriver driver;
	@Test
	public void testSeleniumGrid() throws MalformedURLException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		FirefoxOptions ffOptions = new FirefoxOptions();
		driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"), ffOptions);
		driver.manage().window().maximize();
		Thread.sleep(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
	}
}