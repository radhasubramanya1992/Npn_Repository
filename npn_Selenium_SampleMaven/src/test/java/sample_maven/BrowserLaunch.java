package sample_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BrowserLaunch {

	static WebDriver driver;

	public static void main(String[] args) {

		// method 1 - selenium 4.5.0
        //	WebDriverManager.chromedriver().setup();

		/*
		 * driver = new ChromeDriver(); driver.get("https://facebook.com");
		 * driver.close();
		 */
		//  method 2 - selenium 4.5.0
		/*
		 * driver = WebDriverManager.chromedriver().create();
		 * 
		 * driver.get("https://facebook.com"); driver.close();
		 */
		
		//method 3 - selenium 4.6.0
		
//		driver = new ChromeDriver();
//		driver.get("https://facebook.com");
//		driver.close();
//		
		driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.close();
		
//		driver = new EdgeDriver();
//		driver.get("https://facebook.com");
//		driver.close();

	}
}
