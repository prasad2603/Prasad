package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register {
	
	@FindBy (xpath="(//input[@type='text'])[1]")
	private WebElement fullName;
	
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement rediffMailId;
	
	@FindBy (xpath="//input[@value='Check availability']")
	private WebElement checkAvailibility;
	
	@FindBy (xpath="(//input[@maxlength='14'])[1]")
	private WebElement password;

	@FindBy (xpath="(//input[@maxlength='14'])[2]")
	private WebElement retypePassword;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement alternateEmailId;
	
	@FindBy (xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy (xpath="//select[@style='width:285px;']")
	private WebElement listDropDown;
	
	@FindBy (xpath="(//input[@maxlength='30'])[2]")
	private WebElement enterAnAnswer;
	
	@FindBy (xpath="(//input[@maxlength='30'])[3]")
	private WebElement mothersMaidenName;
	
	@FindBy (xpath="(//input[@type='text'])[6]")
	private WebElement mobileNumber;
	
	@FindBy (xpath="(//select[@onchange='fieldTrack(this);'])[2]")
	private WebElement day;
	
	@FindBy (xpath="(//select[@onchange='fieldTrack(this);'])[3]")
	private WebElement month;
	
	@FindBy (xpath="(//select[@onchange='fieldTrack(this);'])[4]")
	private WebElement year;
	
	@FindBy (xpath="(//input[@type='radio'])[2]")
	private WebElement genderFemale;
	
	@FindBy (xpath="//select[@id='country']")
	private WebElement country;
	
	@FindBy (xpath="//input[@id='Register']")
	private WebElement create;

	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendFullName()
	{
		fullName.sendKeys("Prasad");
	}
	public void sendRediffMailId()
	{
		rediffMailId.sendKeys("Prasad@gmail.com");
	}
	public void clickOnCheckAvailibility()
	{
		checkAvailibility.click();
	}
	public void sendPassword()
	{
		password.sendKeys("Prasad");
	}
	public void sendRetypePassword()
	{
		retypePassword.sendKeys("Prasad");
	}
	public void sendAlternateEmailId()
	{
		alternateEmailId.sendKeys("Prasad07@gmail.com");
	}
	public void clickOnCheckbox(){
		
	if(checkbox.isSelected())
	{
		checkbox.click();
	}
	else
	{
		System.out.println("Check box already selected");
	}
	}
	public void clickListDropDown()
	{
		listDropDown.click();
	}
	public void sendEnterAnAnswer()
	{
		enterAnAnswer.sendKeys("PrasadRaut");
	}
	public void sendMothersMaidenName()
	{
		mothersMaidenName.sendKeys("Mangala");
	}
	public void sendMobileNumber()
	{
		mobileNumber.sendKeys("8830443645");
	}
	public void clickOnDay()
	{
		Select select=new Select(day);
		select.selectByIndex(27);
	}
	public void clickOnMonth()
	{
		Select select=new Select(month);
		select.selectByValue("03");
	}
	public void clickOnYear()
	{
		Select select=new Select(year);
		select.selectByVisibleText("1998");
	}
	public void clickOnGenderFemale()
	{
		genderFemale.click();
	}
	public void clickOnCountry()
	{
		country.click();
	}
	public void clickOnCreate()
	{
		create.click();
	}
	
}
