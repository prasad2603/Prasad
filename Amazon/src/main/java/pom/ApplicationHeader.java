package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath="(//div[@class='nav-left'])[3]")
	private WebElement all;
	
	@FindBy (xpath="//a[text()='Best Sellers']")
	private WebElement bestSellers;
	
	@FindBy (xpath="//a[text()='Mobiles']")
	private WebElement mobiles;
	
	@FindBy (xpath="//a[text()='Customer Service']")
	private WebElement customerService;
	
	@FindBy (xpath="//a[text()=' Electronics ']")
	private WebElement electronics;
	
	@FindBy (xpath="//a[@id='nav-cart']")
	private WebElement cart;
	
	@FindBy (xpath="//a[@id='nav-orders']")
	private WebElement returnsAndOrders;
	
	@FindBy (xpath="//a[@data-csa-c-content-id='nav_ya_signin']")
	private WebElement signin;
	
	@FindBy (xpath="//a[@aria-label='Choose a language for shopping.']")
	private WebElement indiaLogo_Language;
	
	@FindBy (xpath="//span[@id='nav-global-location-data-modal-action']")
	private WebElement location;
	
	@FindBy (xpath="//a[@id='nav-logo-sprites']")
	private WebElement amazonLogo;
	
	@FindBy (xpath="(//div[@class='nav-left'])[2]")
	private WebElement allSearcbar;
	
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnCart()
	{
		cart.click();
	}
	public void clickOnBestSellers()
	{
		bestSellers.click();
	}
	public void clickOnMobiles()
	{
		mobiles.click();
	}
	public void clickOnCustomerService()
	{
		customerService.click();
	}
	public void clickOnElectronics()
	{
		electronics.click();
	}

}
