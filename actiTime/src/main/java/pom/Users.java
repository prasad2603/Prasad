package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Users {
	
	@FindBy(xpath="//div[@class='roundedBoxTag graphicButton button']")
	private WebElement user;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firsttName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailAdress;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='passwordCopy']")
	private WebElement retypePassword;
	
	@FindBy(xpath="(//input[@type='checkbox'])[7]")
	private WebElement generateTimeReportsCheckBox;
	
	@FindBy(xpath="//div[@id='userDataLightBox_commitBtn']")
	private WebElement createUser;
	
	public Users(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkTextUser()
	{
		String text=user.getText();
		return text;
	}
	public void clickOnUser()
	{
		user.click();
	}
	
	public void sendFirsttName(String fName)
	{
		firsttName.sendKeys(fName);
	}
	
	public void sendLastName(String lName)
	{
		lastName.sendKeys(lName);
	}
	public void sendEmailAdress(String eMail)
	{
		emailAdress.sendKeys(eMail);
	}
	
	public void sendUsername(String userName)
	{
		username.sendKeys(userName);
	}
	
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void sendRetypePassword(String repass)
	{
		retypePassword.sendKeys(repass);
	}
	public void clickOnGenerateTimeReportsCheckBox()
	{
		generateTimeReportsCheckBox.click();
	}
	public void clickOnCreateUser()
	{
		createUser.click();
	}

}
