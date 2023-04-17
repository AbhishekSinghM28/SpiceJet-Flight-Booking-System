package guvi.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidateCheckIn 
{
	public WebDriver driver;

	public ValidateCheckIn(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Code to Validate Check-In Module..
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[1]")
	WebElement buttonCheckIn;
	
	@FindBy(xpath="(//input[@placeholder='e.g. W3X3H8'])[1]")
	WebElement feildPNR;
	
	@FindBy(xpath="(//input[@placeholder='john.doe@spicejet.com'])[1]")
	WebElement feildEmailID;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
	WebElement feildSearchBooking;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1ttbpl1 r-1enofrn r-1bymd8e']")
	WebElement pnrnumbererror;
	
	public void checkIn(String pnrnumber, String email) 
	{
		buttonCheckIn.click();		
		feildPNR.click();
		feildPNR.sendKeys(pnrnumber);
		feildEmailID.click();
		feildEmailID.sendKeys(email);
		feildSearchBooking.click();
		
		Assert.assertEquals(pnrnumbererror.getText(), "Invalid PNR or Ticket Number");
		System.out.println("Please verify your PNR Number entered.");
	}	
}
