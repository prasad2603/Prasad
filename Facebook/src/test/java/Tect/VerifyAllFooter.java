package Tect;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

import base.Pojo;
import pom.ApplicationFooter;
import pom.HeadersOfFB;
import pom.LogInOrSignUp;
import utils.Utility;

public class VerifyAllFooter extends Pojo {
	private WebDriver driver;
	private LogInOrSignUp logInOrSignUp;
	private ApplicationFooter applicationFooter;
	private SoftAssert soft;
	private String testID;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launcghBrowser(String browserName)
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
		applicationFooter=new ApplicationFooter(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=0)
	public void verifyCreerTab()
	{
		testID="F00103";
		soft=new SoftAssert();
		System.out.println("verifyCreerTab");
		applicationFooter.clickOnCareers();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://www.metacareers.com/");
		soft.assertEquals(title,"Meta Careers | Do the Most Meaningful Work of Your Career | Facebook careers");
		soft.assertAll();
	}
	@Test(priority=1)
	public void verifyAboutTab()
	{
		testID="F00104";
		soft=new SoftAssert();
		System.out.println("verifyAboutTab");
		applicationFooter.clickOnAbout();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://about.facebook.com/");
		soft.assertEquals(title,"Company Info and News | Meta");
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
		applicationFooter=null;
	}
	@AfterTest
	public void closeBrowser()
	{
	   driver.quit();
	   driver=null;
	   System.gc();
	}


}
