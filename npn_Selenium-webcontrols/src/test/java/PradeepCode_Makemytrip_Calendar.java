import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PradeepCode_Makemytrip_Calendar {

	WebDriver driver;
	
	@Test
	public void testMakeMyTrip() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//li[@data-cy=\"menu_Flights\"]")).click();
//		driver.findElement(By.cssSelector("[data-cy=\"menu_Hotels\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).click();
		
		Thread.sleep(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//*[@data-cy=\"fromCity\"]//parent::label//following-sibling::div//input")).sendKeys("Chennai");
		
		Thread.sleep(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//ul[@role=\"listbox\"]//*[text()='Chennai, India']//ancestor::li")).click();
		
		Thread.sleep(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//*[@data-cy=\"departure\"]//parent::label//parent::div")).click();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		List<WebElement> febDates = driver.findElements(By.xpath("//*[@class=\"DayPicker-Month\"]//div[text()=\"February 2023\"]//ancestor::div[@class=\"DayPicker-Month\"]//p//ancestor::div[@class=\"DayPicker-Day\"]"));
		String dataValue = "28";
		
		for (WebElement element : febDates) {
			System.out.println(element.getText());
			if(element.getText().contains(dataValue)) { 
				String date = "//*[@class='DayPicker-Month']//div[text()='February 2023']//ancestor::div[@class='DayPicker-Month']//p[text()='"+dataValue+"']//ancestor::div[@class='DayPicker-Day']";
				driver.findElement(By.xpath(date)).click();
				
			}
		}
		
	}
}
