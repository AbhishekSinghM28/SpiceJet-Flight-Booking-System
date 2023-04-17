package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.BookFlightTwowayTrip;
import guvi.PageObject.SelectFlightTwowayTrip;
import guvi.PageObject.TwowayTripPage;

public class BookFlightTwowayTripTest extends BaseClass
{
	@Test
	public void selectFlightforBoarding() throws InterruptedException
	{
		TwowayTripPage twoway = new TwowayTripPage(driver);
		twoway.twoWayTripDetails(prop.getProperty("From"), prop.getProperty("To"));

		Thread.sleep(3000);

		twoway.selectPassengers(2, 2, 1);
		twoway.selectCurrencyandSearchFlight();

		SelectFlightTwowayTrip select = new SelectFlightTwowayTrip(driver);
		select.confirmBoardingFlightDetails();		
		select.confirmReturnFlightDetails();
		
		BookFlightTwowayTrip book=new BookFlightTwowayTrip(driver);
		book.contactDetailsPrimaryPassenger(prop.getProperty("FirstName"), 
											prop.getProperty("LastName"),
											prop.getProperty("Email"),
											prop.getProperty("MobileNumber"),
											prop.getProperty("City"));	
		
		
		book.primaryPassengerInfo();
		
		book.secondaryPassengerAdult1Info(prop.getProperty("SPA1FirstName"), 
										  prop.getProperty("SPA1LastName"),
										  prop.getProperty("SPA1MobileNumber"));
		
		book.secondaryPassengerAdult2Info(prop.getProperty("SPA2FirstName"), 
										  prop.getProperty("SPA2LastName"),
										  prop.getProperty("SPA2MobileNumber"));
		
		book.secondaryPassengerChild1Info(prop.getProperty("SPC1FirstName"), 
										  prop.getProperty("SPC1LastName"));
		
		book.secondaryPassengerChild2Info(prop.getProperty("SPC2FirstName"), 
				  						  prop.getProperty("SPC2LastName"));
		
		book.secondaryPassengerInfantInfo(prop.getProperty("SPI1FirstName"), 
				  						  prop.getProperty("SPI1LastName"));
		
		book.verifyTripSummary();
		
		book.GoToPaymentPage();
		
		book.enterpaymentdetail(prop.getProperty("CardNumber"), 
							    prop.getProperty("CardName"),
							    prop.getProperty("ExpMonth"), 
							    prop.getProperty("ExpYear"),
							    prop.getProperty("CVV"));
	}
}
