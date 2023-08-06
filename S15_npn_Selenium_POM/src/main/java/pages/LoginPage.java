package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
WebDriver driver;

@FindBy(name="email")
WebElement usernameTest;

@FindBy(name="password")
WebElement passwordTest;

@FindBy(name="login")
WebElement loginBtn;

 public LoginPage(WebDriver driver)
 {
	 this.driver = driver;	 
	 PageFactory.initElements(driver, this);
 }
 
 public IndexPage Login(String userName,String pass)
 {
	 usernameTest.sendKeys(userName);
	 passwordTest.sendKeys(pass);
	 loginBtn.click();
	 return new IndexPage(driver);
 }
}
