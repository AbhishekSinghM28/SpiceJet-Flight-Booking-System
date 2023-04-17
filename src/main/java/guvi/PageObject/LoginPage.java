package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage
{
	public WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Code to logged into an existing account.
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
	WebElement loginIconHome;
	
	@FindBy(xpath="(//div[@class=\"css-76zvg2 r-homxoj r-ubezar r-1ozqkpa\"])[3]")
	WebElement buttonMobileNo;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'])[4]")
	WebElement buttonEmail;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement enterEmailId;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterPassword;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterInvalidPassword;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement loginbutton;
	
	//Verification process.
	@FindBy(xpath="//*[text()='Hi Motesha Abhishek']")
	WebElement loginValidStatus;
	
	@FindBy(xpath="//*[text()='Forgot Password ?']")
	WebElement loginInValidStatus;
	
	//Creating methods.
	
	public void Login() 
	{
		loginIconHome.click();
	}
	
	public void EmailButton() 
	{
		buttonEmail.click();
	}
	
	public void EmailId(String Email) 
	{
		enterEmailId.sendKeys(Email);
	}
	
	public void Password(String Password) 
	{
		enterPassword.sendKeys(Password);
	}
	
	public void invalidPassword(String invalidPassword) 
	{
		enterInvalidPassword.sendKeys(invalidPassword);
	}
	
	public void loginButton() 
	{
		Actions action=new Actions(driver);
		action.doubleClick(loginbutton).build().perform();
	}
	
	public void waitToLocate() 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(loginValidStatus));
	}
		
	public void verifyLoginValidCredentials()
	{
		String verifyMsg="Hi Motesha Abhishek";
		Assert.assertEquals(loginValidStatus.getText(), verifyMsg);
	}
		
	public void verifyLoginInValidCredentials()
	{
		String verifyMsg1="Forgot Password ?";
		Assert.assertEquals(loginInValidStatus.getText(), verifyMsg1);
	}
}