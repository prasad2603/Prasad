package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsLaptop {

	@FindBy(xpath="(//input[@type='button'])[3]")
	private WebElement buy;
	
	@FindBy(xpath="//input[@onclick='checkSelected();']")
	private WebElement placedOrder;
	
	public KidsLaptop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnBuy()
	{
		buy.click();
	}
	public void clickOnPlacedOrder()
	{
		placedOrder.click();
	}
}
