package guvi.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidateFlightStatus 
{
	public WebDriver driver;

	public ValidateFlightStatus(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Code to Validate Flight Status Module.
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[2]")
	WebElement buttonFlightStatus;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement feildDepartureDate;
		
	@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-18tvxmy r-1i10wst r-1kfrs79'])[3]")
	WebElement selectorTomorrow;
	
	@FindBy(xpath="(//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'])[1]")
	WebElement feildSource;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-18u37iz'])[18]")
	WebElement buttonAhemadabad;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement feildDestination;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-18u37iz'])[19]")
	WebElement buttonAjmer;
		
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
	WebElement buttonSearchFlight;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1ttbpl1 r-1enofrn r-1bymd8e']")
	WebElement pnrnumbererror;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-1862ga2 r-n6v787']")
	WebElement verifcationText;
	
	public void flightStatus(String from1, String to1)
	{
		buttonFlightStatus.click();		
		feildDepartureDate.click();
		selectorTomorrow.click();
		
		feildSource.click();
		buttonAhemadabad.click();
				
		buttonAjmer.click();
		
		buttonSearchFlight.click();
				
		Assert.assertEquals(verifcationText.getText(), "All times displayed are the selected airport local time");
		System.out.println("Successfully Verified Status of Flight.");		
	}

}
