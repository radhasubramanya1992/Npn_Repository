package npn_selenium_advanced_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class KeyboardEventsExample 
{
	WebDriver driver;
	
	public void keyboardTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		
		Actions action = new Actions(driver);
		//enter 'NAMEcaseSENSITIVITY' in 'username' field
		action.moveToElement(userName).keyDown(Keys.SHIFT).sendKeys("name").keyUp(Keys.SHIFT).sendKeys("case").
		keyDown(Keys.SHIFT).sendKeys("sensitivity").keyUp(Keys.SHIFT).perform();
	}
	
}
