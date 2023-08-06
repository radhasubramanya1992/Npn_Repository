import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebcontrolBasics 
{
	WebDriver driver;
@BeforeTest
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@Test(enabled = false)
public void TestIsDisplayed()
{
	driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/IsDisplayed.html");
	WebElement txtBox = driver.findElement(By.id("t1"));
	WebElement closeButton = driver.findElement(By.id("btn1"));
	System.out.println(txtBox.isDisplayed());
	Assert.assertTrue(true);
	closeButton.click();
	System.out.println(txtBox.isDisplayed());
	Assert.assertFalse(false);	
}
	
@Test(enabled = false)
	public void TestisSelectedandisEnabled() throws InterruptedException
	{
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/IsEnabled.html");
		WebElement agreeCheckBox = driver.findElement(By.id("agree"));
		WebElement nextButton = driver.findElement(By.id("btn"));
		
		Thread.sleep(5000);
		System.out.println("Agree checkbox is selected?  "+ agreeCheckBox.isSelected());
		System.out.println("Next button is enabled?  "+ nextButton.isEnabled());
		Assert.assertFalse(agreeCheckBox.isSelected());
		Assert.assertFalse(nextButton.isEnabled());
		
		agreeCheckBox.click();
		Assert.assertTrue(nextButton.isEnabled());
	
	}

@Test
public void radioButtonAssignment() throws InterruptedException
{
	driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/RadioButton.html");
	WebElement PUC = driver.findElement(By.xpath("//input[@value='puc']"));
	WebElement MCA = driver.findElement(By.xpath("//input[@value='mca']"));
	WebElement Female = driver.findElement(By.id("female"));
	
	System.out.println(PUC.isSelected());
	Assert.assertTrue(PUC.isSelected());
	
	System.out.println(MCA.isSelected());
	if(!(MCA.isSelected()))
	{
		MCA.click();
		Thread.sleep(3000);
	}
	
	
	System.out.println(Female.isSelected());
	if(!(Female.isSelected()))
	{
		Female.click();
		Thread.sleep(3000);
	}

}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
