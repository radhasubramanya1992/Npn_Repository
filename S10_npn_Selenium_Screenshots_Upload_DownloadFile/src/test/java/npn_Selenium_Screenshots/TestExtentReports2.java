package npn_Selenium_Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestExtentReports2 {
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
	public void setup() {
		String reporterPath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"reports"+File.separator+"testReport"+"_"+dtf.format(now)+".html";
		sparkReporter = new ExtentSparkReporter(reporterPath);
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("Hey this is my tests");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("My Reports");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void testExtentOne() {
		test = extent.createTest("FacebookTest");
		driver.get("https://facebook.com");
		test.log(Status.INFO, "Facebook is being launched");
		Assert.assertFalse(true);
	}
	@Test(priority = 2)
	public void testExtetTwo() throws InterruptedException {
		test = extent.createTest("LinkedIn Test");
		driver.get("https://linkedin.com");
		test.info("Linkedin have been launched");
		Assert.assertTrue(true);	
	}
	
	@AfterClass
	public void tearDown() 
	{
		extent.flush();
		driver.quit();
	}
	
	@AfterMethod
	public void getResults(ITestResult result) throws IOException {
		if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "The test case passed");
		} else if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getThrowable());
			test.addScreenCaptureFromPath(takeScreenShot());
			
		}
	}
	
	public String takeScreenShot() throws IOException {
		String screenShotPath = System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"screenshots"+File.separator+"screenshot"+"_"+dtf.format(now)+".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(screenShotPath));
		return screenShotPath;
	}
}
