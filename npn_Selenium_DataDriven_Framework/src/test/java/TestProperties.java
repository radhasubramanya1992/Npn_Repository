import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestProperties 
{
WebDriver driver;
@Test
public void testProperties() throws IOException
{
	FileInputStream fis = new FileInputStream("src\\test\\resources\\test.properties");
	
	//Define properties object
	Properties prop = new Properties();
	//load respective properties file
	prop.load(fis);
	
	
	//if you are writing using if-else ladder
//	if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
//	{
//		driver = new ChromeDriver();
//	}
//	else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
//	{
//		driver = new FirefoxDriver();
//	}
//	else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
//	{
//		driver = new EdgeDriver();
//	}
//	else 
//	{
//		driver = new ChromeDriver();
//	}
	
	//if you are writing using switch
	switch (prop.getProperty("browser").toLowerCase()) {
	case "chrome": 
		driver = new ChromeDriver();
		break;
	
	case "firefox": 
		driver = new FirefoxDriver();
		break;
		
	case "edge": 
		driver = new EdgeDriver();
		break;
		
	default:
		driver = new ChromeDriver();
		break;
	}

	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("pass")).sendKeys(prop.getProperty("username"));
	driver.quit();
}
}
