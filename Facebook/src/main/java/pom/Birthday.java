package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Birthday {
	
	@FindBy(xpath="//span[text()='Birthdays']")
	private WebElement birthday;

	@FindBy(xpath="(//span[@dir='auto'])[14]")
	private WebElement ViewBirthday;
	
	public Birthday(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnBirthday()
	{
		birthday.click();
	}
	public void clickOnViewBirthday()
	{
		ViewBirthday.click();
	}
}
