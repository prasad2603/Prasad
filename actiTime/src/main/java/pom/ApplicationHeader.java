package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeader {
	
	private WebDriver driver;
	
	@FindBy (xpath="(//div[@class='label'])[1]")
	private WebElement timeTrack;
	
	@FindBy (xpath="(//div[@class='label'])[2]")
	private WebElement task;
	
	@FindBy (xpath="(//div[@class='label'])[3]")
	private WebElement reports;
	
	@FindBy (xpath="(//div[@class='label'])[4]")
	private WebElement users;
	
	@FindBy (xpath="(//div[@class='label'])[5]")
	private WebElement workSchedule;
	
	@FindBy (xpath="//a[@id='logoutLink']")
	private WebElement logout;
	
	
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void openTimeTrackPage()
	{
		timeTrack.click();
	}
	
	public void openTaskPage()
	{
		task.click();
	}
	
	public void openReportPage()
	{
		reports.click();
	}
	
	public void openUserPage()
	{
		users.click();
	}
	
	public void openWorkSchedulePage()
	{
	
		workSchedule.click();
	}
	public void clickOnLogout()
	{
		logout.click();
	}

}
