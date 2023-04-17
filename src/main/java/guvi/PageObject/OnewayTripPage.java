package guvi.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnewayTripPage 
{
	public WebDriver driver;
	public OnewayTripPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Code to book a OneWayTrip flight.
	@FindBy(xpath="//div[contains(text(),'one way')]")
	WebElement onetripbutton;
		
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingFrom;

	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destinationTo;
	
	@FindBy(xpath="(//div[contains(text(),'Pune')])[1]")
	WebElement Pune;
		
	@FindBy(xpath="(//div[@class=\"css-76zvg2 css-bfa6kz r-homxoj r-ubezar\"])[1]")
	WebElement iconDepartureDate;
	
	@FindBy(xpath="(//div[@data-testid='undefined-month-May-2023'])/div[3]/div[1]/div[1]/div[1]")
	WebElement selectArrivalDate;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")
	WebElement buttonPassengers;
	
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement buttonAdult;
	
	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	WebElement buttonChildren;
	
	@FindBy(xpath="//div[@data-testid='Infant-testID-plus-one-cta']")
	WebElement buttonInfant;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")
	WebElement buttonCurrency;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73'][1]")
	WebElement buttonCountry;
	
	@FindBy(xpath="//div[@data-testid=\"home-page-flight-cta\"]")
	WebElement buttonSearchFlight;
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement buttonFlightsContinue;
		
	//Creating methods	
	public void oneWayTripDetails(String Boarding, String Destination)
	{
		onetripbutton.click();
		
		boardingFrom.click();
		boardingFrom.sendKeys(Boarding);
		destinationTo.sendKeys(Destination);
		Pune.click();
		selectArrivalDate.click();
	}
			
	public void selectPassengers(int NumberofAdults, int  NumberofChildrens, int NumberofInfants)
	{
		buttonPassengers.click();
		
		for(int i=1;i<=NumberofAdults;i++) {buttonAdult.click();}		
		for(int i=1;i<=NumberofChildrens;i++) {buttonChildren.click();}
		for(int i=1;i<=NumberofInfants;i++) {buttonInfant.click();}
	}
		
	public void selectCurrencyandSearchFlight()
	{
		buttonCurrency.click();
		buttonCountry.click();
		buttonSearchFlight.click();		
	}
	
}