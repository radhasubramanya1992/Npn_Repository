package npn_selenium_advanced_interactions;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DoubleClickExample 
{
WebDriver driver;
 public void TestDoubleClick() throws InterruptedException
 {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.learning.npntraining.com/selenium-practice/actions/DoubleClick.html");
	 
	 WebElement clickMeBtn = driver.findElement(By.name("dblClick"));
	 Actions action = new Actions(driver);
	 action.doubleClick(clickMeBtn).perform();
	 Thread.sleep(3000);
	 
	 Alert alert = driver.switchTo().alert();
	 Assert.assertEquals(alert.getText(), "Double Clicked !!");
	 alert.accept();
	 driver.quit();
 }
}
