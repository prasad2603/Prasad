package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadersOfFB {
	
	@FindBy(xpath="//a[@aria-label='Friends']")
	private WebElement request;
	
	@FindBy(xpath="//a[@aria-label='Watch']")
	private WebElement watch;
	
	@FindBy(xpath="//a[@aria-label='Marketplace']")
	private WebElement marketplace;
	
	@FindBy(xpath="//div[@aria-label='Account']")
	private WebElement account;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	public HeadersOfFB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRequest()
	{
		request.click();
	}
	public void clickOnWatch()
	{
		watch.click();
	}
	public void clickOnMarketplace()
	{
		marketplace.click();
	}
	public void clickOnAccount()
	{
		account.click();
	}
	public void clickOnLogout()
	{
		logout.click();
	}
	
	

}
