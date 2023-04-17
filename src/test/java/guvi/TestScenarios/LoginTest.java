package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void LoginwithValidCredentials() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("Password"));
		login.loginButton();
		login.waitToLocate();
		login.verifyLoginValidCredentials();
	}

	
	  @Test 
	  public void LoginwithInValidCredentials()
	  {
		LoginPage login=new LoginPage(driver); 
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("InvalidPass"));
		login.loginButton();
		login.verifyLoginInValidCredentials();
	  }
}