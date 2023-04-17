package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.SelectFlightTwowayTrip;
import guvi.PageObject.TwowayTripPage;

public class SelectFlightTwowayTripTest extends BaseClass
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
	}
	
}
