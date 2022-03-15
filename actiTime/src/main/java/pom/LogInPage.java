package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
	
	private WebDriver driver;
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement userName ;
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement userName1 ;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password ;
	
	@FindBy (xpath="//input[@name='remember']")
	private WebElement keepMeLoggedInCheckbox ;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login ;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void sendUserName(String user) 
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(keepMeLoggedInCheckbox));
		
		userName.sendKeys(user);
	}
	
	public void sendPassword(String pass) 
	{
		password.sendKeys(pass);
	}
	public boolean clickOnKeepMeLogin() {
		
		boolean a=keepMeLoggedInCheckbox.isSelected();
	     return a;
    }
	public void clickOnLogin() 
	{
		login.click();
	}
	

}
