package npn_Selenium_log4j1.x;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoggingwithDriver 
{
WebDriver driver;
Logger log = LogManager.getLogger(LoggingwithDriver.class);

@Test
 public void testDriver()
 {
	 log.info("instantiating the driver");
	 driver = new ChromeDriver();
	 log.info("driver instatiated ");
	 driver.manage().window().maximize();
	 log.info("maximized");
	 log.debug("about to launch facebook");
	 driver.get("https://www.facebook.com/");
	 log.info("Facebook launched");
 }
}
