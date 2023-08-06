package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestUtils;

public class ManageRoomPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Add Rooms']")
	WebElement addRoomsButton;
	@FindBy(id="room_type_id")
	WebElement roomTypeDropdown;
	@FindBy(id="room_no")
	WebElement roomNoTextbox;
	@FindBy(xpath="//button[text()='Add Room']")
	WebElement addRoomPopUpButton;
	WebElement showEntryDropdown;
	List<WebElement> roomsRows;
	
	public ManageRoomPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void clickAddRoomsButton()
	{
		TestUtils.waitUntilElementIsVisible(driver, addRoomsButton);
		addRoomsButton.click();
	}
	public boolean addNewRoom(String roomType,String roomNumber) throws InterruptedException
	{
		TestUtils.waitUntilElementIsVisible(driver, roomTypeDropdown);
		TestUtils.selectFromDropDown(driver,roomTypeDropdown,roomType);
		roomNoTextbox.sendKeys(roomNumber);
		addRoomPopUpButton.click();
		
		
		//Thread.sleep(Duration.ofSeconds(10));
		//Instead of using Thread.Sleep, we call the constructor again to instantiate the objects freshly to avoid stale element exception
		new ManageRoomPage(driver);
		this.showEntryDropdown = driver.findElement(By.name("rooms_length"));
		TestUtils.waitUntilElementIsVisible(driver, showEntryDropdown);
		TestUtils.selectFromDropDown(driver, showEntryDropdown, "100");
		this.roomsRows = driver.findElements(By.xpath("//table[@id='rooms']//tr//td"));
		return TestUtils.isValueExistsOnElements(roomsRows, roomNumber);
	}
}
