package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ValidateFlightStatus;

public class ValidateFlightStatusTest extends BaseClass
{
	@Test
	public void FlightStatusValidation() 
	{
		ValidateFlightStatus flightstatus=new ValidateFlightStatus(driver);
		flightstatus.flightStatus(prop.getProperty("From1"),prop.getProperty("To1"));		
	}
}
