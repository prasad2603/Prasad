package Tect;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

import base.Pojo;
import pom.Birthday;
import pom.HeadersOfFB;
import pom.LogInOrSignUp;
import pom.MarketPlace;
import pom.Request;
import utils.Utility;

public class RequestPage extends Pojo{
	
	private WebDriver driver;
	private LogInOrSignUp logInOrSignUp;
	private HeadersOfFB headersOfFB;
	private ChromeOptions option;
	private Request request;
	private Birthday birthday;
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
		logInOrSignUp=new LogInOrSignUp(driver);
		headersOfFB=new HeadersOfFB(driver);
		request=new Request(driver);
		headersOfFB=new HeadersOfFB(driver);
		birthday=new Birthday(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException
	{
		System.out.println("before method");
		driver.get("https://www.facebook.com/");
		String number=Utility.getDataFromExcel("facebook", 1, 0);
		logInOrSignUp.sendEmailAddressOrPhoneNumber(number);
		String pass=Utility.getDataFromExcel("facebook", 1, 1);
		logInOrSignUp.sendPassword(pass);
		logInOrSignUp.clickOnLogIn();
	}
	
	@Test
	public void deleteRequest()
	{
		testID="F00105";
		System.out.println("deleteRequest");
		headersOfFB.clickOnRequest();
		request.clickOnRequestSlide();
		request.clickOnDeleteRequest();
	}
	@Test
	public void birthday() 
	{
		testID="F00106";
		System.out.println("Birthday");
		headersOfFB.clickOnRequest();

		birthday.clickOnBirthday();
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
		logInOrSignUp=null;
		headersOfFB=null;
		request=null;
		headersOfFB=null;
		birthday=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver=null;
		System.gc();
	}


}
