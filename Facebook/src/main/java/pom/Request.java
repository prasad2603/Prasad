package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Request {

	@FindBy(xpath="(//span[text()='Friend requests'])[1]")
	private WebElement requestSlide;

	@FindBy(xpath="(//span[text()='Delete'])[2]")
	private WebElement deleteRequest;
	
	
	
	public Request(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnRequestSlide()
	{
		requestSlide.click();
	}

	public void clickOnDeleteRequest()
	{
		deleteRequest.click();
	}
	
}
