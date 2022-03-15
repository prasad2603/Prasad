package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpensTasks {

	
	@FindBy(xpath="//div[@class='i']")
    private WebElement createTasks;
	
	@FindBy(xpath="(//button[@class='x-btn-text'])[1]")
    private WebElement newCustomerDropdown;
	
	@FindBy(xpath="(//a[@class='x-menu-item'])[2]")
    private WebElement newCustomer;
	
	@FindBy(xpath="//input[@id='createTasksPopup_newCustomer']")
    private WebElement editCustomerName;
	
	@FindBy(xpath="//input[@id='createTasksPopup_newProject']")
    private WebElement editProjectrName;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
    private WebElement enterTasksName1;
	
	@FindBy(xpath="(//a[@title='Click to enter task description'])[1]")
    private WebElement clickDescription1;
	
	@FindBy(xpath="//textarea[@name='comment']")
    private WebElement enterDescription;
	
	@FindBy(xpath="//input[@value='OK']")
    private WebElement descriptionOk;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement enterTasksName2;
	
	@FindBy(xpath="(//a[@id='descriptionElement'])[2]")
    private WebElement clickOnDescription2;
	
	@FindBy(xpath="//div[@id='createTasksPopup_commitBtn']")
    private WebElement createTasksEnd;
	
	@FindBy (xpath="//span[@class=' hierarchySelectorButton']")
	private WebElement selectCustmerAndProjectDropdown;
	
	@FindBy (xpath="(//label[@class='x-form-cb-label'])[2]")
	private WebElement selectCustomerAndProject;
	
	@FindBy (xpath="//span[text()='Close']")
	private WebElement colse;
	
	public OpensTasks(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnCreateTasks()
	{
		createTasks.click();
	}
	public void clickOnNewCustomerDropdown()
	{
		newCustomerDropdown.click();
	}
	public void selectNewCustomer()
	{
		newCustomer.click();
	}
	public void sendEditCustomerName(String cust)
	{
		editCustomerName.sendKeys(cust);
	}
	public void sendEditProjectrName(String companyName)
	{
		editProjectrName.sendKeys(companyName);
	}
	public void sendEnterTasksName1(String designation)
	{
		enterTasksName1.sendKeys(designation);
	}
	public void clickOnDescription1()
	{
		clickDescription1.click();
	}
	public void enterDescription1(String Discription)
	{
		enterDescription.sendKeys(Discription);
	}
	
	public void clickOnDescriptionOk()
	{
		descriptionOk.click();
	}
	public void sendEnterTasksName2(String testing)
	{
		enterTasksName2.sendKeys(testing);
	}
	public void clickOnDescription2()
	{
		clickOnDescription2.click();
	}
	public void enterDescription2(String Discription)
	{
		enterDescription.sendKeys(Discription);
	}
	
	public void clickOnCreateTasksEnd()
	{
		createTasksEnd.click();
	}

	public void clickOnSelectCustmerAndProjectDropdown()
	{
		selectCustmerAndProjectDropdown.click();
	}
	public void clickOnSelectCustomerAndProjectRadioButton()
	{
		selectCustomerAndProject.click();
	}
	
	public void clickOnClose()
	{
		colse.click();
	}

	
}
