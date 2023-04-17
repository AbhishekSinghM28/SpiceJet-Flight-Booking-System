package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class SignupPage 
{	
	public WebDriver driver;

	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//Code to create an account using SignUp page.

	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]")
	WebElement signupIconHome;
	
	@FindBy(xpath="(//option[@value='MR'])[1]")
	WebElement title;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//input[@id='defaultCheck1']")
	WebElement checkboxIAgree;
	
	@FindBy(xpath="//button[@class='btn btn-red']")
	WebElement buttonSubmit;
	
	@FindBy(xpath="(//div[@class='font-13 mt-10 inlineErrors'])[7]")
	WebElement accountStatus;
	
	//Creating methods for fill-out and submit SignUp form.
	
	public void SignUp() 
	{
		signupIconHome.click();
	}
	
	public void SelectTitle() 
	{
		title.click();
	}
	
	public void Firstname(String FirstName) 
	{
		firstname.sendKeys(FirstName);
	}
	
	public void Lastname(String LastName) 
	{
		lastname.sendKeys(LastName);
	}
	
	public void EnterCountry(String Country) 
	{
		country.sendKeys(Country);
	}
	
	public void DateOfBirth(String DOB) 
	{
		dateofbirth.sendKeys(DOB);
		//selectdateofbirth.click();
	}
	
	public void MobileNumber(String MobileNumber) 
	{
		mobilenumber.click();
		mobilenumber.sendKeys(MobileNumber);
	}
	
	public void EmailId(String Email) 
	{
		email.click();
		email.sendKeys(Email);
	}
	
	public void EnterPassword(String Password) 
	{
		password.sendKeys(Password);
	}
	
	public void ConfirmPassword(String ConfirmPassword) 
	{
		confirmpassword.sendKeys(ConfirmPassword);
	}
	
	public void IAgree() 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", checkboxIAgree);
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(checkboxIAgree));
		
		checkboxIAgree.click();
	}
	
	public void Submit() 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", buttonSubmit);
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(buttonSubmit));
		
		buttonSubmit.click();
	}
	
	//Creating a method to verify is the user is already exists.
	
	public void verifySignUp() 
	{
		String verifyMsg="Member account exists with given email ID";
		Assert.assertEquals(accountStatus.getText(), verifyMsg);
	}
}