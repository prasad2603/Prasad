package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Product {
	
	@FindBy (xpath="//select[@class='product_sort_container']")
	private WebElement filter ;
	
	@FindBy (xpath="(//div[@id='root']//button)[3]")
	private WebElement addToCart ;
	
	public Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnNameZ_A()
	{
		Select select=new Select(filter);
		select.selectByValue("za");
	}

	public void clickOnNameA_Z()
	{
		Select select=new Select(filter);
		select.selectByValue("az");
	}

	public void clickOnNameHi_Lo()
	{
		Select select=new Select(filter);
		select.selectByValue("hilo");
	}

	public void clickOnNameLo_Hi()
	{
		Select select=new Select(filter);
		select.selectByValue("lohi");
	}

	public void clickOnAddToCart()
	{
		addToCart.click();
	}

}
