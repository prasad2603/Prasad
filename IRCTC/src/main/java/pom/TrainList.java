package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainList {
	
	@FindBy(xpath="(//label[@for='1A'])[1]")
	private WebElement checkBoxFirstClass;

	public TrainList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void checkBoxFirstClass()
	{
		checkBoxFirstClass.click();
	}
}
