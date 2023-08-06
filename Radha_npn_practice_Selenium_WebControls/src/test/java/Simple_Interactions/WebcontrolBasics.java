package Simple_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebcontrolBasics 
{
WebDriver driver;
@BeforeClass
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@Test(enabled=false)
public void TestIsDisplayed()
{
	driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/IsDisplayed.html");
	WebElement txtBox = driver.findElement(By.id("t1"));
	System.out.println(txtBox.isDisplayed());
	Assert.assertTrue(true);
	WebElement closeButton = driver.findElement(By.id("btn1"));
	closeButton.click();
	System.out.println(txtBox.isDisplayed());
	Assert.assertFalse(false);
}

@Test
public void TestIsSelectedAndIsEnabled()
{
	driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/IsEnabled.html");
	Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("agree")));
	WebElement agreeCheckBox = driver.findElement(By.id("agree"));
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
	WebElement nextButton = driver.findElement(By.id("btn"));
	
	
	System.out.println("Agree checkbox is selected?  "+ agreeCheckBox.isSelected());
	System.out.println("Next button is enabled?  "+ nextButton.isEnabled());
	
	agreeCheckBox.click();
	
	System.out.println("Agree checkbox is selected?  "+ agreeCheckBox.isSelected());
	System.out.println("Next button is enabled?  "+ nextButton.isEnabled());
}

@AfterClass
public void tearDown()
{
	driver.quit();
}

}
