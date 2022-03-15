package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstMobileNokiaG10 {
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	
	public FirstMobileNokiaG10(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnaddToCart()
	{
		addToCart.click();
	}

}
