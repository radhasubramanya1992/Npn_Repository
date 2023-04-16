import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PradeepYatraExample extends Utils{
	
	WebDriver driver;
	JavascriptExecutor js;
	@Test
	public void testYatra() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://yatra.com");
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("webklipper-publisher-widget-container-notification-frame"));
		
		WebElement promotionalElement = driver.findElement(By.id("webklipper-publisher-widget-container-notification-container"));
		if(promotionalElement.isDisplayed()) {
			driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		}
		driver.switchTo().defaultContent();
		clearAndType(driver.findElement(By.id("BE_flight_origin_city")), "Che");
		//driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Che");
		List <WebElement> originCities = driver.findElements(By.xpath("//*[@class='ac_results origin_ac']//*[@class='ac_cityname']"));
		for (WebElement element : originCities) {
			if(element.getText().contains("Chennai")) {
				element.click();
				break;
			}
		}
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("BE_flight_arrival_city")));
		clearAndType(driver.findElement(By.id("BE_flight_arrival_city")), "Bang");
		//driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Bang");
		List <WebElement> distinationCities = driver.findElements(By.xpath("//*[@class='ac_results dest_ac']//*[@class='ac_cityname']"));
		for (WebElement element : distinationCities) {
			if(element.getText().contains("Bangalore")) {
				element.click();
				break;
			}
		}
		
		driver.findElement(By.id("BE_flight_origin_date")).click();
//		List <WebElement> marchDates = driver.findElements(By.xpath("//div[contains(text(), 'March')]//following-sibling::div//td"));
//		for (WebElement element : marchDates) {
//			if(element.getText().contains("19")) {
//				element.click();
//				break;
//			}
//		}
		selectDate(Months.January, "2");
	}
	
	public void selectDate(Months monthName, String date) {
		WebElement month = driver.findElement(By.xpath("//div[contains(text(), '"+monthName+"')]"));
		List<WebElement> monthDates = driver.findElements(By.xpath("//div[contains(text(), '"+monthName+"')]//following-sibling::div//td"));
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", month);
		for (WebElement element : monthDates) {
			if(element.getText().trim().equals(date)) {
				element.click();
				break;
			}
		}
	}
}