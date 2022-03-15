package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laptop {
	
	@FindBy(xpath="(//div[@class='productresultsWrapper']//h4)[2]")
	private WebElement laptop;
	
	public Laptop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLaptop()
	{
		laptop.click();
	}

}
