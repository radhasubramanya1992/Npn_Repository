import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestBMI_A 
{
WebDriver driver;
@BeforeClass	
public void setUp()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.learning.npntraining.com/selenium-practice/BMI-Calculator.html");
}

@AfterClass
public void tearDown()
{
	driver.quit();
}
@Test(dataProvider = "myDataProvider")
public void testBMI(String height,String weight,String bmiValue,String description) throws InterruptedException
{
	driver.findElement(By.name("height")).sendKeys(height);
	driver.findElement(By.name("weight")).sendKeys(weight);
	driver.findElement(By.id("calculate")).click();
	
	Thread.sleep(Duration.ofSeconds(5));
	
	Assert.assertEquals(driver.findElement(By.name("bmi")).getAttribute("value"), bmiValue);
	Assert.assertEquals(driver.findElement(By.name("meaning")).getAttribute("value"), description);
	
	Thread.sleep(Duration.ofSeconds(5));
	driver.findElement(By.cssSelector("input[type='reset']")).click();
}

@DataProvider(name="myDataProvider")
public String[][] getData() throws IOException
{
	ExcelUtilityRead_A excel = new ExcelUtilityRead_A();
	return excel.excelReadUtility();
}
}
