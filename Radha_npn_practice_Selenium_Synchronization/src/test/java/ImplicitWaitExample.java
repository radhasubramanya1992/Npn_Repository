import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ImplicitWaitExample 
{
WebDriver driver;
@BeforeClass
public void setUp()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
public void testImplicitWaitOne() throws InterruptedException
{
	driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ImplicitWait/Wait.html");
	WebElement num1 = driver.findElement(By.id("buggy1"));
	WebElement num2 = driver.findElement(By.id("buggy2"));
	WebElement num3 = driver.findElement(By.id("buggy3"));
	
	
	num1.sendKeys("ONE");
	num2.sendKeys("TWO");
	num3.sendKeys("THREE");
	Thread.sleep(5000);
}

@Test
public void testImplicitWaitTwo()
{
	driver.get("https://www.learning.npntraining.com/selenium-practice/waits/ImplicitWait/RetrievingDetailsWithLoading.html");
	WebElement abtComp = driver.findElement(By.id("myButton"));
	abtComp.click();
	WebElement resultBox = driver.findElement(By.id("result"));
	Assert.assertEquals(resultBox.getText(), "Hello");
}

@AfterClass
public void tearDown()
{
	driver.quit();
}
}


