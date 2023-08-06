package npn_selenium_advanced_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragAndDropEample 
{
	WebDriver driver;
	Actions action;
	WebElement target;
	WebElement oneButton;
	WebElement twoButton;
	WebElement threeButton;
	WebElement fourButton;
	WebElement fiveButton;
	
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.learning.npntraining.com/selenium-practice/actions/MoveByOffset.html");
		Thread.sleep(3000);
		action = new Actions(driver);
		target = driver.findElement(By.id("obliterate"));	
	}
	@Test(priority=1)
	public void testOneButton() throws InterruptedException
	{
		oneButton = driver.findElement(By.id("one"));
		Thread.sleep(3000);
		action.moveToElement(oneButton).clickAndHold().moveToElement(target).release().perform();
		Thread.sleep(3000);	
	}
	@Test(priority=2)
	public void testTwoButton() throws InterruptedException
	{
		twoButton = driver.findElement(By.id("two"));
		Thread.sleep(3000);
		action.clickAndHold(twoButton).release(target).perform();
		Thread.sleep(3000);
	}
	@Test(priority=3)
	public void testThreeButton() throws InterruptedException
	{
		threeButton = driver.findElement(By.id("three"));
		Thread.sleep(3000);
		action.dragAndDrop(threeButton, target).perform();
		Thread.sleep(3000);	
	}
	
	@Test(priority=4)
	public void testFourButton() throws InterruptedException
	{
		fourButton = driver.findElement(By.id("four"));
		Thread.sleep(3000);
		action.dragAndDrop(fourButton, target).perform();
		Thread.sleep(3000);	
	}
	
	@Test(priority=5)
	public void testFiveButton() throws InterruptedException
	{
		fiveButton = driver.findElement(By.id("five"));
		Thread.sleep(3000);
		action.dragAndDrop(fiveButton, target).perform();
		Thread.sleep(3000);	
	}
	@AfterClass
	 public void tearDown()
	 {
		driver.quit();
	 }
}
