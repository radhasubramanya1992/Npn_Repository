package Simple_Interactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class TableExample 
{
WebDriver driver;
public void printTableData()
{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/Table.html");
	
	List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='student']//td"));
	for (WebElement element : tableData) 
	{
		System.out.println(element.getText());
	}
	driver.quit();
}
}
