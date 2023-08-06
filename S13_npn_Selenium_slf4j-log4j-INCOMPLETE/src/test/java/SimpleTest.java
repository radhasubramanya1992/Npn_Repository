import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class SimpleTest 
{
WebDriver driver;
Logger logger = LoggerFactory.getLogger(getClass());
@Test
public void testSimple()
{
	final Logger logger = LoggerFactory.getLogger(testSimple);
	logger.info("launching chrome");
	driver = new ChromeDriver();
	logger.debug("chrome launched");

	driver.manage().window().maximize();
	logger.debug("chrome maximized");

	driver.get("https://salesforce.com");
	logger.debug("chrome maximized");
}
}
