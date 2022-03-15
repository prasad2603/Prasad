package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSwag {
	
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	private WebElement all;
	
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;

	@FindBy (xpath="//a[@class='shopping_cart_link']")
	private WebElement toCart ;
	
	
	public HeaderSwag(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnAll()
	{
		all.click();
	}

	public void clickOnlogout()
	{
		logout.click();
	}
	public void clickOnToCart()
	{
		toCart.click();
	}
}
