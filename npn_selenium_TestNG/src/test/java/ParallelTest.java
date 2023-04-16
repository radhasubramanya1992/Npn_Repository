import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelTest 
{
WebDriver driver;

@Test
 public void testChrome() throws InterruptedException
 {
//	 ChromeOptions options = new ChromeOptions();
//	 options.addArguments("--remote-allow-origins=*");
//	 driver = new ChromeDriver(options);
	
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(3000);
 }
 
@Test
 public void testFF() throws InterruptedException
 {
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(3000);
 }

@AfterClass
public void tearDown()
{
	driver.quit();
}
}
