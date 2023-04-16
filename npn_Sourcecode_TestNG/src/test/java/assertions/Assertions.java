package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Assertions {
	WebDriver driver;
	@Test
	public void MozillaLaunch() {
		System.setProperty("webdriver.gecko.driver", "D:\\NPN\\NPN Training - Selenium Architect Training\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		if (driver.getTitle() == "Facebook – log in or sign up ") {
			Verify.verify(true);
		}
		else {
			Verify.verify(false, "This test case if failed");
		}
//		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up ");
//		Assert.assertTrue(arg0);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
