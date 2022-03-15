package swagLab;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.Complete;
import pom.HeaderSwag;
import pom.LogInPage;
import pom.Overview;
import pom.Product;
import pom.YourCart;
import pom.YourInformation;
import utils.Utility;

public class AddToCart extends Browser {
	
	private WebDriver driver;
	private LogInPage logInPage;
	private Product product;
	private HeaderSwag header;
	private YourCart yourCArt;
	private YourInformation yourInformation;
	private Overview overview;
	private Complete complete;
	private String testID;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName)
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browserName.equals("Chrome"))
		{
			 driver= launchChromeBrowser();
		}
		if(browserName.equals("Firefox"))
		{
			 driver= launchFirefoxBrowser();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeClass 
	public void beforeClass() 
	{
		logInPage=new LogInPage(driver);
		product=new Product(driver);
		header=new HeaderSwag(driver);
		complete=new Complete(driver);
		overview=new Overview(driver);
		yourInformation=new YourInformation(driver);
		yourCArt=new YourCart(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException
	{
		System.out.println("before method");
		driver.get("https://www.saucedemo.com/");
		String user=Utility.getDataFromExcel("swaglab", 1, 0);
		logInPage.sendUserName(user);
		String pass=Utility.getDataFromExcel("swaglab", 1, 1);
		logInPage.sendPassword(pass);
		logInPage.clickOnLogin();
	}
	
	@Test
	public void addToCartA_Z() throws EncryptedDocumentException, IOException
	{
		testID="S00101";
		System.out.println("addToCartA_Z");
		product.clickOnNameZ_A();
		product.clickOnAddToCart();
		header.clickOnToCart();

		yourCArt.clickOnCheckout();
		String fName=Utility.getDataFromExcel("swaglab",2, 0);
		yourInformation.sendFirstName(fName);
		String lName=Utility.getDataFromExcel("swaglab",2, 1);
		yourInformation.sendLastName(lName);
		String pin=Utility.getDataFromExcel("swaglab",2, 2);
		yourInformation.sendPostalCode(pin);
		yourInformation.clickOnContinues();

		overview.clickOnFinish();
		
		complete.clickOnBackToHomePage();
	}
	@Test
	public void addToCartZ_A() throws EncryptedDocumentException, IOException
	{
		testID="S00102";
		System.out.println("addToCartZ_A");
		product.clickOnNameZ_A();
		product.clickOnAddToCart();
		
		header.clickOnToCart();
		
		yourCArt.clickOnCheckout();
		String fName=Utility.getDataFromExcel("swaglab",2, 0);
		yourInformation.sendFirstName(fName);
		String lName=Utility.getDataFromExcel("swaglab",2, 1);
		yourInformation.sendLastName(lName);
		String pin=Utility.getDataFromExcel("swaglab",2, 2);
		yourInformation.sendPostalCode(pin);
		yourInformation.clickOnContinues();
		overview.clickOnFinish();
		complete.clickOnBackToHomePage();
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		Utility.screenshot(driver, testID);
		System.out.println("after method");
		header.clickOnAll();
		header.clickOnlogout();
	}
	
	@AfterClass
	public void afterClass()
	{
		logInPage=null;
		product=null;
		header=null;
		complete=null;
		overview=null;
		yourInformation=null;
		yourCArt=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver=null;
		System.gc();
	}

}
