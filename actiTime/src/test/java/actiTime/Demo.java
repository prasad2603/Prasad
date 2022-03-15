package actiTime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.LogInPage;
import pom.OpensTasks;
import pom.TimeTrack;
import pom.Users;
import utils.Utility;
public class Demo {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://localhost/login.do");
		
		
		LogInPage logInPage=new LogInPage(driver);
		  String user=Utility.getDataFromExcel("actiTime", 1, 0);
		  String pass=Utility.getDataFromExcel("actiTime", 1, 1);
			logInPage.sendUserName(user);
			logInPage.sendPassword(pass);
		logInPage.clickOnKeepMeLogin();
		logInPage.clickOnLogin();
		
		ApplicationHeader applicationHeader=new ApplicationHeader(driver);
		applicationHeader.openUserPage();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(title);
		
		if(url.equals("http://localhost/administration/userlist.do"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		if(title.equals("actiTIME - User List"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(5000);
		Users users=new Users(driver);
		users.clickOnUser();
		String fName=Utility.getDataFromExcel("actiTime", 9, 0);
		users.sendFirsttName(fName);
		String lName=Utility.getDataFromExcel("actiTime", 9, 1);
		users.sendLastName(lName);
		String eMail=Utility.getDataFromExcel("actiTime", 9, 2);
		users.sendEmailAdress(eMail);
		String userName=Utility.getDataFromExcel("actiTime", 9, 3);
		users.sendUsername(userName);
		String pass1=Utility.getDataFromExcel("actiTime", 9, 4);
		users.sendPassword(pass1);
		String repass=Utility.getDataFromExcel("actiTime", 9, 5);
		users.sendRetypePassword(repass);
		users.clickOnGenerateTimeReportsCheckBox();
		users.clickOnCreateUser();
		
	
		applicationHeader.openTimeTrackPage();
		String url1=driver.getCurrentUrl();
		String title1=driver.getTitle();
		if(url1.equals("http://localhost/user/submit_tt.do"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		if(title1.equals("actiTIME -  Enter Time-Track"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		

		
		TimeTrack timeTrack=new TimeTrack(driver);
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
		String des=Utility.getDataFromExcel("actiTime", 6, 3);
		timeTrack.sendEditTaskDiscriptin(des);
		timeTrack.clickOnOk();
		timeTrack.clickOnCreateTasks();
		

		Thread.sleep(5000);
		applicationHeader.openTaskPage();
		OpensTasks opensTasks=new OpensTasks(driver);
		opensTasks.clickOnCreateTasks();
		opensTasks.clickOnNewCustomerDropdown();
		opensTasks.selectNewCustomer();
		String cus1=Utility.getDataFromExcel("actiTime", 3, 0);
		opensTasks.sendEditCustomerName(cus1);
		String pro1=Utility.getDataFromExcel("actiTime", 3, 1);
		opensTasks.sendEditProjectrName(pro1);
		String task1=Utility.getDataFromExcel("actiTime", 3, 2);
		opensTasks.sendEnterTasksName1(task1);
		opensTasks.clickOnDescription1();
		String dis1=Utility.getDataFromExcel("actiTime", 3, 3);
		opensTasks.enterDescription1(dis1);
		opensTasks.clickOnDescriptionOk();
		String task2=Utility.getDataFromExcel("actiTime", 4, 2);
		opensTasks.sendEnterTasksName2(task2);
		String dis2=Utility.getDataFromExcel("actiTime", 4, 3);
		opensTasks.clickOnDescription2();
		opensTasks.clickOnDescriptionOk();
		opensTasks.clickOnCreateTasksEnd();
	

		
	
	}
}
