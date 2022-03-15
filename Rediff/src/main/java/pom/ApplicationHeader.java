package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath="//a[@class='mailicon']")
	private WebElement rediffmail;
	
	@FindBy (xpath="//a[@class='moneyicon relative']")
	private WebElement money;
	
	@FindBy (xpath="//a[@class='eproicon relative']")
	private WebElement enterpriseEmail;
	
	@FindBy (xpath="//a[@class='vdicon']")
	private WebElement videos;
	
	@FindBy (xpath="//a[@class='bmailicon relative']")
	private WebElement businessEmail;
	
	@FindBy (xpath="//a[@class='shopicon relative']")
	private WebElement shopping;
	
	@FindBy (xpath="//div[@class='cell alignR toprlinks']")
	private WebElement createAccount;
	
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnRediffmail()
	{
		rediffmail.click();
	}
	public void clickOnMoney()
	{
		money.click();
	}
	public void clickOnEnterpriseEmail()
	{
		enterpriseEmail.click();
	}
	public void clickOnVideos()
	{
		videos.click();
	}
	public void clickOnBusinessEmail()
	{
		businessEmail.click();
	}
	public void clickOnShopping()
	{
		shopping.click();
	}
	public void clickOnCreateAccount()
	{
		createAccount.click();
	}
	
}
