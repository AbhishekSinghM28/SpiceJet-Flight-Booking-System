package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ValidateCheckIn;

public class ValidateCheckInTest extends BaseClass
{
	@Test
	public void CheckInValidation() 
	{
		ValidateCheckIn checkin=new ValidateCheckIn(driver);
		checkin.checkIn(prop.getProperty("PNRNumber"),prop.getProperty("Email"));		
	}	
}
