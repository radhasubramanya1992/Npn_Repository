import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class WindowsExample extends BaseClass
{
WebDriver driver;
String parentWindow;
String helpWindow;
String chatWindow;


@Test
public void testWindowHandles() throws InterruptedException
{
	driver = setUp(driver);
	driver.get("https://www.learning.npntraining.com/selenium-practice/popups/Popup.html");
	parentWindow = driver.getWindowHandle();
	System.out.println("The parent window handle :: " + parentWindow);
	
	driver.findElement(By.id("help")).click();
	Set<String> windows = driver.getWindowHandles();
	
	//for-each Approach 
//	for (String window : windows) 
//	{
//		System.out.println("The window handle is :: " + window);
//		if(!window.equalsIgnoreCase(parentWindow)) 
//		{
//			driver.switchTo().window(window);
//			waitForTheElement(driver, driver.findElement(By.id("tt")));
//			System.out.println("The help window data is :: " + driver.findElement(By.id("tt")).getText());
//		}
//	}
	
	//Iterator Approach
	Iterator<String> it = windows.iterator();
	while(it.hasNext())
	{
		//System.out.println(it.next());
		String childWindow = it.next().toString();
		if(!childWindow.equalsIgnoreCase(parentWindow))
		{
			helpWindow = childWindow;
			System.out.println("Help window handle is :: " + helpWindow);
			driver.switchTo().window(helpWindow);
			waitForTheElement(driver, driver.findElement(By.id("tt")));
			System.out.println("The help window data is :: " + driver.findElement(By.id("tt")).getText());
//			driver.close();
//			Thread.sleep(5000);
		}
	}
	driver.switchTo().window(parentWindow);
	
	driver.findElement(By.id("chat")).click();
	Set<String> multipleWindows = driver.getWindowHandles();
	Iterator<String> iter = multipleWindows.iterator();
	
	while(iter.hasNext())
	{
		String differentWindows = iter.next().toString();
		System.out.println("set of windows :  "+differentWindows);
		if(!(differentWindows.equalsIgnoreCase(parentWindow)||differentWindows.equalsIgnoreCase(helpWindow)))
		{
			chatWindow = differentWindows;
			//System.out.println("chatwindow is::"+chatWindow);
			driver.switchTo().window(chatWindow);
			waitForTheElement(driver, driver.findElement(By.xpath("//body")));
			System.out.println("The chatt window data is :: " + driver.findElement(By.xpath("//body")).getText());
//			System.out.println("The title of Chat Window is :: " + driver.getTitle());
//			Assert.assertEquals(driver.getTitle(), "Chat Info");
			
			Thread.sleep(5000);
			
		}
	}
	tearDown(driver);
}
}
