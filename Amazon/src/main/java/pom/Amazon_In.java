package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_In {
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy (xpath="//span[@id='nav-search-submit-text']")
	private WebElement searchButtonClick;
	
	public Amazon_In(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendSearchBox(String price)
	{
		searchBox.sendKeys(price);
	}
	public void clickOnsearchButtonClick()
	{
		searchButtonClick.click();
	}

}
