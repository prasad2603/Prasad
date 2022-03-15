package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogInOrSignUp {
	
	@FindBy (xpath="//img[@alt='Facebook']")
	private WebElement facebook;
	
	@FindBy (tagName="a")
	private List<WebElement> links;
	
	@FindBy (xpath="//div[@id='content']//h2")
	private WebElement facebookHelpsYpuConnectAndShareWithThePeopleInYpurLife;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement emailAddressOrPhoneNumber;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;

	@FindBy (xpath="//button[text()='Log In']")
	private WebElement logIn;
	
	@FindBy (xpath="//a[text()='Forgotten password?']")
	private WebElement forgottenPassword;
	
	@FindBy (xpath="//a[@data-testid='open-registration-form-button']")
	private WebElement createNewAccount;
	
	@FindBy (xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy (xpath="//input[@name='lastname']")
	private WebElement surname;
	
	@FindBy (xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobileNumberOrEmailAddress;
	
	@FindBy (xpath="//input[@id='password_step_input']")
	private WebElement newPassword;
	
	@FindBy (xpath="//select[@id='day']")
	private WebElement day;
	
	@FindBy (xpath="//select[@aria-label='Month']")
	private WebElement month;
	
	@FindBy (xpath="//select[@aria-label='Year']")
	private WebElement year;
	
	@FindBy (xpath="(//input[@type='radio'])[1]")
	private WebElement male;
	
	@FindBy (xpath="(//input[@type='radio'])[1]")
	private WebElement female;
	
	@FindBy (xpath="(//input[@type='radio'])[1]")
	private WebElement custom;
	
	@FindBy (xpath="//select[@aria-label='Select your pronoun']")
	private WebElement selectYourPronoun;
	
	@FindBy (xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signUp;
	
	public LogInOrSignUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyTextFacebook()
	{
		String a=facebook.getText();
		return a;
	}
	public int numberOfLinks()
	{
		int a=links.size();
		return a;
	}
	public String verifyMainLineText()
	{
		String a=facebookHelpsYpuConnectAndShareWithThePeopleInYpurLife.getText();
		return a;
	}
	public void sendEmailAddressOrPhoneNumber(String number)
	{
		emailAddressOrPhoneNumber.sendKeys(number);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnLogIn()
	{
		logIn.click();
	}
	public boolean verifyIsEnabledLogIn()
	{
		boolean a=logIn.isEnabled();
		return a;
	}
	public void clickOnForgottenPassword()
	{
		forgottenPassword.click();
	}
	public void clickOnCreateNewAccount()
	{
		createNewAccount.click();
	}
	public void sendFirstName()
	{
		firstName.sendKeys("Prasad");
	}
	public void sendSurname()
	{
		surname.sendKeys("Raut");
	}
	public void sendMobileNumberOrEmailAddress()
	{
		mobileNumberOrEmailAddress.sendKeys("prasadraut@gmail.com");
	}
	public void sendNewPassword()
	{
		newPassword.sendKeys("Prasad");
	}
	public void clickOnDay()
	{
		Select select=new Select(day);
		select.selectByIndex(2);
	}
	public void clickOnMonth()
	{
		Select select=new Select(month);
		select.selectByValue("4");
	}
	public void clickOnYear()
	{
		Select select=new Select(year);
		select.selectByValue("1998");
	}
	public void clickOnMale()
	{
		male.click();
	}
	public void clickOnFemale()
	{
		female.click();
	}
	public void clickOnCustom()
	{
		custom.click();
	}
	public void clickOnSelectYourPronoun()
	{
		selectYourPronoun.click();
	}
	public void clickOnSignUp()
	{
		signUp.click();
	}
	
}
