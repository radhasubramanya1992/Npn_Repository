package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass 
{
	 WebDriver driver;
	 Properties prop;
	 FileInputStream fis;
	 

	 public WebDriver chromeSetup() throws IOException
	 {
		 prop = new Properties();
		 fis = new FileInputStream(System.getProperty("user.dir")+
				 File.separator+"src"+
				 File.separator+"test"+
				 File.separator+"resurces"+
				 File.separator+"GlobalProperties");
		 prop.load(fis);
		 if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		 {
			 driver = new ChromeDriver();
		 }
		 else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get(prop.getProperty("appURL"));
		 return driver;
	 }
	 

	 public void tearDown(WebDriver driver)
	 {
		 this.driver.quit();
	 }
	
}
