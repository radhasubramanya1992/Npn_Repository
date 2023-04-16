import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class TableExample 
{
WebDriver driver;
public void DisplayTabledata()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.learning.npntraining.com/selenium-practice/webcontrols/Table.html");
	
	List<WebElement> tableData = driver.findElements(By.xpath("//table//td"));
	for (WebElement element : tableData) 
	{
		System.out.println(element.getText());
	}
}
}
