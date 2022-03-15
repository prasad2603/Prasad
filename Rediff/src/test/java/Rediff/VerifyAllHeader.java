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
import pom.ApplicationHeader;
import pom.KidsLaptop;
import pom.Laptop;
import pom.Shopping;

public class VerifyAllHeader extends BaseClass {
	
	private WebDriver driver;
	private ApplicationHeader applicationHeader;
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
		applicationHeader=new ApplicationHeader(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.get("https://www.rediff.com/");
	}
	
	@Test(priority=0)
	public void verifyRediffmailTab()
	{
		soft=new SoftAssert();
		System.out.println("verifyRediffmailTab");
		applicationHeader.clickOnRediffmail();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		

		Assert.assertEquals(url,"https://mail.rediff.com/cgi-bin/login.cgi");
		soft.assertEquals(title,"Rediffmail","wrong title");
		soft.assertAll();
		
	}
	@Test(priority=1)
	public void verifyShoppingTab()
	{
		soft=new SoftAssert();
		System.out.println("verifyShoppingTab");
		applicationHeader.clickOnShopping();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://shopping.rediff.com/?sc_cid=inhome_icon");
		soft.assertEquals(title,"Online Shopping Site India: Shop Online At Best Store | Buy Mobiles, T-Shirts, Power Banks - Rediff Shopping","wrong title");
		soft.assertAll();
	
	}
	@Test(priority=2)
	public void verifyVideosTab()
	{
		soft=new SoftAssert();
		System.out.println("verifyVideosTab");
		applicationHeader.clickOnVideos();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"https://ishare.rediff.com/");
		soft.assertEquals(title,"Rediff Videos Home: Videos, Video clips, Featured videos, Music, Photos");
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
		applicationHeader=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver=null;
		System.gc();
	}

}
