package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateANewAccout {
	
	@FindBy (xpath="//a[@title='Create new Rediffmail account']")
	private WebElement createA_NewAccout;
	
	public CreateANewAccout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnCreateA_NewAccout()
	{
		createA_NewAccout.click();
	}

}
