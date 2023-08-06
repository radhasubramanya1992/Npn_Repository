package Advanced_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardEventsExample 
{
WebDriver driver;

@Test
public void keyboardEventsTest()
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	//enter 'NAMEcaseSENSITIVITY' in 'username' field
	 WebElement userName = driver.findElement(By.id("email"));
	 userName.clear();
	 userName.click();
	 
	 Actions action = new Actions(driver);
	 
	 action.moveToElement(userName).
	 keyDown(Keys.SHIFT).
	 sendKeys("name").
	 keyUp(Keys.SHIFT).
	 sendKeys("case").
	 keyDown(Keys.SHIFT).
	 sendKeys("sensitivity").
	 keyUp(Keys.SHIFT).
	 build().
	 perform();
}

}
