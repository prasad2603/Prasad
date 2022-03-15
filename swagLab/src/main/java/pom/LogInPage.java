package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	@FindBy (xpath="//input[@id='user-name']")
	private WebElement userName ;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password ;
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement login ;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public void sendUserName(String user)
	{
		userName.sendKeys(user);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnLogin()
	{
		login.click();
	}
	

}
