package npn_Selenium_SeleniumDeepDive;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeBrowserOptions 
{
WebDriver driver;
@Test
public void chromebrowserOptions()
{
	Map<String, String> mobileEmulation = new HashMap<String, String>();
    mobileEmulation.put("deviceName", "Nexus 7");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("window-size=1800,1000");
        chromeOptions.addArguments("incognito");
        chromeOptions.addExtensions(new File("C:\\Users\\Radha\\Downloads\\ndgimibanhlabgdgjcpbbndiehljcpfh.crx"));
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        driver = new ChromeDriver(chromeOptions);
        driver.manage().deleteAllCookies();
        driver.get("https://expired.badssl.com/");
}
}
