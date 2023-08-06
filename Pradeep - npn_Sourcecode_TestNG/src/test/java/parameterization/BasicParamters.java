package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class BasicParamters {
	WebDriver driver;
	@Test
	@Parameters({"driverInfo","driverLoc"})
	public void ParametersTest(String driverProperty, String driverLocation) {
		System.setProperty(driverProperty, driverLocation);
		driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		if (driver.getTitle() == "Facebook – log in or sign up") {
			Verify.verify(true);
		}
		else {
			Verify.verify(false, "This test case if failed");
		}
	}

}
