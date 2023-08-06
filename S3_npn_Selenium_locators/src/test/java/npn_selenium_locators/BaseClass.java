package npn_selenium_locators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
public WebDriver driver;

public WebDriver chromeSetup()
{
	return driver = new ChromeDriver();
}

public WebDriver firefoxSetup()
{
	return driver = new FirefoxDriver();
}

public WebDriver edgeSetup()
{
	return driver = new EdgeDriver();
}

public void waitForSeconds(int number)
{
	try {
		Thread.sleep(Duration.ofSeconds(number));
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void tearDown()
{
	driver.quit();
}
}
