import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTripAsgn_StaleElementException 
{
WebDriver driver;
@Test
 public void searchTrip() throws InterruptedException
 {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.makemytrip.com/");
	 WebElement flightsmenu = driver.findElement(By.xpath("//li[@data-cy='menu_Flights']"));
	 //WebElement OneWay = driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
	 WebElement fromSearch = driver.findElement(By.id("fromCity"));
//	 WebElement toSearch = driver.findElement(By.id("toCity"));
//	 WebElement searchTermBengaluru = driver.findElement(By.xpath("//p[text()='Bengaluru, India']"));
//	 WebElement searchTermChennai = driver.findElement(By.xpath("//p[text()='Chennai, India']"));
//	 WebElement TravellerAndClass = driver.findElement(By.id("travellers"));
//	 WebElement Adults3 = driver.findElement(By.xpath("//li[@data-cy='adults-3']"));
//	 WebElement Children2 = driver.findElement(By.xpath("//li[@data-cy='children-2']"));
//	 WebElement TravelClassPremium = driver.findElement(By.xpath("//li[@data-cy='travelClass-1']"));
//	 WebElement ApplyButton = driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']"));
//	 WebElement StudentFares = driver.findElement(By.xpath("//ul[@class='specialFareNew']//li/p[contains(text(),'Student')]"));
//	 WebElement SearchButton = driver.findElement(By.linkText("Search"));
	 
	 //Click on from searchbox and select bengaluru
	 Thread.sleep(5000);
	 flightsmenu.click();
	 Thread.sleep(5000);
	 fromSearch.click();
		 //fromSearch.clear();
//		 searchTermBengaluru.click();
//		 
//		 //click on to searchbox and select chennai
//		 toSearch.click();
//		 toSearch.clear();
//		 searchTermChennai.click();
//		 
//		 //click on travellers&class and select adult, children and class and click on apply
//		 TravellerAndClass.click();
//		 Adults3.click();
//		 Children2.click();
//		 TravelClassPremium.click();
//		 ApplyButton.click();
//		 
//		 //select student fares
//		 StudentFares.click();
//		 
//		 //click on search
//		 SearchButton.click();	 
 }
}
