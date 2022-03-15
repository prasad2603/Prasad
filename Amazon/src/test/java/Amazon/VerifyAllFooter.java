package Amazon;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
import pom.ApplicationFooter;
import pom.ApplicationHeader;
import pom.Customer;
import utils.Utility;

public class VerifyAllFooter extends Browser{
	private WebDriver driver;
	private ApplicationFooter footer;
	private SoftAssert soft;
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
	public void objects() 
	{
		footer=new ApplicationFooter(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority=0)
	public void verifyFacebookTab()
	{
		testID="A00105";
		soft=new SoftAssert();
		System.out.println("verifyFacebookTab");
		footer.clickOnFacebook();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://www.facebook.com/AmazonIN","wrong url");
		soft.assertEquals(title,"Amazon India - Home","wrong title");
		soft.assertAll();
		
	}

//	@Test(priority=1)
//	public void verifyTwitterTab()
//	{
//	     testID="A00106";
//		soft=new SoftAssert();
//		System.out.println("verifyTwitterTab");
//		footer.clickOnTwitter();
//		String url=driver.getCurrentUrl();
//		String title=driver.getTitle();
//		System.out.println(title);
//		
//		Assert.assertEquals(url,"https://twitter.com/AmazonIN","wrong url");
//		soft.assertEquals(title,"Amazon India (@amazonIN) / Twitter","wrong title");
//		soft.assertAll();
//		
//	}
	@Test(priority=2)
	public void verifyCareersTab()
	{
		testID="A00104";
		soft=new SoftAssert();
		System.out.println("verifyCareersTab");
		footer.clickOnCareers();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://amazon.jobs/en/","wrong url");
		soft.assertEquals(title,"Amazon.jobs: Help us build Earth’s most customer-centric company.","wrong title");
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
		footer=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("after class");
		driver.quit();
		driver=null;
		System.gc();
	}

}
