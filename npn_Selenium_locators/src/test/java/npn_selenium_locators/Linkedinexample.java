package npn_selenium_locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Linkedinexample 
{
WebDriver driver;

@BeforeClass
public void setUp()
{
	driver = new ChromeDriver();
}

@Test
public void testLinkedIn() throws InterruptedException
{
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/home");
	Thread.sleep(Duration.ofSeconds(3));
	driver.findElement(By.name("session_key")).sendKeys("test@test.com");
	Thread.sleep(Duration.ofSeconds(3));
	driver.findElement(By.name("session_password")).sendKeys("passwordff");
	Thread.sleep(Duration.ofSeconds(3));
	driver.findElement(By.className("sign-in-form__submit-button")).click();
	Thread.sleep(Duration.ofSeconds(3));
}

@AfterClass
public void tearDown()
{
	driver.quit();
}
}
