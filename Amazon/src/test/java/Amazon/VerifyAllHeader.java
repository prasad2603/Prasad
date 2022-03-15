package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationHeader;
import pom.Customer;
import utils.Utility;

public class VerifyAllHeader extends Browser{
	private WebDriver driver;
	private ApplicationHeader header;
	private SoftAssert soft;
	private String testID;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
    	
	@BeforeTest()
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
	public void objects() 
	{
		header=new ApplicationHeader(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test (priority=0)
	public void verifyCustomerTab()
	{
		testID="A00107";
		soft=new SoftAssert();
		System.out.println("verifyCustomerTab");
		header.clickOnCustomerService();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
		soft.assertEquals(title,"Help - Amazon Customer Service","wrong title");
		soft.assertAll();

	}
	@Test (priority=1)
	public void verifyBestSellerTab()
	{
		testID="A00108";
		soft=new SoftAssert();
		System.out.println("verifyBestSellerTab");
		header.clickOnBestSellers();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");
		soft.assertEquals(title,"Amazon.in Bestsellers: The most popular items on Amazon");
		soft.assertAll();
	}
	@Test (priority=2)
	public void verifyMobileTab()
	{
		testID="A00109";
		soft=new SoftAssert();
		System.out.println("verifyMobileTab");
		header.clickOnMobiles();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		soft.assertEquals(title,"Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in");
		soft.assertAll();
		
	}
	@Test (priority=3)
	public void verifyElectronicTab()
	{
		testID="A001010";
		soft=new SoftAssert();
		System.out.println("verifyElectronicTab");
		header.clickOnElectronics();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://www.amazon.in/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics");
		soft.assertEquals(title,"Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in");
		soft.assertAll();
		
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
