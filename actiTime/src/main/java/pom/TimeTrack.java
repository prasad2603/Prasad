package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrack {

	@FindBy (xpath="//img[@style='display:block']")
	private WebElement addNew;
	
	@FindBy (xpath="(//em[@unselectable='on'])[1]")
	private WebElement selectDropdownOfCustomer ;
	
	@FindBy (xpath="(//a[@class='x-menu-item'])[2]")
	private WebElement newCustomer ;
	
	@FindBy (xpath="//input[@id='createTasksPopup_newCustomer']")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//input[@id='createTasksPopup_newProject']")
	private WebElement enterProjectName;
	
	@FindBy (xpath="(//input[@type='text'])[1]")
	private WebElement enterTaskName;
	
	@FindBy (xpath="(//a[@id='descriptionElement'])[1]")
	private WebElement clickToTaskDiscription;
	
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement editTaskDiscriptin;
	
	@FindBy(xpath="(//input[@type='button'])[10]")
	private WebElement ok;
	
	@FindBy(xpath="//div[@id='createTasksPopup_commitBtn']")
	private WebElement createTasks;
	
	public TimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnAddNew()
	{
		addNew.click();
	}
	public void clickOnSelectDropdownOfCustomer()
	{
		selectDropdownOfCustomer.click();
	}
	public void clickOnNewCustomer()
	{
		newCustomer.click();
	}
	public void sendEnterCustomerName(String cus)
	{
		enterCustomerName.sendKeys(cus);
	}
	public void sendEnterProjectName(String pro)
	{
		enterProjectName.sendKeys(pro);
	}
	public void sendEnterTaskName(String task)
	{
		enterTaskName.sendKeys(task);
	}
	public void clickOnTaskDiscription()
	{
		clickToTaskDiscription.click();
	}
	public void sendEditTaskDiscriptin(String des)
	{
		editTaskDiscriptin.sendKeys(des);
	}
	public void clickOnOk()
	{
		ok.click();
	}
	public void clickOnCreateTasks()
	{
		createTasks.click();
	}
}
