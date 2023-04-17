package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.OnewayTripPage;



public class OnewayTripTest extends BaseClass
{
	@Test 
	public void SearchFlightOneWay() throws InterruptedException
	{
		OnewayTripPage oneway=new OnewayTripPage(driver);
		oneway.oneWayTripDetails(prop.getProperty("From"), prop.getProperty("To"));
				
		Thread.sleep(3000);
		
		oneway.selectPassengers(2,2,1);
		oneway.selectCurrencyandSearchFlight();
	}
}
