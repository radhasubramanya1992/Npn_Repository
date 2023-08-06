package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.IndexPage;
import pages.LoginPage;
import pages.ManageRoomPage;

public class ManageRoomTest extends BaseClass
{
WebDriver driver;

@BeforeClass
public void setUp()
{
	driver = chromeSetup("https://www.npntraining.com/automation_projects/hotel_management_system/login.php");
}

@Test
public void addRooms() throws InterruptedException
{
	LoginPage loginPage = new LoginPage(driver);
	IndexPage indexPage = loginPage.Login("admin", "admin");
	ManageRoomPage manageRoomPage = indexPage.selectManageRooms();
	manageRoomPage.clickAddRoomsButton();
	Assert.assertTrue(manageRoomPage.addNewRoom("2", "1007"));
	new IndexPage(driver).signOut();
}
@AfterClass
public void tear()
{
	tearDown(driver);
}
}
