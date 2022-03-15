package Test;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

import base.Pojo;
import pom.Header;
import pom.NextGenerationE_Ticketing;
import pom.TrainList;

public class TrainBooking extends Pojo{
	
	private WebDriver driver;
	private NextGenerationE_Ticketing nextGenerationE_Ticketing;
	private TrainList trainList;
	
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName)
	{
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
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
		nextGenerationE_Ticketing=new NextGenerationE_Ticketing(driver);
		trainList=new TrainList(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
		driver.get("https://www.irctc.co.in");
		nextGenerationE_Ticketing.clicOnOk();
	}
	
	@Test
	public void trainBooking() throws InterruptedException
	{
		System.out.println("trainBooking");
		Thread.sleep(5000);
		nextGenerationE_Ticketing.clickOnFrom();
		nextGenerationE_Ticketing.clickOnStartingPoint();
		nextGenerationE_Ticketing.clickOnTo();
		nextGenerationE_Ticketing.clickOnDestinationPoint();
		nextGenerationE_Ticketing.clickOnAllClasses();
		nextGenerationE_Ticketing.clickOnSelectClass_FC();
		nextGenerationE_Ticketing.clicOnGeneral();
		nextGenerationE_Ticketing.clicOnGeneralType_Ladies();
		nextGenerationE_Ticketing.clicOnSearch();
		
		trainList.checkBoxFirstClass();
		
	}
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass()
	{
		nextGenerationE_Ticketing=null;;
		trainList=null;
	}
	@AfterTest
	public  void closeBrowser()
	{
		driver.quit();
		driver=null;
		System.gc();
	}

}
