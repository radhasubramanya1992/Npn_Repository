package npn_Selenium_SeleniumDeepDive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class FirefoxBrowserOptions 
{
WebDriver driver;
@Test
public void testffOptions()
{
	FirefoxOptions ffOptions = new FirefoxOptions();
	ffOptions.setAcceptInsecureCerts(true);
	driver = new FirefoxDriver(ffOptions);
	
	driver.manage().deleteAllCookies();
    driver.get("https://expired.badssl.com/");
}
}
