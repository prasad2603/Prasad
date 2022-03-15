package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {
	
	@FindBy (xpath="//span[@unselectable='on']")
	private WebElement createReport;
	
	@FindBy (xpath="//div[@class='report-type  TIME']")
	private WebElement overTime;
	
	@FindBy (xpath="(//div[@class='report-type unavailable TIME'])[1]")
	private WebElement leaveTime;
	
	@FindBy (xpath="(//div[@class='report-type unavailable TIME'])[2]")
	private WebElement timeTrackReport;
	
	@FindBy (xpath="//div[@class='report-type  MONEY']")
	private WebElement billingSummery;
	
	@FindBy (xpath="//span[text()='Invoice Export']")
	private WebElement invoiceExport;
	
	@FindBy (xpath="//span[text()='Cost of Work']")
	private WebElement costOfWork;
	
	@FindBy (xpath="//span[text()='Profit / Loss']")
	private WebElement profit_Loss;
	
	@FindBy (xpath="(//img[@title='Close'])[2]")
	private WebElement close;

	public Reports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCreateReport()
	{
		createReport.click();
	}
	
	public void clickOnOverTime()
	{
		overTime.click();
	}
	
	public void clickOnLeaveTime()
	{
		leaveTime.click();
	}
	
	public void clickOnTimeTrackReport()
	{
		timeTrackReport.click();
	}
	
	public void clickOnBillingSummery()
	{
		billingSummery.click();
	}
	
	public void clickOnInvoiceExport()
	{
		invoiceExport.click();
	}
	
	public void clickOnCostOfWork()
	{
		costOfWork.click();
	}
	
	public void clickOnProfit_Loss()
	{
		profit_Loss.click();
	}
	
	public void clickOnClose()
	{
		close.click();
	}
	
	
}
