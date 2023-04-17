package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SelectFlightOnewayTrip 
{
	
	public WebDriver driver;
	public SelectFlightOnewayTrip(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Code to Select a One-Way Flight
	@FindBy(xpath="//span[@class='css-76zvg2 css-16my406 r-homxoj r-1s6pnzw r-1iadsmv'][1]")
	WebElement location;

	@FindBy(xpath="//span[@class='css-76zvg2 css-16my406 r-homxoj r-1s6pnzw r-1iadsmv'][2]")
	WebElement departdate;

	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj']/span[3]")
	WebElement passengerdetails;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1xdf14d'])/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]")
	WebElement flightno;

	@FindBy(xpath="//div[@class='r-1awozwy r-1loqt21 r-13awgt0 r-1777fci r-6dt33c r-bnwqim r-1otgn73 r-1i6wzkk r-lrvibr r-13qz1uu css-1dbjc4n']/div[2]")
	WebElement spicesavercost;

	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-1x35g6 r-1kfrs79'])[3]")
	WebElement totalcost;	
			
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement buttonContinue;	

	//Creating method for Confirming One-Way flight details and proceeding to booking page..
	public void confirmFlightDetailsandNavigatetoBookingPage() 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(location));
		
		System.out.println("Verifying the Flight Details");
		System.out.println("---------------------------------");		
		System.out.println(""+location.getText());
		System.out.println(""+departdate.getText());
		System.out.println("Flight Number : "+""+flightno.getText());
		System.out.println("Total Fare :"+""+totalcost.getText()+" INR");
		
		String expectedProductName="Depart Date : Mon, 01 May 2023";
		Assert.assertEquals(departdate.getText(),expectedProductName);	
		
		buttonContinue.click();
	}

}


