package Rediff;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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

import base.BaseClass;
import pom.ApplicationHeader;
import pom.KidsLaptop;
import pom.Laptop;
import pom.Shopping;

public class BuyA_Product extends BaseClass{
	
	private WebDriver driver;
	private ApplicationHeader appHeader;
	private Shopping shoping;
	private Laptop laptop;
	private KidsLaptop kidLaptop;
	
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
		appHeader=new ApplicationHeader(driver);
		shoping=new Shopping(driver);
		laptop=new Laptop(driver);
		kidLaptop=new KidsLaptop(driver);
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		System.out.println("test");
		appHeader.clickOnShopping();
		
		shoping.clickOnSearch();
		shoping.clickOnSearchButton();
		
		Thread.sleep(5000);
		laptop.clickOnLaptop();
		
		kidLaptop.clickOnBuy();
		Thread.sleep(5000);
//		kidLaptop.clickOnPlacedOrder();
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void deleteObject()
	{
		appHeader=null;
		shoping=null;
		laptop=null;
		kidLaptop=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver=null;
		System.gc();
	}
	

}
