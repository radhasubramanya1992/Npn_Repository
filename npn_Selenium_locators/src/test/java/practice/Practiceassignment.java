package practice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import npn_selenium_locators.BaseClass;

public class Practiceassignment extends BaseClass{
	@Test
	public void testFacebook()
	{
		driver = chromeSetup();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		waitForSeconds(3);
//		//Defining elements
//		WebElement userName = driver.findElement(By.id("email"));
//		WebElement password = driver.findElement(By.id("pass"));
//		WebElement signIn = 
//				driver.findElement(By.cssSelector("button[data-testid='royal_login_button']"));
	//	
//		//Actions
//		userName.sendKeys("name");
//		waitForSeconds(3);
//		password.sendKeys("pass");
//		waitForSeconds(3);
//		signIn.click();
//		waitForSeconds(3);
//		tearDown();	
		
		//Verify all the links behavior, 
		//whether they are navigating to expected location or not
		
		List<WebElement> fbLinksList = driver.findElements(By.tagName("a"));
		
		for (WebElement element : fbLinksList) 
		{
			System.out.println(element.getText()+"\t"+element.getAttribute("href"));
			//element.click();
//			if(element.isEnabled())
//			{
//				System.out.println("This link is functional");
//			}
//			else 
//			{
//				System.out.println("This link is NOT functional");
//			}
		}
		
//		for (WebElement element : fbLinksList) 
//		{
//			String expectedUrl = element.getAttribute("href");
//			//error throwing line
//			//element.findElement(By.xpath("//a")).click();
//			//even the below line is failing
//			element.click();
//			String ActualUrl = WindowHandle_Demo();
//			if(ActualUrl.equals(expectedUrl))
//			{
//				System.out.println("Links are navigating to expected location");
//			}
//			else
//			{
//				System.out.println("Links are NOT navigating to expected location");
//			}
//			
//		}
//				
//		tearDown();
//	}
//	public String WindowHandle_Demo() { 
//		String Actual = null;
//			// It will return the parent window name as a String
//			String parent=driver.getWindowHandle();
//			Set<String>s=driver.getWindowHandles();
//
//			// Now iterate using Iterator
//			Iterator<String> I1= s.iterator();
//
//			while(I1.hasNext())
//			{
//
//			String child_window=I1.next();
//
//
//			if(!parent.equals(child_window))
//			{
//				driver.switchTo().window(child_window);
//				Actual = driver.switchTo().window(child_window).getCurrentUrl();
//			}
//
//			}
//				//switch to the parent window
//				driver.switchTo().window(parent);
//				return Actual;
//	}
}
}
