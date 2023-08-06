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

public class TestExtentReport1 
{
	//View the extent report, Steps:
	//After running the test, view console to find line like this - 
	//See 
	//Copy and paste in browser and view the report
	
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter sparkReporter;
	ExtentTest test;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd_HH-MM-SS");
	LocalDateTime now = LocalDateTime.now();
	
	@BeforeClass
	public void setUp() 
	{
		String reporterpath = System.getProperty("user.dir")+
				File.separator+"src"+
				File.separator+"test"+
				File.separator+"resources"+
				File.separator+"reports"+
				File.separator+"testReport"+"_"+dtf.format(now)+".html";
		sparkReporter = new ExtentSparkReporter(reporterpath);
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("Radha Tests");
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
		if(driver.getTitle().equals("Facebook – log in or sign up"))
		{
			test.log(Status.PASS, "Facebook Page title matched");
		}
		else
		{
			test.log(Status.FAIL, "Facebook Page title mismatched");
		}
	}
	
	@Test(priority = 2)
	public void testExtetTwo() 
	{
	test = extent.createTest("LinkedIn Test");
	driver.get("https://linkedin.com");
	test.info("Linkedin have been launched");
	if(driver.getTitle().equals("LinkedIn: Log In or Sign Up"))
	{
		test.pass("Linked in page title matched");
	}
	else
	{
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
