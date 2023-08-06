package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.IndexPage;
import pages.LoginPage;
import utils.TestUtils;

public class LoginTest extends BaseClass
{
	WebDriver driver;
	IndexPage indexPage;
	
	 @BeforeClass
	 public void setUp() throws IOException
	 {
		 driver = chromeSetup();
	 }
	  
	 @Test
	 public void login()
	 {
		 LoginPage loginPage = new LoginPage(driver);
		 indexPage = loginPage.Login("admin", "admin");
		 //new TestUtils();
		 String indexUrl = TestUtils.getCurrentAppUrl(driver);
		 Assert.assertTrue(indexUrl.contains("dashboard"));
	 }
	 @Test
	 public void signOut()
	 {
		 indexPage.signOut();
	 }
	 
	 @AfterClass
	 public void tear()
	 {
		 tearDown(driver);
	 }
}
