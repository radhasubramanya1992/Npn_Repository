package sample_maven;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserInputBrowserAssignment 
{
	static WebDriver driver;
public static void main(String[] args) 
{
	//Create scanner object
	Scanner scanObj = new Scanner(System.in);
	//Display Input message
	System.out.println("Enter the browser to be "
			+ "lauched from following options:\nChrome\nFirefox\nEdge\nType here:");
	//Scan the user input and convert it to lower case
	String userInput = scanObj.nextLine().toLowerCase();
	//Call method to instantiate the browser
	browserInstance(userInput);
	//Launch the browser
	driver.get("https://google.com");
	//close the browser
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
