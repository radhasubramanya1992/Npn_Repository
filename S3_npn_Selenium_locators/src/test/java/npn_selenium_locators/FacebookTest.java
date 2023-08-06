package npn_selenium_locators;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FacebookTest extends BaseClass {
	@Test
public void testFacebook()
{
	driver = chromeSetup();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	waitForSeconds(3);
//	//Defining elements
//	WebElement userName = driver.findElement(By.id("email"));
//	WebElement password = driver.findElement(By.id("pass"));
//	WebElement signIn = 
//			driver.findElement(By.cssSelector("button[data-testid='royal_login_button']"));
//	
//	//Actions
//	userName.sendKeys("name");
//	waitForSeconds(3);
//	password.sendKeys("pass");
//	waitForSeconds(3);
//	signIn.click();
//	waitForSeconds(3);
//	tearDown();	
	
	//Verify all the links behavior, 
	//whether they are navigating to expected location or not
	
	List<WebElement> fbLinksList = driver.findElements(By.tagName("a"));
	
	for (WebElement element : fbLinksList) 
	{
		System.out.println(element.getText()+"\t"+element.getAttribute("href"));
		if(element.isEnabled())
		{
			System.out.println("This link is functional");
		}
		else 
		{
			System.out.println("This link is NOT functional");
		}
	}	
}
	public void verifyLinkUrl(String linkUrl) throws Exception 
	{
			try {
				URL url = new URL(linkUrl);
				HttpURLConnection httpUrlConnect = (HttpURLConnection) url.openConnection();
				httpUrlConnect.connect();
				if (httpUrlConnect.getResponseCode() == 200) 
				{
					System.out.println(linkUrl + " - " + httpUrlConnect.getResponseMessage());
				}
				if (httpUrlConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) 
				{
					System.out.println(linkUrl + " - " + httpUrlConnect.getResponseMessage());
				}
			}
			catch(Exception e)
			{
				
			}
	}		
}
