import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDropDownExample 
{
WebDriver driver;
@Test
 public void selectDropdown() throws InterruptedException
 {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/DropDown.html");
	//first dropdown in the page  - select dropdown
	 
	 WebElement selDD = driver.findElement(By.id("userexp"));
	 WebElement resultBox = driver.findElement(By.id("result"));
	 
	 Select select = new Select(selDD);
	 
	 select.selectByIndex(1);
	 Thread.sleep(Duration.ofSeconds(3));
	 Assert.assertEquals(resultBox.getText(), "1");
	 
	 
	 select.selectByValue("total_call_drops");
	 Thread.sleep(Duration.ofSeconds(3));
	 Assert.assertEquals(resultBox.getText(), "2");
	 
	 select.selectByVisibleText("Total SMS");
	 Thread.sleep(Duration.ofSeconds(3));
	 Assert.assertEquals(resultBox.getText(), "3"); 
 }
}
