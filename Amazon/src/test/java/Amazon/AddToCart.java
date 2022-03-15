package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import pom.Amazon_In;
import pom.ApplicationHeader;
import pom.FirstMobileNokiaG10;
import pom.MobileUnder12000;
import utils.Utility;

public class AddToCart extends Browser{
	private WebDriver driver;
	private Amazon_In amazon_In;
	private MobileUnder12000 mobileUnder12000;
	private ArrayList<String> switchto;
	private FirstMobileNokiaG10 firstMobileNokiaG10;
	private ApplicationHeader header;
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
		amazon_In=new Amazon_In(driver);
		mobileUnder12000=new MobileUnder12000(driver);
		firstMobileNokiaG10=new FirstMobileNokiaG10(driver);
		header=new ApplicationHeader(driver);

	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=0)
	public void addToCart() throws InterruptedException, EncryptedDocumentException, IOException
	{
		testID="A00101";
		System.out.println("a_VeifyAddToCart");
		String price=Utility.getDataFromExcel("amazon", 1, 0);
		amazon_In.sendSearchBox(price);
		amazon_In.clickOnsearchButtonClick();
		
		mobileUnder12000.clickOnFirstMobileNokiaG10();
		switchto=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchto.get(1));
//		Thread.sleep(5000);
//		firstMobileNokiaG10.clickOnaddToCart();
		
	}
	@Test(priority=1)
	public void  veifyAddToCart() throws InterruptedException
	{
		testID="A00102";
		header.clickOnCart();
		
		Thread.sleep(5000);
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		Utility.screenshot(driver, testID);
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		amazon_In=null;
		mobileUnder12000=null;
		switchto=null;
		firstMobileNokiaG10=null;
		header=null;
	}
	@AfterTest
	public void closeBrowser()
	{

		driver.quit();
		driver=null;
		System.gc();
	}

}
