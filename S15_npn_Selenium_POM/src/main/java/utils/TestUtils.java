package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils 
{
WebDriver driver;
static Select select;
static Wait wait;

public static void selectFromDropDown(WebDriver driver,WebElement element, String value)
{
	select = new Select(element);
	select.selectByValue(value);
}

public static String getCurrentAppUrl(WebDriver driver)
{
	 return driver.getCurrentUrl();
}

public static void waitUntilElementIsVisible(WebDriver driver,WebElement element)
{
	wait =  new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOf(element));
}

public static boolean isValueExistsOnElements(List<WebElement> element,String value)
{
	boolean isTrue = false;
	for (WebElement webElement : element) 
	{
		System.out.println(webElement.getText());
		if(webElement.getText().equalsIgnoreCase(value))
		{
			isTrue=true;
			break;
		}
		else
		{
			isTrue=false;
		}
	}
	return isTrue;
}
}
