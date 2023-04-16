import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleBrowserLaunch 
{
static WebDriver driver;
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"D:\\Selenium_npn\\softwares\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.get("https://facebook.com");
	driver.close();
	
	
	System.setProperty("webdriver.gecko.driver", 
			"D:\\Selenium_npn\\softwares\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://google.com");
	driver.close();
}
}
