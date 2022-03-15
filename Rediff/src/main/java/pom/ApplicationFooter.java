package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationFooter {
	
	@FindBy (xpath="//a[text()='Rediff.com US']")
	private WebElement rediffCom;
	
	@FindBy (xpath="//a[text()='Investors']")
	private WebElement investors;
	
	@FindBy (xpath="//a[text()='Advertise with us']")
	private WebElement advertiseWithUs;
	
	@FindBy (xpath="//a[text()='Disclaimer']")
	private WebElement disclaimer;
	
	@FindBy (xpath="//a[text()='Privacy']")
	private WebElement privacy;
	
	@FindBy (xpath="(//a[text()='Rediff Labs'])[2]")
	private WebElement rediffLabs;
	
	@FindBy (xpath="//a[text()='Sitemap']")
	private WebElement sitemap;
	
	@FindBy (xpath="//a[text()='Feedback']")
	private WebElement feedback;
	
	@FindBy (xpath="//a[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy (xpath="//a[text()='About us']")
	private WebElement aboutUs;
	
	@FindBy (xpath="//a[text()='Terms of use']")
	private WebElement termOfUse;
	
	@FindBy (xpath="//a[text()='Grievances']")
	private WebElement grievances;
	
	public ApplicationFooter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRediffCom()
	{
		rediffCom.click();
	}
	public void clickOnInvestors()
	{
		investors.click();
	}
	public void clickOnAdvertiseWithUs()
	{
		advertiseWithUs.click();
	}
	public void clickOnDisclaimer()
	{
		disclaimer.click();
	}
	public void clickOnPrivacy()
	{
		privacy.click();
	}
	public void clickOnRediffLabs()
	{
		rediffLabs.click();
	}
	public void clickOnSitemap()
	{
		sitemap.click();
	}
	public void clickOnFeedback()
	{
		feedback.click();
	}
	public void clickOnContactUs()
	{
		contactUs.click();
	}
	public void clickOnAboutUs()
	{
		aboutUs.click();
	}
	public void clickOnTermOfUse()
	{
		termOfUse.click();
	}
	public void clickOnGrievances()
	{
		grievances.click();
	}
	

}
