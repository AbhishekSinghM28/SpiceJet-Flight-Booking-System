package guvi.PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BookFlightTwowayTrip 
{
public WebDriver driver;
	
	public BookFlightTwowayTrip(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		//Code to book a Two-Way flight.
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
		WebElement fieldPFirstandMiddleName;
		
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
		WebElement feildPLastName;

		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[3]")
		WebElement feildPEmailAddress;
		
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
		WebElement feildPContactNumber;

		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[4]")
		WebElement feildPTownorCity;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-1b43r93 r-16dba41'])[4]")
		WebElement checkboxToMarkasPrimaryPassenger;
		
		//Secondary Passenger Details..
		@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[2]")//css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52
		WebElement feildSPATitle;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-poiln3 r-ubezar r-j2kj52'])[3]")
		WebElement feildSPITitle;
			
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[1]")
		WebElement selectMr;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[2]")
		WebElement selectMrs;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[3]")
		WebElement selectMiss;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[2]")
		WebElement selectMaster;
		
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[5]")
		WebElement feildSFirstandMiddleName;
		
		@FindBy(xpath="//input[@data-testid='traveller-1-last-traveller-info-input-box']")
		WebElement feildSPA1LastName;
		
		@FindBy(xpath="//input[@data-testid='traveller-2-last-traveller-info-input-box']")
		WebElement feildSPA2LastName;	
		
		@FindBy(xpath="//input[@data-testid='traveller-3-last-traveller-info-input-box']")
		WebElement feildSPC1LastName;	
			
		@FindBy(xpath="//input[@data-testid='traveller-4-last-traveller-info-input-box']")
		WebElement feildSPC2LastName;
		
		@FindBy(xpath="(//input[@data-testid='last-traveller-0-infant-information'])")
		WebElement feildSPILastName;
		
		@FindBy(xpath="(//input[@class='css-1cwyjr8 r-1yadl64 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
		WebElement feildSContactNumber;
		
		@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79']")
		WebElement buttonNextSPA1;
		
		@FindBy(xpath="//input[@data-testid='date-of-birth-traveller-0-infant-information']")
		WebElement selectorDOB;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-edyy15 r-q4m81j'])[2]")
		WebElement selectorYear;
		
		@FindBy(xpath="(//div[@class='css-1dbjc4n r-1loqt21 r-12zupyf r-1otgn73'])[3]")
		WebElement selectorMonth;
		
		@FindBy(xpath="(//div[@class=\"css-76zvg2 r-1awozwy r-14lw9ot r-qsz3a2 r-6koalj r-poiln3 r-1r8g8re r-1777fci r-1acpoxo\"])[5]")
		WebElement selectorDate;
			
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'])[3]")
		WebElement selectorTravellingwith;
		
		//Creating Locators for verifying booking details..
		@FindBy(xpath="(//div[@class=\"css-76zvg2 r-c20mna r-poiln3 r-1inkyih\"])[1]")
		WebElement bsource;
		
		@FindBy(xpath="(//div[@class=\"css-76zvg2 r-c20mna r-poiln3 r-1inkyih\"])[3]")
		WebElement rsource;
		
		@FindBy(xpath="(//div[@class=\"css-76zvg2 r-c20mna r-poiln3 r-1inkyih\"])[2]")
		WebElement bdestination;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-c20mna r-poiln3 r-1inkyih'])[4]")
		WebElement rdestination;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-zso239'])[1]")
		WebElement bflightno;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-zso239'])[2]")
		WebElement rflightno;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93'])[1]")
		WebElement bdate;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93'])[2]")
		WebElement rdate;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-1f6r7vd'])[1]")
		WebElement btime;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-1b43r93 r-1f6r7vd'])[1]")
		WebElement rtime;
		
		@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-poiln3 r-adyw6z r-1kfrs79'])[3]")
		WebElement payableamount;	
		
		@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
		WebElement buttonContinue;
		
		@FindBy(xpath="//div[@data-testid='add-ons-continue-footer-button']")
		WebElement buttonAddOnContinue;
		
		//Creating Locators for Verify Payment..
		@FindBy(xpath="//input[@id='card_number']")
		WebElement cardnumber;	
		@FindBy(xpath="//input[@id='name_on_card']")
		WebElement cardholder;	
		@FindBy(xpath="//input[@id='card_exp_month']")
		WebElement expmonth;
		@FindBy(xpath="//input[@id='card_exp_year']")
		WebElement expyear;
		@FindBy(xpath="//input[@id='security_code']")
		WebElement cvv;
		@FindBy(xpath="//div[@id='payment_form_card_number_error']")
		WebElement cardnumbererror;	
			
		//Creating methods for Filling passenger details and Booking a flight as One-Way Trip.
		//Contact Details()
		public void contactDetailsPrimaryPassenger(String FName, String LName, String EmailId, String MobileNo, String Town) 
		{
			fieldPFirstandMiddleName.sendKeys(FName);
			feildPLastName.click();
			feildPLastName.sendKeys(LName);
			feildPEmailAddress.click();
			feildPEmailAddress.sendKeys(EmailId);
			feildPContactNumber.sendKeys(MobileNo);
			feildPTownorCity.sendKeys(Town);	
		}
		
		//primaryPassenger Information()
		public void primaryPassengerInfo() 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(checkboxToMarkasPrimaryPassenger));
			
			checkboxToMarkasPrimaryPassenger.click();
			buttonNextSPA1.click();
		}
		
		//adultPassenger2 Information()
		public void secondaryPassengerAdult1Info(String SPA1FName, String SPA1LName, String SPA1MobileNo) 
		{
			feildSPATitle.click();
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(selectMrs));
			
			selectMrs.click();
			feildSFirstandMiddleName.sendKeys(SPA1FName);
					
			feildSPA1LastName.sendKeys(SPA1LName);
			feildSContactNumber.sendKeys(SPA1MobileNo);
			buttonNextSPA1.click();
		}
			
		//adultPassenger2 Information()
		public void secondaryPassengerAdult2Info(String SPA2FName, String SPA2LName, String SPA2MobileNo) 
		{	
			feildSPATitle.click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(selectMiss));
			
			selectMiss.click();
			feildSFirstandMiddleName.sendKeys(SPA2FName);
			feildSPA2LastName.sendKeys(SPA2LName);
			feildSContactNumber.sendKeys(SPA2MobileNo);
			buttonNextSPA1.click();
		}
		
		//childPassenger1 Information()
		public void secondaryPassengerChild1Info(String SPC1FName, String SPC1LName) 
		{	
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(feildSPATitle));
			feildSPATitle.click();
			
			selectMaster.click();
			feildSFirstandMiddleName.sendKeys(SPC1FName);
			feildSPC1LastName.sendKeys(SPC1LName);
			buttonNextSPA1.click();
		}
		
		//childPassenger2 Information()
		public void secondaryPassengerChild2Info(String SPC2FName, String SPC2LName) 
		{	
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(feildSPATitle));
			feildSPATitle.click();
			
			selectMr.click();
			feildSFirstandMiddleName.sendKeys(SPC2FName);
			feildSPC2LastName.sendKeys(SPC2LName);
			buttonNextSPA1.click();
		}
		
		//infantPassenger Information()
		public void secondaryPassengerInfantInfo(String SPIFName, String SPILName) 
		{	
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(feildSPATitle));
			feildSPATitle.click();
			
			selectMr.click();
			feildSFirstandMiddleName.sendKeys(SPIFName);
			feildSPILastName.sendKeys(SPILName);
			js.executeScript("arguments[0].scrollIntoView(true);", selectorDOB);
			selectorDOB.click();
			selectorYear.click();
			selectorMonth.click();
			selectorDate.click();	
			feildSPITitle.click();
			selectorTravellingwith.click();
		}
			
		//Verify Trip Summary()
		public void verifyTripSummary() 
		{
			System.out.println("Verifying the Boarding Flight Booking Details");
			System.out.println("---------------------------------");		
			System.out.println("Source to Destination : "+""+bsource.getText()+" to "+bdestination.getText());
			System.out.println("Flight Number : "+""+bflightno.getText());
			System.out.println("Date - Time : "+""+bdate.getText()+" - "+btime.getText());		
						
			System.out.println("Verifying the Return Flight Booking Details");
			System.out.println("---------------------------------");		
			System.out.println("Source to Destination : "+""+rsource.getText()+" to "+rdestination.getText());
			System.out.println("Flight Number : "+""+rflightno.getText());
			System.out.println("Date - Time : "+""+rdate.getText()+" - "+rtime.getText());		
			System.out.println("Payable Amount(Incl. of taxes) : "+""+payableamount.getText()+" INR");
			
			String expectedProductName="Mon, 01 May 2023";
			Assert.assertEquals(bdate.getText(),expectedProductName);	
			
			buttonContinue.click();			
		}
		
		//Go To Payment Page..
		public void GoToPaymentPage() 
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(buttonAddOnContinue));
			
			buttonAddOnContinue.click();
		}
		
		//Filling Payment info..
		public void enterpaymentdetail(String cardno,String cardname,String exmon,String exyr,String cvvno)
		{
			WebElement frame1=driver.findElement(By.xpath("//iframe[contains(@name,'card_number_iframe')]"));
			driver.switchTo().frame(frame1);
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(cardnumber));
			cardnumber.sendKeys(cardno);
			driver.switchTo().defaultContent();
			WebElement frame2=driver.findElement(By.xpath("//iframe[contains(@name,'name_on_card_iframe')]"));
			driver.switchTo().frame(frame2);
			cardholder.sendKeys(cardname);
			driver.switchTo().defaultContent();
			WebElement frame3=driver.findElement(By.xpath("//iframe[contains(@name,'card_exp_month_iframe')]"));
			driver.switchTo().frame(frame3);
			expmonth.sendKeys(exmon);
			driver.switchTo().defaultContent();
			WebElement frame4=driver.findElement(By.xpath("//iframe[contains(@name,'card_exp_year_iframe')]"));
			driver.switchTo().frame(frame4);
			expyear.sendKeys(exyr);
			driver.switchTo().defaultContent();
			WebElement frame5=driver.findElement(By.xpath("//iframe[contains(@name,'security_code_iframe')]"));
			driver.switchTo().frame(frame5);
			cvv.sendKeys(cvvno);
			driver.switchTo().defaultContent();
			Assert.assertEquals(cardnumbererror.getText(), "Please enter a valid card");
			System.out.println("Please verify your card details entered.");
		}
}
