package Advanced_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragandDropExample 
{
WebDriver driver;
@Test
public void dragAndDropTest() throws InterruptedException
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.learning.npntraining.com/selenium-practice/actions/MoveByOffset.html");
	
	WebElement target = driver.findElement(By.id("obliterate"));
	
	Actions action = new Actions(driver);
	
	action.dragAndDrop(driver.findElement(By.id("one")), target).perform();
	Thread.sleep(3000);
	
	action.clickAndHold(driver.findElement(By.id("two"))).release(target).perform();
	Thread.sleep(3000);
	
	action.moveToElement(driver.findElement(By.id("three"))).clickAndHold().moveToElement(target).release().build().perform();
	Thread.sleep(3000);
	
	driver.quit();
}
}