package npn_Selenium_SeleniumDeepDive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TestRelativeLocators 
{
WebDriver driver;

@Test
public void testrelativeLocators()
{
	//Browser options - headless example
	FirefoxOptions ffOptions = new FirefoxOptions();
	ffOptions.addArguments("--headless");
	driver = new FirefoxDriver(ffOptions);
    driver.get("https://linkedin.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    By input = RelativeLocator.with(By.tagName("input")).above(By.id("session_password"));
    WebElement userName = driver.findElement(input);
    userName.sendKeys("Hello");
    WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input"))
                            .toLeftOf(By.cssSelector("[data-id=\"sign-in-form__password-visibility-toggle\"]")));
    password.sendKeys("Hello");

    WebElement forgot = driver.findElement(RelativeLocator.with(By.cssSelector("[data-id=\"sign-in-form__forgot-password\"]"))
            .below(By.id("session_password"))
            .above(By.cssSelector("[data-id=\"sign-in-form__submit-btn\"]")));
    forgot.click();
    driver.quit();
}
}
