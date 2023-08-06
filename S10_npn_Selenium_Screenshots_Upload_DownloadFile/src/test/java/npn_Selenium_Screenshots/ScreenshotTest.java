package npn_Selenium_Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotTest 
{
	//maven repo - dependency - add Apache Commons IO  first in POM for (To use FileUtils class)
	WebDriver driver;
	
	@Test
	public void testScreenshot() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		//maven repo - dependency - add Apache Commons IO  first in POM for (To use FileUtils class)
		File target = new File("src\\test\\resources\\screenshots\\test.png");
		FileUtils.copyFile(src, target);
		driver.quit();
	}
}
