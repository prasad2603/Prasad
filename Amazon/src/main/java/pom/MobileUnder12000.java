package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileUnder12000 {
	
	@FindBy(xpath="(//div[@id='search']//span//h2//a//span)[1]")
	private WebElement clickOnFirstMobileNokiaG10;
	
	public MobileUnder12000(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnFirstMobileNokiaG10()
	{
		clickOnFirstMobileNokiaG10.click();
	}

}
