package Advanced_Interactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextClickExample 
{
WebDriver driver;

@Test
public void contextClickMethod()
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.learning.npntraining.com/selenium-practice/actions/ContextClick.html#");
	
	WebElement rightClickElement = driver.findElement(By.id("div-context"));
	Actions action = new Actions(driver);
	action.contextClick(rightClickElement).perform();
	
	WebElement itemOne = driver.findElement(By.xpath("//a[text()='Item 1']//parent::li"));
	itemOne.click();
	
	Alert alert = driver.switchTo().alert();
	Assert.assertEquals(alert.getText(), "Item 1 Clicked");
	alert.accept();
	
	driver.quit();
}
}
