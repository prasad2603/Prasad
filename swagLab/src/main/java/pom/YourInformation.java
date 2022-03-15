package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformation {
	
	@FindBy (xpath="//input[@id='first-name']")
	private WebElement firstName ;
	
	@FindBy (xpath="//input[@id='last-name']")
	private WebElement lastName ;
	
	@FindBy (xpath="//input[@id='postal-code']")
	private WebElement postalCode ;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement continues;
	
	public YourInformation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendFirstName(String fName)
	{
		firstName.sendKeys(fName);
	}
	public void sendLastName(String lName)
	{
		lastName.sendKeys(lName);
	}
	public void sendPostalCode(String pin)
	{
		postalCode.sendKeys(pin);
	}
	public void clickOnContinues()
	{
		continues.click();
	}

}
