package npn_Selenium_Screenshots;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestExtentReports 
{
		//View the extent report, Steps:
		//After running the test, view console to find line like this - 
		//See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
		//Copy and paste in browser and view the report
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd_HHmmSS");
	LocalDateTime now = LocalDateTime.now();
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter sparkReporter;
	ExtentTest test;
	@BeforeClass
	public void setup() 
	{
		String reporterPath = System.getProperty("user.dir")+
				File.separator+"src"+
				File.separator+"test"+
				File.separator+"resources"+
				File.separator+"reports"+
				File.separator+"testReport"+"_"+dtf.format(now)+".html";
		sparkReporter = new ExtentSparkReporter(reporterPath);
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("Hey these are my tests");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("My Reports");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void testExtentOne() 
	{
		test = extent.createTest("FacebookTest");
		driver.get("https://facebook.com");
		test.log(Status.INFO, "Facebook is being launched");
		if(driver.getTitle().equals("Facebook – log in or sign u")) {
			test.log(Status.PASS, "Facebook Page title matched");
		} else {
			test.log(Status.FAIL, "Facebook Page title mismatched");
		}
	}
	@Test(priority = 2)
	public void testExtetTwo() 
	{
		test = extent.createTest("LinkedIn Test");
		driver.get("https://linkedin.com");
		test.info("Linkedin have been launched");
		if(driver.getTitle().equals("LinkedIn: Log In or Sign U")) {
			test.pass("Linked in page title matched");
		} else {
			test.fail("Linked in page title mismatched");
		}
	}	
	@AfterClass
	public void tearDown() 
	{
		extent.flush();
		driver.quit();
	}
}
