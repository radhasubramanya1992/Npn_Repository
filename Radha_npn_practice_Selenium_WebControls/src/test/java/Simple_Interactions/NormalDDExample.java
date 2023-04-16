package Simple_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalDDExample 
{
WebDriver driver;

@Test
public void normalDdExp()
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/DropDown.html");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton")));
	driver.findElement(By.id("dropdownMenuButton")).click();
	WebElement home = driver.findElement(By.linkText("Home"));
	
	if(home.isDisplayed())
	{
		home.click();
		String homeTitle = "Big Data Hadoop Training | Selenium Training | Spark and Scala Training | Full Stack Testing Automation Training | Bangalore | NPN Training";
		Assert.assertEquals(driver.getTitle(), homeTitle);
		driver.navigate().back();
		
		String controlsPageTitle = "User Experience";
		Assert.assertEquals(driver.getTitle(), controlsPageTitle);
	}
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton")));
	driver.findElement(By.id("dropdownMenuButton")).click();
	WebElement contactUs = driver.findElement(By.linkText("Contact Us"));
	
	if(contactUs.isDisplayed())
	{
		contactUs.click();
		String contactUsTitle = "Contact Us - NPN Training";
		Assert.assertEquals(driver.getTitle(), contactUsTitle);
		driver.navigate().back();
		
		String controlsPageTitle = "User Experience";
		Assert.assertEquals(driver.getTitle(), controlsPageTitle);
	}
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton")));
	driver.findElement(By.id("dropdownMenuButton")).click();
	WebElement fullStack = driver.findElement(By.linkText("Full Stack Test Automation"));
	
	if(fullStack.isDisplayed())
	{
		fullStack.click();
		String fullStackTitle = "Full Stack Test Automation Training - NPN Training";
		Assert.assertEquals(driver.getTitle(), fullStackTitle);
		driver.navigate().back();
		
		String controlsPageTitle = "User Experience";
		Assert.assertEquals(driver.getTitle(), controlsPageTitle);
	}
driver.quit();
}
}
