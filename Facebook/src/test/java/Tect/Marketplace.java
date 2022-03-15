package Tect;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Pojo;
import pom.HeadersOfFB;
import pom.LogInOrSignUp;
import pom.MarketPlace;
import utils.Utility;

public class Marketplace extends Pojo {
	private WebDriver driver;
	private LogInOrSignUp logInOrSignUp;
	private HeadersOfFB headersOfFB;
	private MarketPlace marketplace;
	private String testID;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName )
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
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
	public void object() 
	{
		headersOfFB=new HeadersOfFB(driver);
		logInOrSignUp=new LogInOrSignUp(driver);
		marketplace=new MarketPlace(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException
	{
		System.out.println("before method");
		driver.get("https://www.facebook.com/");
		logInOrSignUp.numberOfLinks();
		Assert.assertEquals(logInOrSignUp.verifyIsEnabledLogIn(), true);
		String number=Utility.getDataFromExcel("facebook", 1, 0);
		logInOrSignUp.sendEmailAddressOrPhoneNumber(number);
		String pass=Utility.getDataFromExcel("facebook", 1, 1);
		logInOrSignUp.sendPassword(pass);
		Assert.assertEquals(logInOrSignUp.verifyTextFacebook(),"");
		Assert.assertEquals(logInOrSignUp.verifyMainLineText(),"Facebook helps you connect and share with the people in your life.");
		logInOrSignUp.clickOnLogIn();
	}
	@Test
	public void marketplace()
	{
		testID="F00107";
		System.out.println("marketplace");
		headersOfFB.clickOnMarketplace();
		marketplace.clickOncarSelect();
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		Utility.screenshot(driver, testID);
		System.out.println("after method");
		headersOfFB.clickOnAccount();
		headersOfFB.clickOnLogout();
	}
	
	@AfterClass
	public void afterClass()
	{
		headersOfFB=null;
		logInOrSignUp=null;
		marketplace=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver=null;
		System.gc();
	}

}
