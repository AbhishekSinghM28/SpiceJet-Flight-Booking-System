package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.ValidateManageBooking;

public class ValidateManageBookingTest extends BaseClass
{
	@Test
	public void ManageBookingValidation() 
	{
		ValidateManageBooking managebooking=new ValidateManageBooking(driver);
		managebooking.manageBooking(prop.getProperty("PNRNumber"),prop.getProperty("Email"));
	}	
}
