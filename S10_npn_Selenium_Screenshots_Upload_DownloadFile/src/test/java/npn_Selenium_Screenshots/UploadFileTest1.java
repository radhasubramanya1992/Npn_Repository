package npn_Selenium_Screenshots;

import java.awt.AWTException;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFileTest1
{
	WebDriver driver;
	@Test
	public void testUploadFIle() throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir")+ 
				File.separator + "src" + 
				File.separator + "test" + 
				File.separator + "resources" + 
				File.separator + "screenshots" + 
				File.separator + "test.png";
		System.out.println("The path is :: " + path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(Duration.ofSeconds(5));
		//here, we are  directly pointing to input element with type="file", hence directly we can paste the file path
		driver.findElement(By.name("file")).sendKeys(path);
		driver.findElement(By.id("file-submit")).click();
	}
}
