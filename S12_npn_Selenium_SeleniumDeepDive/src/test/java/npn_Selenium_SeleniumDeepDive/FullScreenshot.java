package npn_Selenium_SeleniumDeepDive;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreenshot 
{
	WebDriver driver;
	@Test
	public void testffFullscreen() throws IOException
	{
		driver = new FirefoxDriver();
		driver.get("https://salesforce.com");
		
		File fullSS = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullSS, new File("./screenshots/firefoxfs.png"));
	}
	
	@Test
	public void testchromeFullscreen() throws IOException
	{
		driver = new ChromeDriver();
		driver.get("https://salesforce.com");
		
		Screenshot chromess = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
		ImageIO.write(chromess.getImage(), "png", new File("./screenshots/chromefs.png"));
	}
}
