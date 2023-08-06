package Advanced_Interactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickExample 
{
WebDriver driver;

@Test
public void doubleClick()
{
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.learning.npntraining.com/selenium-practice/actions/DoubleClick.html");
	
	WebElement clickMe = driver.findElement(By.name("dblClick"));
	Actions action = new Actions(driver);
	action.doubleClick(clickMe).perform();
	
	Alert alert = driver.switchTo().alert();
	Assert.assertEquals(alert.getText(), "Double Clicked !!");
	alert.accept();
	
	driver.quit();
}
}
