package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.SignupPage;

public class SignupTest extends BaseClass
{	
	@Test
	public void Signup() throws InterruptedException 
	{
		SignupPage signup=new SignupPage(driver);
		signup.SignUp();
		SwitchWindow();
		signup.SelectTitle();
		signup.Firstname(prop.getProperty("FirstName"));
		signup.Lastname(prop.getProperty("LastName"));
		signup.EnterCountry(prop.getProperty("Country"));
		signup.DateOfBirth(prop.getProperty("DOB"));
		signup.MobileNumber(prop.getProperty("MobileNumber"));
		signup.EmailId(prop.getProperty("Email"));
		signup.EnterPassword(prop.getProperty("Password"));
		signup.ConfirmPassword(prop.getProperty("ConfirmPassword"));
		
		Thread.sleep(3000);
		signup.IAgree();
		
		//Thread.sleep(3000);
		signup.Submit();
		signup.verifySignUp();
		
	}
}