import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalDropDownExample 
{
WebDriver driver;
@Test
public void normalDropDown()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//second dropdown in the page bottom - normal dropdown - button
	driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/DropDown.html");
	
	WebElement normalDD = driver.findElement(By.id("dropdownMenuButton"));
	
	if(normalDD.isDisplayed())
	{
		normalDD.click();
		WebElement home = driver.findElement(By.linkText("Home"));
		if(home.isDisplayed())
		{
			home.click();
			String homeTitle = "Big Data Hadoop Training | Selenium Training | Spark and Scala Training | Full Stack Testing Automation Training | Bangalore | NPN Training";
			Assert.assertEquals(driver.getTitle(), homeTitle);
			driver.navigate().back();
			
			String ControlsPageTitle = "User Experience";
			Assert.assertEquals(driver.getTitle(), ControlsPageTitle);
		}
	}
	
	if(normalDD.isDisplayed())
	{
		normalDD.click();
		WebElement ContactUS = driver.findElement(By.linkText("Contact Us"));
		if(ContactUS.isDisplayed())
		{
			ContactUS.click();
			String ContactUSTitle = "Contact Us - NPN Training";
			
			Assert.assertEquals(driver.getTitle(), ContactUSTitle);
			driver.navigate().back();
			
			String ControlsPageTitle = "User Experience";
			Assert.assertEquals(driver.getTitle(), ControlsPageTitle);
		}
	}
	if(normalDD.isDisplayed())
	{
		normalDD.click();
		WebElement FullStackTestAutomation = driver.findElement(By.linkText("Full Stack Test Automation"));
		if(FullStackTestAutomation.isDisplayed())
		{
			FullStackTestAutomation.click();
			String FullStackTestAutomationTitle = "Full Stack Test Automation Training - NPN Training";
			
			Assert.assertEquals(driver.getTitle(), FullStackTestAutomationTitle);
			driver.navigate().back();
			
			String ControlsPageTitle = "User Experience";
			Assert.assertEquals(driver.getTitle(), ControlsPageTitle);
		}
	}
}
}
