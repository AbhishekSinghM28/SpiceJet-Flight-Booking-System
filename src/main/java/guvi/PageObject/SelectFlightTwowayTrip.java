package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SelectFlightTwowayTrip
{
	public WebDriver driver;
	public SelectFlightTwowayTrip(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Code to Select a Two-Way Flight
	@FindBy(xpath="//span[@class='css-76zvg2 css-16my406 r-homxoj r-1s6pnzw r-1iadsmv'][1]")
	WebElement location;

	@FindBy(xpath="//span[@class='css-76zvg2 css-16my406 r-homxoj r-1s6pnzw r-1iadsmv'][2]")
	WebElement departdate;

	@FindBy(xpath="//div[@class='css-76zvg2 r-homxoj']/span[3]")
	WebElement passengerdetails;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1xdf14d'])/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]")
	WebElement boradingflightno;

	@FindBy(xpath="//div[@class='r-1awozwy r-1loqt21 r-13awgt0 r-1777fci r-6dt33c r-bnwqim r-1otgn73 r-1i6wzkk r-lrvibr r-13qz1uu css-1dbjc4n']/div[2]")
	WebElement spicesavercost;

	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-1x35g6 r-1kfrs79'])[3]")
	WebElement totalcost;	
			
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement buttonContinue;	
	
	@FindBy(xpath="(//*[text()='PNQ'])[4]")
	WebElement source;
	
	@FindBy(xpath="(//*[text()='DEL'])[4]")
	WebElement destination;
	
	@FindBy(xpath="(//div[@id='list-results-section-1'])/div[1]/div[1]/div[1]/div[2]")
	WebElement returndate;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-14lw9ot r-3aj1re r-18u37iz']/div[1]/div[1]/div[4]/div[1])[3]")
	WebElement returnflightno;

	//Creating methods for Confirmation Boarding & Return flight details and proceeding to booking page..
	public void confirmBoardingFlightDetails() 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(location));
		
		System.out.println("Verifying the Boarding Flight Details");
		System.out.println("-------------------------------------");		
		System.out.println(""+location.getText());
		System.out.println(""+departdate.getText());
		System.out.println("Flight Number : "+""+boradingflightno.getText());
				
		String expectedProductName="Depart Date : Mon, 01 May 2023";
		Assert.assertEquals(departdate.getText(),expectedProductName);	
	}
	
	public void confirmReturnFlightDetails() 
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
				
		System.out.println("Verifying the Return Flight Details");
		System.out.println("-----------------------------------");		
		System.out.println("Return Trip : "+"Pune"+"("+source.getText()+")"+" to "+"Delhi"+"("+destination.getText()+")");
		System.out.println("Return Date : "+returndate.getText());
		System.out.println("Flight Number : "+""+returnflightno.getText());
		System.out.println("-----------------------------------");
		System.out.println("Total Fare :"+""+totalcost.getText()+" INR");
		
		String expectedProductName="Wed, 10 May 2023";
		Assert.assertEquals(returndate.getText(),expectedProductName);	
		
		buttonContinue.click();
	}

}
