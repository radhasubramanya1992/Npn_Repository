import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertsExample extends BaseClass
{
WebDriver driver;

@BeforeClass
public void before()
{
	driver = setUp(driver);
	driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
}

@AfterClass
public void tear()
{
	tearDown(driver);
}

@Test(priority=1)
public void testOne()
{
	driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	Alert jsAlert = driver.switchTo().alert();
	jsAlert.accept();
	
	Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert");
}

@Test(priority=2)
public void testTwo()
{
	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	Alert jsConfirm = driver.switchTo().alert();
	jsConfirm.dismiss();
	
	Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Cancel");
}

@Test(priority=3)
public void testThree()
{
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert jsPrompt = driver.switchTo().alert();
	jsPrompt.sendKeys("Hello");
	jsPrompt.accept();
	
	Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: Hello");
}
}
