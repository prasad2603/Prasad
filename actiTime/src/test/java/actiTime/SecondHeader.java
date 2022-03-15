package actiTime;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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

import base.Pojo;
import pom.ApplicationHeader;
import pom.LogInPage;
import pom.OpensTasks;
import pom.TimeTrack;
import pom.Users;
import utils.Utility;

public class SecondHeader extends Pojo {
	
	private WebDriver driver;
	private ApplicationHeader applicationHeader;
	private LogInPage logInPage;
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
		
        System.out.println("launchBrowser");
        
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
		logInPage=new LogInPage(driver);
		applicationHeader=new ApplicationHeader(driver);
	}
	
	@BeforeMethod
	public void loginApplication() throws EncryptedDocumentException, IOException
	{
		System.out.println("loginApplication");
		
	    driver.get("http://localhost/login.do");
	    String user=Utility.getDataFromExcel("actiTime", 1, 0);
	    String pass=Utility.getDataFromExcel("actiTime", 1, 1);
		logInPage.sendUserName(user);
		logInPage.sendPassword(pass);
		Assert.assertEquals(logInPage.clickOnKeepMeLogin(), false);
		logInPage.clickOnLogin();
	}
	
	@Test (priority=0)
	public void verifyUserTab()
	{
		testID="P1010";
        soft=new SoftAssert();
		System.out.println("verifyUserTab");
		applicationHeader.openUserPage();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"http://localhost/administration/userlist.do");
        soft.assertEquals(title,"actiTIME - User List");
        System.out.println("End");
        soft.assertAll();
	
	}
	@Test(priority=1)
	public void verifyReportButton()
	{
		testID="P1011";
		soft=new SoftAssert();
		System.out.println("verifyReportButton");
		
		applicationHeader.openReportPage();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"http://localhost/reports/reports.do", "url is not working");
		soft.assertEquals(title,"actiTIME - Saved Reports", "wrong title");
		soft.assertAll();
	}

	
	@Test(priority=2)
	public void verifyTaskButton()
	{
		testID="P1012";
		soft=new SoftAssert();
		System.out.println("Verify task button");
		applicationHeader.openTaskPage();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(url,"http://localhost/tasks/otasklist.do");
		soft.assertEquals(title,"actiTIME - Open Tasks");
		soft.assertAll();
		
	}

	@AfterMethod
	public void logOut(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus())
		Utility.screenshot(driver,testID);
		System.out.println("logOut");
		applicationHeader.clickOnLogout();
		
	}
	@AfterClass
	public void deleteObject()
	{
		logInPage=null;
		applicationHeader=null;
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("close Browser");
		driver.quit();
		driver=null;
		System.gc();
	
	}

}
