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

public class TaskCreation extends Pojo {
	
		private WebDriver driver;
		private ApplicationHeader applicationHeader;
		private LogInPage logInPage;
		private TimeTrack timeTrack;
		private OpensTasks opensTasks;
		private Users users;
		private String testID;
		
		
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
		
		@BeforeTest
//		@Parameters("browser")
		public void launchBrowser()
		{
			reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
			ExtentReports extend = new ExtentReports();
			extend.attachReporter(reporter);
			
            System.out.println("launchBrowser");
            
//			if(browserName.equals("Chrome"))
			{
				 driver= launchChromeBrowser();
			}
//			if(browserName.equals("Firefox"))
//			{
//				 driver= launchFirefoxBrowser();
//			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		@BeforeClass 
		public void object() 
		{
			logInPage=new LogInPage(driver);
			applicationHeader=new ApplicationHeader(driver);
			timeTrack=new TimeTrack(driver);
			opensTasks=new OpensTasks(driver);
			users=new Users(driver);
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
			logInPage.clickOnKeepMeLogin();
			logInPage.clickOnLogin();
		}
		
		
		@Test(priority=0)
		public void createTask_TimeTrack() throws InterruptedException, EncryptedDocumentException, IOException
		{
			testID="P105";
			System.out.println("createTask_TimeTrack");
			applicationHeader.openTimeTrackPage();
			Thread.sleep(5000);
			timeTrack.clickOnAddNew();
			Thread.sleep(5000);
			timeTrack.clickOnSelectDropdownOfCustomer();
			Thread.sleep(5000);
			timeTrack.clickOnNewCustomer();
			String cus=Utility.getDataFromExcel("actiTime", 6, 0);
			timeTrack.sendEnterCustomerName(cus);
			String pro=Utility.getDataFromExcel("actiTime", 6, 1);
			timeTrack.sendEnterProjectName(pro);
			String task=Utility.getDataFromExcel("actiTime", 6, 2);
			timeTrack.sendEnterTaskName(task);
			timeTrack.clickOnTaskDiscription();
			String des=Utility.getDataFromExcel("actiTime", 6, 3);
			timeTrack.sendEditTaskDiscriptin(des);
			timeTrack.clickOnOk();
			timeTrack.clickOnCreateTasks();
			Thread.sleep(5000);
		}
		@Test(priority=1)
		public void createTask_Task() throws InterruptedException, EncryptedDocumentException, IOException
		{
			testID="P105";
			Thread.sleep(5000);
			applicationHeader.openTaskPage();
			opensTasks.clickOnCreateTasks();
			opensTasks.clickOnNewCustomerDropdown();
			opensTasks.selectNewCustomer();
			String cus=Utility.getDataFromExcel("actiTime", 3, 0);
			opensTasks.sendEditCustomerName(cus);
			String pro=Utility.getDataFromExcel("actiTime", 3, 1);
			opensTasks.sendEditProjectrName(pro);
			String task1=Utility.getDataFromExcel("actiTime", 3, 2);
			opensTasks.sendEnterTasksName1(task1);
			opensTasks.clickOnDescription1();
			String dis1=Utility.getDataFromExcel("actiTime", 3, 3);
			opensTasks.enterDescription1(dis1);
			opensTasks.clickOnDescriptionOk();
			String task2=Utility.getDataFromExcel("actiTime", 4, 2);
			opensTasks.sendEnterTasksName2(task2);
			opensTasks.clickOnDescription2();
			String dis2=Utility.getDataFromExcel("actiTime", 4, 3);
			opensTasks.enterDescription2(dis2);
			opensTasks.clickOnDescriptionOk();
			opensTasks.clickOnCreateTasksEnd();
			Thread.sleep(5000);
		}
		@Test(priority=2)
		public void createTask_User() throws InterruptedException, EncryptedDocumentException, IOException
		{
			testID="P107";
			System.out.println("createTask_User");
			Thread.sleep(5000);
			applicationHeader.openUserPage();
//			Assert.assertEquals(users.checkTextUser(),"User");
//			SoftAssert soft=new SoftAssert();
//			soft.assertEquals(users.checkTextUser(),"User");
//			System.out.println("end");
//			soft.assertAll();
			users.clickOnUser();
			String fName=Utility.getDataFromExcel("actiTime", 9, 0);
			users.sendFirsttName(fName);
			String lName=Utility.getDataFromExcel("actiTime", 9, 1);
			users.sendLastName(lName);
			String eMail=Utility.getDataFromExcel("actiTime", 9, 2);
			users.sendEmailAdress(eMail);
			String userName=Utility.getDataFromExcel("actiTime", 9, 3);
			users.sendUsername(userName);
			String pass=Utility.getDataFromExcel("actiTime", 9, 4);
			users.sendPassword(pass);
			String repass=Utility.getDataFromExcel("actiTime", 9, 5);
			users.sendRetypePassword(repass);
			users.clickOnGenerateTimeReportsCheckBox();
			users.clickOnCreateUser();
			Thread.sleep(5000);
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
			timeTrack=null;
			opensTasks=null;
			users=null;
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
