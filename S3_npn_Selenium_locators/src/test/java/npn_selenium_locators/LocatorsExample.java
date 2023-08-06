package npn_selenium_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsExample 
{
WebDriver driver;

@BeforeTest
public void driverSetup()
{
	driver = new ChromeDriver();
}

@Test
public void testLocators()
{
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	//id
	//driver.findElement(By.id("email")).sendKeys("NPN");
	
	//name
	//driver.findElement(By.name("pass")).sendKeys("hi");
	
	//link text
	//driver.findElement(By.linkText("Forgotten password?")).click();
	
	//partial link text
	//driver.findElement(By.partialLinkText("Forgotten password")).click();
	
	//tagName
	//findElements
	List<WebElement> list = driver.findElements(By.tagName("a"));
	System.out.println(list);
	
	for (WebElement element : list) 
	{
		//System.out.println(element.getAttribute("href"));
		//System.out.println(element.getText());
		
		System.out.println(element.getText()+":\t"+element.getAttribute("href"));
	}
	driver.close();	
}
}
