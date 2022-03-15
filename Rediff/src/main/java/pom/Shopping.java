package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping {
	
	@FindBy (xpath="(//input[@type='text'])[1]")
	private WebElement search;
	
	@FindBy (xpath="(//input[@type='button'])[1]")
	private WebElement searchButton;
			
	public Shopping(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnSearch()
	{
		search.sendKeys("Laptop");
	}
	public void clickOnSearchButton()
	{
		searchButton.click();
	}
}
