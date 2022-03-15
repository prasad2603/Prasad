package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bus {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='departFrom']")
	private WebElement departFrom;
	
	@FindBy(xpath="(//div[@class='ui-menu-item-wrapper'])")
	private WebElement pune;
	
	@FindBy(xpath="//input[@id='goingTo']")
	private WebElement goingTo;
	
	@FindBy(xpath="(//div[@class='ui-menu-item-wrapper'])[11]")
	private WebElement nashik;
			
	@FindBy(xpath="//input[@id='departDate']")
	private WebElement departureDateBox;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])[13]")
	private WebElement departureDate;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement search;
	
	public Bus(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	public void departFrom()
	{
		departFrom.sendKeys("Pun");
	}
	public void clickOnpune()
	{
		pune.click();
	}
	public void goingTo()
	{
		goingTo.sendKeys("Nash");
	}
	public void clickOnnashik()
	{
		nashik.click();
	}
	public void departureDateBox()
	{
		departureDateBox.click();
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
