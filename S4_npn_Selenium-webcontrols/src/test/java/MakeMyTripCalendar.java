import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class MakeMyTripCalendar 
{
	WebDriver driver;
	public void dateSearch() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
//		//From - bengaluru
//		WebElement fromSearchClick = driver.findElement(By.id("fromCity"));
//		fromSearchClick.click();
//		WebElement fromSearchTextbox = driver.findElement(
//				By.xpath("//input[@id='fromCity']/ancestor::label/following-sibling::div//input"));
//		fromSearchTextbox.sendKeys("Bengaluru");
//		Thread.sleep(3000);
//		WebElement searchTermBengaluru = driver.findElement(
//				By.xpath("//p[text()='Bengaluru, India']/ancestor::li"));
//		searchTermBengaluru.click();
//		
//		//To - chennai
//		WebElement toSearchClick = driver.findElement(By.id("toCity"));
//		toSearchClick.click();
//		WebElement toSearchTextbox = driver.findElement(
//				By.xpath("//input[@id='toCity']/ancestor::label/following-sibling::div//input"));
//		toSearchTextbox.sendKeys("Chennai");
//		Thread.sleep(3000);
//		WebElement searchTermChennai = driver.findElement(
//				By.xpath("//p[text()='Chennai, India']/ancestor::li"));
//		searchTermChennai.click();
		
		//Departure
		WebElement departureMenu = driver.findElement(
				By.xpath("//input[@id='departure']/ancestor::label"));
		departureMenu.click();
		Thread.sleep(3000);
		String date = "2";
		driver.findElement(
				By.xpath("//div[text()='February 2023']/ancestor::div[@class='DayPicker-Month']//p[text()='"+date+"']/ancestor::div[@class='DayPicker-Day']")).click();
		
		
//		List<WebElement> febDates = driver.findElements(
//				By.xpath("//div[text()='February 2023']/ancestor::div[@class='DayPicker-Month']//p"));
//		String date = "17";
//		for (WebElement element : febDates) 
//		{
//			driver.findElement(
//					By.xpath("//div[text()='February 2023']/ancestor::div[@class='DayPicker-Month']//p[text()='17']/ancestor::div[@class='DayPicker-Day']")).click();
//		}	
	}
}

//yatra.com
