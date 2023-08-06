import org.openqa.selenium.WebElement;

public class Utils 
{
	//What is enum?
	//enum is a special class, that will define group of constants (nothing but final). 
	//The keyword "enum"
	
	enum Months
	{
		January,
		February,
		March,
		April,
		May,
		June,
		July,
		August,
		September,
		Ocober,
		November,
		December
	}
	 public void clearAndType(WebElement element, String text)
	 {
		 element.clear();
		 element.sendKeys(text);
	 }
}
