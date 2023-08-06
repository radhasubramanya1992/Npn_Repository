package npn_Selenium_Screenshots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFileTest2 
{
	WebDriver driver;
	@Test
	public void testUploadFile2() throws InterruptedException, AWTException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(Duration.ofSeconds(5));
		//here, we are not directly pointing to input element with type="file", hence directly we can't paste file path
		driver.findElement(By.id("addBtn")).click();
		Thread.sleep(Duration.ofSeconds(5));
		
		Robot robot = new Robot();
		StringSelection ss = new StringSelection(System.getProperty("user.dir")+ 
				File.separator + "src" + 
				File.separator + "test" + 
				File.separator + "resources" + 
				File.separator + "screenshots" + 
				File.separator + "test.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Thread.sleep(Duration.ofSeconds(5));
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(Duration.ofSeconds(5));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(Duration.ofSeconds(5));
	}
}
