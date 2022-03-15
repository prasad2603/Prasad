package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPlace {
	
	@FindBy(xpath="(//div[@aria-label='Collection of Marketplace items']//div//span//div//span)[9]")
	private WebElement carSelect;
	
	public MarketPlace(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOncarSelect()
	{
		carSelect.click();
	}

}
