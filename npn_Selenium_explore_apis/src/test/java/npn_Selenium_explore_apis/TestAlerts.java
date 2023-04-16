package npn_Selenium_explore_apis;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAlerts extends BaseClass {

	WebDriver driver;

	@BeforeClass
	public void before() {
		driver = setup(driver);
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	}

	@AfterClass
	public void tear() {
		tearDown(driver);
	}

	@Test(priority = 1)
	public void testOne() throws InterruptedException {

		WebElement jsAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		Thread.sleep(Duration.ofSeconds(3));
		jsAlert.click();

		Alert testAlert = driver.switchTo().alert();

		testAlert.accept();
		Thread.sleep(Duration.ofSeconds(3));
		Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert");

	}

	@Test(priority = 2)
	public void testTwo() throws InterruptedException {
		WebElement jsConfirm = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		Thread.sleep(Duration.ofSeconds(3));
		jsConfirm.click();

		Alert jsConfirmAlert = driver.switchTo().alert();
		jsConfirmAlert.dismiss();

		Thread.sleep(Duration.ofSeconds(3));
		Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Cancel");

	}

	@Test(priority = 3)
	public void testThree() throws InterruptedException {
		WebElement jsPromt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		Thread.sleep(Duration.ofSeconds(3));
		jsPromt.click();

		Alert jsPromptAlert = driver.switchTo().alert();

		jsPromptAlert.sendKeys("HEllo");

		jsPromptAlert.accept();
		Thread.sleep(Duration.ofSeconds(3));
		Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: HEllo");

	}

}