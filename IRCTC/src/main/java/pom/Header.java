package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
	
	@FindBy (xpath="(//a[@tabindex='0'])")
	private WebElement all;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	private WebElement logIn;
	
	@FindBy(xpath="//span[text()='IRCTC EXCLUSIVE']")
	private WebElement irctcExclusive;
	
	@FindBy(xpath="(//strong[text()='TRAINS'])[2]")
	private WebElement trains;
	
	@FindBy(xpath="//label[text()='BUSES']")
	private WebElement buses;
	
	@FindBy(xpath="(//label[text()='FLIGHTS'])[1]")
	private WebElement flights;
	
	@FindBy(xpath="(//label[text()='HOTELS'])[1]")
	private WebElement hotels;
	
	@FindBy(xpath="(//label[text()='HOLIDAYS '])[1]")
	private WebElement holidays;
	
	@FindBy(xpath="(//label[text()='LOYALTY '])[1]")
	private WebElement loyalty;
	
	@FindBy(xpath="(//label[text()='MEALS '])[1]")
	private WebElement meals;
	
	@FindBy(xpath="(//label[text()='PROMOTIONS '])[1]")
	private WebElement promotions;
	
	@FindBy(xpath="(//label[text()='PREMIUM PARTNER '])[1]")
	private WebElement premiumPartner;
	
	@FindBy(xpath="(//label[text()='MORE '])[1]")
	private WebElement more;
	
	@FindBy(xpath="(//label[text()='CONTACT US'])[1]")
	private WebElement contactUs;
	
	@FindBy(xpath="(//label[text()='AGENT LOGIN '])[1]")
	private WebElement agentLogIn;
	
	@FindBy(xpath="(//label[text()='ASK DISHA'])[1]")
	private WebElement askDisha;
	
	@FindBy(xpath="(//strong[text()='हिंदी'])[2]")
	private WebElement hindi;
	
	public Header(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnFlights()
	{
		flights.click();
	}
	public void clickOnAll()
	{
		all.click();
	}
	public void clickOnLogIn()
	{
		logIn.click();
	}
	public void clickOnIrctcExclusive()
	{
		irctcExclusive.click();
	}
	public void clickOnTrains()
	{
		trains.click();
	}
	public void clickOnBuses()
	{
		buses.click();
	}
	public void clickOnHotels()
	{
		hotels.click();
	}
	public void clickOnHolidays()
	{
		holidays.click();
	}
	public void clickOnLoyalty()
	{
		loyalty.click();
	}
	public void clickOnMeals()
	{
		meals.click();
	}
	public void clickOnPromotions()
	{
		promotions.click();
	}
	public void clickOnPremiumPartner()
	{
		premiumPartner.click();
	}

	public void clickOnMore()
	{
		more.click();
	}
	public void clickOnContactUs()
	{
		contactUs.click();
	}
	public void clickOnAgentLogIn()
	{
		agentLogIn.click();
	}
	public void clickOnAskDisha()
	{
		all.click();
	}
	public void clickOnHindi()
	{
		hindi.click();
	}
}
