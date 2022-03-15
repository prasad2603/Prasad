package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationFooter {
	
	@FindBy (xpath="(//div[@class='navFooterColHead'])[1]")
	private WebElement getToKnowUs;
	
	@FindBy (xpath="(//a[@class='nav_a'])[1]")
	private WebElement aboutUs;
	
	@FindBy (xpath="(//a[@class='nav_a'])[2]")
	private WebElement careers;
	
	@FindBy (xpath="(//a[@class='nav_a'])[3]")
	private WebElement pressReleases;
	
	@FindBy (xpath="(//a[@class='nav_a'])[4]")
	private WebElement amazonCares;

	@FindBy (xpath="(//a[@class='nav_a'])[5]")
	private WebElement gift_A_Smile;

	@FindBy (xpath="(//a[@class='nav_a'])[6]")
	private WebElement amazonScience;

	@FindBy (xpath="(//div[@class='navFooterColHead'])[2]")
	private WebElement connectWithUs;
	
	@FindBy (xpath="(//a[@class='nav_a'])[7]")
	private WebElement facebook;

	@FindBy (xpath="(//a[@class='nav_a'])[8]")
	private WebElement twitter;

	@FindBy (xpath="(//a[@class='nav_a'])[9]")
	private WebElement instagram;
	
	@FindBy (xpath="(//div[@class='navFooterColHead'])[3]")
	private WebElement makeMoneyWithUs;
	
	@FindBy (xpath="(//a[@class='nav_a'])[10]")
	private WebElement sellOnAmazon;
	
	@FindBy (xpath="(//a[@class='nav_a'])[11]")
	private WebElement sellUnderAmazonAccelerator;
	
	@FindBy (xpath="(//a[@class='nav_a'])[12]")
	private WebElement amazonGlobalSelling;
	
	@FindBy (xpath="(//a[@class='nav_a'])[13]")
	private WebElement becomeAnAffiliate;

	@FindBy (xpath="(//a[@class='nav_a'])[14]")
	private WebElement fulfilmentByAmazon;

	@FindBy (xpath="(//a[@class='nav_a'])[15]")
	private WebElement advertiseYourProducts;
	
	@FindBy (xpath="(//a[@class='nav_a'])[16]")
	private WebElement amazonPayOnMerchants;
	
	@FindBy (xpath="(//div[@class='navFooterColHead'])[4]")
	private WebElement letUsHelpYou;
	
	@FindBy (xpath="(//a[@class='nav_a'])[17]")
	private WebElement covid_19AndAmazon;
	
	@FindBy (xpath="(//a[@class='nav_a'])[18]")
	private WebElement yourAccount;
	
	@FindBy (xpath="(//a[@class='nav_a'])[19]")
	private WebElement returnsCentre;
	
	@FindBy (xpath="(//a[@class='nav_a'])[20]")
	private WebElement purchaseProtection;

	@FindBy (xpath="(//a[@class='nav_a'])[21]")
	private WebElement amazonAppDownload;

	@FindBy (xpath="(//a[@class='nav_a'])[22]")
	private WebElement amazonAssistantDownload;
	
	@FindBy (xpath="(//a[@class='nav_a'])[23]")
	private WebElement help;
	
	public ApplicationFooter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnFacebook()
	{
		facebook.click();
	}
	public void clickOnTwitter()
	{
		twitter.click();
	}
	public void clickOnCareers()
	{
		careers.click();
	}
}
