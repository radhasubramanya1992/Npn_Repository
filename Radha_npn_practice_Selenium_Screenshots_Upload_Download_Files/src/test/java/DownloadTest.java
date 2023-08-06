import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class DownloadTest 
{
WebDriver driver;
String downloadpath = System.getProperty("user.dir")+
	File.separator+"src"+
	File.separator+"test"+
	File.separator+"resources"+
	File.separator+"downloads";
		
@Test(priority=1)
public void testDownladChrome() throws InterruptedException
{
	HashMap preferences = new HashMap();
	preferences.put("download.default_directory",downloadpath);
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("prefs", preferences);
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/download");
	driver.findElement(By.linkText("LambdaTest.txt")).click();
	Thread.sleep(Duration.ofSeconds(5));
	driver.findElement(By.linkText("sample.png")).click();
	driver.quit();
}
@Test(priority=2)
public void testDownloadFirefox() throws InterruptedException
{
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("browser.download.folderList", 2);
	// 0-desktop 1-download 2-custom location
	profile.setPreference("browser.download.dir", downloadpath);
	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(profile);
	driver = new FirefoxDriver(options);
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/download");
	driver.findElement(By.linkText("gitcheatsheet.jpg")).click();
	Thread.sleep(Duration.ofSeconds(5));
	driver.findElement(By.linkText("PRS_Calculation.txt")).click();
	driver.quit();
}
@Test(priority=3)
public void testDownloadEdge() throws InterruptedException
{
	HashMap preferences = new HashMap();
	preferences.put("download.default_directory", downloadpath);
	EdgeOptions options = new EdgeOptions();
	options.setExperimentalOption("prefs", preferences);
	driver = new EdgeDriver(options);
	driver.manage().window().maximize();
	driver.get("http://the-internet.herokuapp.com/download");
	driver.findElement(By.linkText("homework.txt")).click();
	Thread.sleep(Duration.ofSeconds(5));
	driver.findElement(By.linkText("person.png")).click();
	driver.quit();
}
}
