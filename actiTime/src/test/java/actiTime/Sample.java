package actiTime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
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

import base.Pojo;
import pom.ApplicationHeader;
import pom.LogInPage;
import utils.Utility;

public class Sample extends Pojo {
	
	private WebDriver driver;
	private LogInPage logInPage;
	private String testID;
	private ApplicationHeader applicationHeader;
	
	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String browserName)
	{
		//browser Launching code
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
		//all object stored 
		System.out.println("before class");
		logInPage=new LogInPage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException
	{
		//url lauched and logIn code
		System.out.println("before method");
		String user=Utility.getDataFromExcel("actiTime", 1, 0);
		logInPage.sendUserName(user);
		Assert.assertEquals(logInPage.clickOnKeepMeLogin(), false);
	}
	
	@Test
	public void test()
	{
		//user story code
		System.out.println("test");
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException 
	{
		//screenshot code 
		if(ITestResult.FAILURE==result.getStatus())
		Utility.screenshot(driver,testID);
		//logout code
		applicationHeader.clickOnLogout();
		
	}
	
	@AfterClass
	public void afterClass()
	{
		//delete all object
		System.out.println("after class");
		logInPage=null;
	}
	@AfterTest
	public void afterTest()
	{
		//close browser and null all
		System.out.println("close Browser");
		driver.quit();
		driver=null;
		System.gc();
	}

}
