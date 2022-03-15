package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer {
	
	@FindBy(xpath="(//h3[@class='a-spacing-none a-text-normal'])[7]")
	private WebElement amazzonAndCovid_19;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement articalHelpfulYes;
	
	public Customer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnAmazzonAndCovid_19()
	{
		amazzonAndCovid_19.click();
	}
	public void clickOnArticalHelpfulYes()
	{
		articalHelpfulYes.click();
	}
}
