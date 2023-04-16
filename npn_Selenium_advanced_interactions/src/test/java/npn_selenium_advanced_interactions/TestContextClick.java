package npn_selenium_advanced_interactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestContextClick 
{
WebDriver driver;
 public void ContextClickTest() throws InterruptedException
 {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.learning.npntraining.com/selenium-practice/actions/ContextClick.html#");
	 
	 WebElement rightClickMenu = driver.findElement(By.id("div-context"));
	 WebElement itemOne = driver.findElement(By.xpath("//a[text()='Item 1']//parent::li"));
	 
	 Actions action = new Actions(driver);
	 action.contextClick(rightClickMenu).perform();
	 Thread.sleep(3000);
	 itemOne.click();
	 Thread.sleep(3000);
	 Alert alert = driver.switchTo().alert();
	 Assert.assertEquals(alert.getText(), "Item 1 Clicked");
	 Thread.sleep(3000);
	 alert.accept();
	 Thread.sleep(3000);
	 driver.quit();
 }
}
