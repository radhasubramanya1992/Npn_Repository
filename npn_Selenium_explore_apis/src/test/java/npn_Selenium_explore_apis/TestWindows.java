package npn_Selenium_explore_apis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWindows extends BaseClass {

	WebDriver driver;
	String parentWindow;
	String helpWindow;
	String chatWindow;

	@Test
	public void testWindows() throws InterruptedException {
		driver = setup(driver);
		driver.navigate().to("https://www.learning.npntraining.com/selenium-practice/popups/Popup.html");

		parentWindow = driver.getWindowHandle();
		System.out.println("The parent window handle :: " + parentWindow);

		WebElement helpBtn = driver.findElement(By.id("help"));

		helpBtn.click();

		Set<String> windows = driver.getWindowHandles();

		// For Each Approach
//		for (String window : windows) {
//			System.out.println("The window handle is :: " + window);
//
//			if (!window.equalsIgnoreCase(parentWindowHandle)) {
//				driver.switchTo().window(window);
//				waitForTheElement(driver, driver.findElement(By.id("tt")));
//				System.out.println("The help window data is :: " + driver.findElement(By.id("tt")).getText());
//			}
//
//		}

		// Iterator Approach

		Iterator it = windows.iterator();

		while (it.hasNext()) {
			String childWindow = it.next().toString();
			if (!childWindow.equalsIgnoreCase(parentWindow)) {
				helpWindow = childWindow;
				System.out.println("Help window handle is :: " + helpWindow);
				driver.switchTo().window(helpWindow);
				waitForTheElement(driver, driver.findElement(By.id("tt")));
				System.out.println("The help window data is :: " + driver.findElement(By.id("tt")).getText());

			}
		}

		driver.switchTo().window(parentWindow);

		driver.findElement(By.id("chat")).click();

		Set<String> multipleWindows = driver.getWindowHandles();

		Iterator iterator = multipleWindows.iterator();

		while (iterator.hasNext()) {
			String differentWindows = iterator.next().toString();
			if (!(differentWindows.equalsIgnoreCase(parentWindow) || differentWindows.equalsIgnoreCase(helpWindow))) {
				chatWindow = differentWindows;
				driver.switchTo().window(chatWindow);
				System.out.println("The title of Chat Window is :: " + driver.getTitle());
				Assert.assertEquals(driver.getTitle(), "Chat Info");
			}
		}

	}

}
