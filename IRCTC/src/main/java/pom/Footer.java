package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer {
	
	@FindBy(xpath="(//span[@class='footer_headings'])[1]")
	private WebElement irctcTrains;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[2]")
	private WebElement generalInformation;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[3]")
	private WebElement importantInformation;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[4]")
	private WebElement agents;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[5]")
	private WebElement anquiries;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[6]")
	private WebElement howTo;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[7]")
	private WebElement irctcOfficialApp;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[8]")
	private WebElement advertiseWithUs;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[9]")
	private WebElement refundRules;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[10]")
	private WebElement divyangjanFacilities;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[11]")
	private WebElement irctc_eWallets;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[12]")
	private WebElement irctcLoyaltyProgram;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[13]")
	private WebElement irctc_iPayPaymenetGateway;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[14]")
	private WebElement irctcZone;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[15]")
	private WebElement forNewlyMigratedAgents;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[16]")
	private WebElement mobileZone;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[17]")
	private WebElement policies;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[18]")
	private WebElement askDishaChatBot;
	
	@FindBy(xpath="(//span[@class='footer_headings'])[19]")
	private WebElement aboutUs;
	
	public Footer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void aboutUs()
	{
		aboutUs.click();
	}

	

}
