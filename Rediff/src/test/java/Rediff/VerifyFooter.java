package Rediff;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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

import base.BaseClass;
import pom.ApplicationFooter;
import pom.ApplicationHeader;

public class VerifyFooter extends BaseClass {

	private WebDriver driver;
	private ApplicationFooter applicationFooter;
	private SoftAssert soft;
	
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
		applicationFooter=new ApplicationFooter(driver);
	}
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.rediff.com/");
	}
	@Test(priority=0)
	public void verifyAboutUsTab()
	{
		soft=new SoftAssert();
		System.out.println("verifyAboutUsTab");
		applicationFooter.clickOnAboutUs();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://www.rediff.com/aboutus.html");
		soft.assertEquals(title,"Rediff.com: About us","wrong title");
		soft.assertAll();
		
	}
	@Test(priority=1)
	public void verifyInvestorsTab()
	{
		soft=new SoftAssert();
		System.out.println("verifyInvestorsTab");
		applicationFooter.clickOnInvestors();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"http://investor.rediff.com/investor/");
		soft.assertEquals(title,"Home | Investor Information");
		soft.assertAll();
		
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void deleteObject()
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
