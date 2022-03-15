package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationFooter {
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[1]")
	private WebElement english;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[2]")
	private WebElement marathi;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[3]")
	private WebElement hindi;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[4]")
	private WebElement urdu;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[5]")
	private WebElement gujarati;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[6]")
	private WebElement kannada;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[7]")
	private WebElement punjabi;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[8]")
	private WebElement tamil;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[9]")
	private WebElement bengali;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[11]")
	private WebElement telagu;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[11]")
	private WebElement malyalam;

	@FindBy(xpath="(//div[@id='pageFooter']//li)[12]")
	private WebElement plus;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[13]")
	private WebElement signUp;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[14]")
	private WebElement logIn;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[15]")
	private WebElement messanger;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[16]")
	private WebElement facebookLite;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[17]")
	private WebElement watch;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[18]")
	private WebElement places;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[19]")
	private WebElement games;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[20]")
	private WebElement marketplace;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[21]")
	private WebElement facebookPay;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[22]")
	private WebElement oculus;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[23]")
	private WebElement poprtal;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[24]")
	private WebElement instagram;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[25]")
	private WebElement bulletin;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[26]")
	private WebElement local;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[27]")
	private WebElement fundraiser;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[28]")
	private WebElement services;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[29]")
	private WebElement votingInformationCentre;

	@FindBy(xpath="(//div[@id='pageFooter']//li)[30]")
	private WebElement groups;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[31]")
	private WebElement about;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[32]")
	private WebElement createAdd;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[33]")
	private WebElement createPage;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[34]")
	private WebElement developers;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[35]")
	private WebElement careers;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[36]")
	private WebElement privacy;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[37]")
	private WebElement cookies;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[38]")
	private WebElement adchoices;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[39]")
	private WebElement terms;
	
	@FindBy(xpath="(//div[@id='pageFooter']//li)[40]")
	private WebElement helps;
	
	public ApplicationFooter(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnCareers()
	{
		careers.click();
	}
	public void clickOnAbout()
	{
		about.click();
	}

}
