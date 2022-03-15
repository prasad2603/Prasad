package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCart {
	
	@FindBy (xpath="//button[@id='checkout']")
	private WebElement checkout ;
	
	public YourCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnCheckout()
	{
		checkout.click();
	}

}
