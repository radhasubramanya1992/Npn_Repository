package npn_Selenium_SeleniumDeepDive;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.emulation.Emulation;
import org.openqa.selenium.devtools.v113.security.Security;
import org.testng.annotations.Test;

public class CDP1 
{
	WebDriver driver;
	@Test
public void testCDPOne()
{
	driver = new ChromeDriver();
	Optional<DevTools> devtools = ((ChromeDriver)driver).maybeGetDevTools();
	DevTools dev = devtools.get();
	dev.createSession();
	dev.send(Security.enable());
	dev.send(Security.setIgnoreCertificateErrors(true));
	driver.get("https://expired.badssl.com");
}
}
