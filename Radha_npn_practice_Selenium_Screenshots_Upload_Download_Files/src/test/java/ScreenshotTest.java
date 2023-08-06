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
	 
	 //create a 'TakesScreenshot' object and cast it to driver
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 
	//take screenshot of type 'File' on 'TakesScreenshot' object 
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 
	//create a .png file of type File
	//no need to create test.png explicitly, just create the screenshots folder under resources
	 File target = new File("src\\test\\resources\\screenshots\\test.png");
	 
	 //maven repo - dependency - add Apache Commons IO  first in POM for (To use FileUtils class)
	 //copy the 'File' type screenshot to 'png' type
	 FileUtils.copyFile(src, target);
	 
	 driver.quit(); 
 }
}
