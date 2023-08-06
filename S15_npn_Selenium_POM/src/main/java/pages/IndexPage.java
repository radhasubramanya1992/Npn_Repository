package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestUtils;

public class IndexPage 
{
	WebDriver driver;
//	WebElement dashboardLeftMenuItem;
//	WebElement reservationLeftMenuItem;
//	WebElement manageRoomsLeftMenuItem;
//	WebElement staffSectionLeftMenuItem;
//	WebElement manageCompliantsLeftMenuItem;
//	WebElement knowMoreLeftMenuItem;
//	WebElement avatar;
//	WebElement signOutBtn;
	
	@FindBy(xpath="//a[contains(text(),\\'Dashboard\\')]")
	WebElement dashboardLeftMenuItem;
	
	@FindBy(xpath="//a[contains(text(),'Reservation')]")
	WebElement reservationLeftMenuItem;
	
	@FindBy(xpath="//a[contains(text(),'Manage Rooms')]")
	WebElement manageRoomsLeftMenuItem;
	
	@FindBy(xpath="//a[contains(text(),'Staff Section')]")
	WebElement staffSectionLeftMenuItem;
	
	@FindBy(xpath="//a[contains(text(),'Manage Complaints')]]")
	WebElement manageCompliantsLeftMenuItem;
	
	@FindBy(css=".navbar-header a[data-toggle=\\\"dropdown\\\"]")
	WebElement avatar;
	
	@FindBy(css="a[href='logout.php']")
	WebElement signOutBtn;

	 public IndexPage(WebDriver driver)
	 {
		 this.driver = driver;
//		 this.dashboardLeftMenuItem = driver.findElement(By.xpath("//a[contains(text(),\'Dashboard\')]"));
//		 this.reservationLeftMenuItem = driver.findElement(By.xpath("//a[contains(text(),'Reservation')]"));
//		 this.manageRoomsLeftMenuItem = driver.findElement(By.xpath("//a[contains(text(),'Manage Rooms')]"));
//		 this.staffSectionLeftMenuItem = driver.findElement(By.xpath("//a[contains(text(),'Staff Section')]"));
//		 this.manageCompliantsLeftMenuItem = driver.findElement(By.xpath("//a[contains(text(),'Manage Complaints')]"));
//		 this.avatar = driver.findElement(By.cssSelector(".navbar-header a[data-toggle=\"dropdown\"]"));
//		 this.signOutBtn = driver.findElement(By.cssSelector("a[href='logout.php']"));
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void signOut()
	 {
		 avatar.click();
		 signOutBtn.click();
	 }
	 
	 public ManageRoomPage selectManageRooms()
	 {
		 manageRoomsLeftMenuItem.click();
		 return new ManageRoomPage(driver);
	 }
}
