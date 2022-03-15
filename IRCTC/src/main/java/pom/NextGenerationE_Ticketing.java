package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextGenerationE_Ticketing {
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement ok;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[1]")
	private WebElement from;
	
	@FindBy(xpath="//span[text()='MUMBAI CENTRAL - MMCT']")
	private WebElement startingPoint;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[2]")
	private WebElement to;
	
	@FindBy(xpath="//span[text()='PUNE JN - PUNE']")
	private WebElement destinationPoint;
	
	@FindBy(xpath="(//div[@style='width: 100%;'])[1]")
	private WebElement allClasses;
	
	@FindBy(xpath="//span[text()='First Class (FC)']")
	private WebElement selectClass_FC;
	
	@FindBy(xpath="(//div[@style='width: 100%;'])[2]")
	private WebElement general;
	
	@FindBy(xpath="//span[text()='LADIES']")
	private WebElement generalType_Ladies;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement search;
	
	public NextGenerationE_Ticketing(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicOnOk()
	{
		ok.click();
	}
	public void clickOnFrom()
	{
		from.click();
	}
	public void clickOnStartingPoint()
	{
		startingPoint.click();
	}
	public void clickOnTo()
	{
		to.click();
	}
	public void clickOnDestinationPoint()
	{
		destinationPoint.click();
	}
	public void clickOnAllClasses()
	{
		allClasses.click();
	}
	public void clickOnSelectClass_FC()
	{
		selectClass_FC.click();
	}
	public void clicOnGeneral()
	{
		general.click();
	}
	public void clicOnGeneralType_Ladies()
	{
		generalType_Ladies.click();
	}
	public void clicOnSearch()
	{
		search.click();
	}
	
}
