package Simple_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDDExample 
{
WebDriver driver;

@Test
public void selectDdExmp()
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/DropDown.html");
	
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userexp")));
	 
	 WebElement selectDD = driver.findElement(By.id("userexp"));
	 WebElement resultbox = driver.findElement(By.id("result"));
	 
	 Select select = new Select(selectDD);

	 select.selectByValue("success_calls");
	 Assert.assertEquals(resultbox.getText(), "1");
	 
	 select.selectByIndex(2);
	 Assert.assertEquals(resultbox.getText(), "2");
	 
	 select.selectByVisibleText("Total SMS");
	 Assert.assertEquals(resultbox.getText(), "3");
	 
	 driver.quit();
}
}
