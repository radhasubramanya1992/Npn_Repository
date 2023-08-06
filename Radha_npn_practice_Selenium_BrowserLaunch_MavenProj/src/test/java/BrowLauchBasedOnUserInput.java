import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowLauchBasedOnUserInput 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the browser you want to launch "
				+ "from following options:\n chrome\n firefox\n edge\n Type here:");
		String userInput = scanObj.nextLine().toLowerCase();
		driver = browserInstance(userInput);
		driver.get("https://google.com");
		driver.close();
	}
	
	 public static WebDriver browserInstance(String userInput)
	{
		switch(userInput)
		{
		case "chrome":
			return driver = new ChromeDriver();
		case "firefox":
			return driver = new FirefoxDriver();
		case "edge":
			return driver = new EdgeDriver();
		default:
			return driver = new ChromeDriver();		
		}
			 
	}

}
