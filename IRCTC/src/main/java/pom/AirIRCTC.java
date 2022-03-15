package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirIRCTC {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Origin']")
	private WebElement origin;
	
	@FindBy(xpath="//div[text()='Mumbai (BOM)']")
	private WebElement mumbai;
	
	@FindBy(xpath="//input[@placeholder='Destination']")
	private WebElement destination;
	
	@FindBy(xpath="//div[text()='New Delhi (DEL)']")
	private WebElement delhi;
			
	@FindBy(xpath="//input[@placeholder='Departure ']")
	private WebElement departure;
	
	@FindBy(xpath="(//table[@class='date-table']//td)[29]")
	private WebElement departureDate;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement search;
	
	public AirIRCTC(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	public void origin()
	{
		origin.sendKeys("Mumb");
	}
	public void clickOnMumbai()
	{
		mumbai.click();
	}
	public void destination()
	{
		destination.sendKeys("Delhi");
	}
	public void clickOndelhi()
	{
		delhi.click();
	}
	public void departure()
	{
		departure.click();
	}
	public void departureDate()
	{
		Actions action=new Actions(driver);
		action.moveToElement(departureDate);
	
	}
	public void search()
	{
		search.click();
	}
	

}
