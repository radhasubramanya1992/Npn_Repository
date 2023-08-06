import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PradeepCode_expedia_dateclick {
	
	WebDriver driver;
	@Test
	public void testExpedia() throws InterruptedException, AWTException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.expedia.co.in/");
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.linkText("One-way")).click();
		driver.findElement(By.cssSelector("[data-stid='location-field-leg1-origin-menu-trigger']")).click();
		Thread.sleep(5000);
		Robot robot = new Robot();
//		String goingTo = "Chennai";
//		StringSelection s = new StringSelection(goingTo);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_C);
//		driver.findElement(By.id("location-field-leg1-origin")).sendKeys("Chennai");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text() ='Chennai (MAA - Chennai Intl.)']//ancestor::li")).click();
		driver.findElement(By.cssSelector("[data-stid='location-field-leg1-destination-menu-trigger']")).click();
		driver.findElement(By.id("location-field-leg1-destination")).sendKeys("Delhi");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text() ='Delhi (DEL - Indira Gandhi Intl.)']//ancestor::li")).click();
	}
}

