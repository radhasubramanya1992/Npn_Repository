package npn_Selenium_Screenshots;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
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
	String downloadPath = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "downloads";
	
	@Test(priority = 1)
	public void testChromeDownload() throws InterruptedException {
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", preferences);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("logo.png")).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.linkText("test.txt")).click();
	}
	@Test(priority = 2)
	public void testFirefoxDownload() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		// 0-desktop 1-download 2-custom location
		profile.setPreference("browser.download.dir", downloadPath);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("testUpload.json")).click();
//		driver.findElement(By.linkText("sample.pdf")).click();
		driver.findElement(By.linkText("challenge.xlsx")).click();
	}
	@Test(priority = 3)
	public void testEdgeDownload() throws InterruptedException {
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", downloadPath);
		EdgeOptions options = new EdgeOptions();
		options.setExperimentalOption("prefs", preferences);
		driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("testing.docx")).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.linkText("CypressSelfStudy.xmind")).click();
	}
}
