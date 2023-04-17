package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.OnewayTripPage;
import guvi.PageObject.SelectFlightOnewayTrip;

public class SelectFlightOnewayTripTest extends BaseClass
{
	@Test
	public void selectFlightforOneWay() throws InterruptedException
	{
		OnewayTripPage oneway = new OnewayTripPage(driver);
		oneway.oneWayTripDetails(prop.getProperty("From"), prop.getProperty("To"));

		Thread.sleep(3000);

		oneway.selectPassengers(2, 2, 1);
		oneway.selectCurrencyandSearchFlight();

		SelectFlightOnewayTrip select = new SelectFlightOnewayTrip(driver);
		select.confirmFlightDetailsandNavigatetoBookingPage();
	}
}
