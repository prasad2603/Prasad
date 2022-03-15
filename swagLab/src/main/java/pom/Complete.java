package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Complete {
	
	@FindBy (xpath="//button[@id='back-to-products']")
	private WebElement complete;
	
	public Complete(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnBackToHomePage()
	{
		complete.click();
	}


}
