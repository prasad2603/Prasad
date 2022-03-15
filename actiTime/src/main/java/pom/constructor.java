package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class constructor {
	
     private WebDriver driver;
	
	         @FindBy (xpath="//input[@name='localVariable']")
	         private WebElement localVariable1 ;
	
	          @FindBy (xpath="//input[@name='localVariable']")
	         private WebElement localVariable2 ;
	
	
	          @FindBy (xpath="//input[@name='verify']")
		      private WebElement verify ;
	public constructor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	         public void methods1() 
	         {
		       localVariable1.sendKeys("abcd");
		       WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.visibilityOf(localVariable2));
	         }
	
	        public void methods2(String pass) 
	         {
		     localVariable2.sendKeys(pass);
	         }
	        public boolean clickOnKeepMeLogin() 
	         {
	    		boolean a=verify.isSelected();
	    	     return a;
	         }
}
