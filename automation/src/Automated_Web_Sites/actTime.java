package Automated_Web_Sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actTime {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		//log in page
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admin");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pwd']"));
		pass.sendKeys("manager");
		
		WebElement logIn=driver.findElement(By.xpath("//a[@id='loginButton']"));
		logIn.click();
		Thread.sleep(3000);
		
		System.out.println("------------------------------");

		//header 
		
//		WebElement timeTrack=driver.findElement(By.xpath("(//div[@class='label'])[1]"));
//		timeTrack.click();
//		Thread.sleep(3000);
//		
//		WebElement task=driver.findElement(By.xpath("(//div[@class='label'])[2]"));
//		task.click();
//		Thread.sleep(3000);
//		
//		
//		WebElement report=driver.findElement(By.xpath("(//div[@class='label'])[3]"));
//		report.click();
//		Thread.sleep(3000);
//		
//		WebElement userlist=driver.findElement(By.xpath("(//div[@class='label'])[4]"));
//		userlist.click();
//		Thread.sleep(3000);
//		
//		WebElement wrokSchedule=driver.findElement(By.xpath("(//div[@class='label'])[5]"));
//		wrokSchedule.click();
//		Thread.sleep(3000);
		
		
		System.out.println("------------------------------");
           //time track 
		WebElement add=driver.findElement(By.xpath("//img[@style='display:block']"));
		add.click();
		Thread.sleep(3000);
		WebElement new1=driver.findElement(By.xpath("(//em[@unselectable='on'])[1]"));
		new1.click();
		Thread.sleep(3000);
	    WebElement newuser=driver.findElement(By.xpath("(//a[@class='x-menu-item'])[2]"));
		newuser.click();
		Thread.sleep(3000);
		WebElement CustName=driver.findElement(By.xpath("//input[@id='createTasksPopup_newCustomer']"));
		CustName.sendKeys("Prasad1 Raut");
		Thread.sleep(3000);
		WebElement projName=driver.findElement(By.xpath("//input[@id='createTasksPopup_newProject']"));
		projName.sendKeys("Banking1");
		Thread.sleep(3000);
		WebElement Task1=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Task1.sendKeys("Testing1");
		Thread.sleep(3000);
		WebElement discr=driver.findElement(By.xpath("(//a[@id='descriptionElement'])[1]"));
		discr.click();
		Thread.sleep(3000);
		WebElement addDist=driver.findElement(By.xpath("//textarea[@name='comment']"));
		addDist.sendKeys("Test our application thourougly");
		Thread.sleep(3000);
		WebElement ok=driver.findElement(By.xpath("(//input[@type='button'])[10]"));
		ok.click();
		Thread.sleep(3000);
		WebElement create=driver.findElement(By.xpath("//div[@id='createTasksPopup_commitBtn']"));
		create.click();
		Thread.sleep(3000);
		
		System.out.println("------------------------------");
		
		//use list 
//		WebElement userlist=driver.findElement(By.xpath("(//div[@class='label'])[4]"));
//		userlist.click();
//		Thread.sleep(3000);
//
//		WebElement user=driver.findElement(By.xpath("//div[@class='roundedBoxTag graphicButton button']"));
//		user.click();
//		Thread.sleep(3000);
//		
//		WebElement first=driver.findElement(By.xpath("//input[@name='firstName']"));
//		first.sendKeys("Prasad");
//		Thread.sleep(3000);
//		WebElement last=driver.findElement(By.xpath("//input[@name='lastName']"));
//		last.sendKeys("Raut");
//		Thread.sleep(3000);
//		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
//		email.sendKeys("Prasad@gmail.com");
//		Thread.sleep(3000);
//		
//		WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
//		userName.sendKeys("prasadraut1");
//		Thread.sleep(3000);
//		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys("Testing1");
//		Thread.sleep(3000);
//		
//		WebElement repassword=driver.findElement(By.xpath("//input[@name='passwordCopy']"));
//		repassword.sendKeys("Testing1");
//		Thread.sleep(3000);
//		
////		WebElement release=driver.findElement(By.xpath("(//button[@class='x-btn-text'])[5]"));
////		release.click();
////		Thread.sleep(3000);
//		//date 
////		WebElement date=driver.findElement(By.xpath("(//span[text()='28'])[2]"));
////		date.click();
////		Thread.sleep(3000);
////		WebElement okk=driver.findElement(By.xpath("(//em[@unselectable='on'])[8]"));
////		okk.click();
//		Thread.sleep(3000);
//		WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
//		checkbox.click();
//		Thread.sleep(3000);
//		WebElement createuse=driver.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']"));
//		createuse.click();
//		Thread.sleep(3000);
		
		System.out.println("------------------------------------");
		//task
		
//		WebElement task=driver.findElement(By.xpath("(//div[@class='label'])[2]"));
//		task.click();
//		Thread.sleep(3000);//td[@class='middle-right-cell']
//		
//		WebElement selctProjAndCunstDrop=driver.findElement(By.xpath("//td[@class='middle-right-cell']"));
//		selctProjAndCunstDrop.click();
//		Thread.sleep(3000);
//		
//	    WebElement selctProjectAndCunstmoer=driver.findElement(By.xpath("(//label[@class='x-form-cb-label'])[2]"));
//		selctProjectAndCunstmoer.click();
//		Thread.sleep(3000);
//		
//	
//		 WebElement close=driver.findElement(By.xpath("//span[text()='Close']"));
//		 close.click();
//		Thread.sleep(3000);
		
		System.out.println("------------------------------------");
		//report
//		WebElement report=driver.findElement(By.xpath("(//div[@class='label'])[3]"));
//		report.click();
//		Thread.sleep(3000);
//		
//		WebElement createReport=driver.findElement(By.xpath("//span[@unselectable='on']"));
//		createReport.click();
//		Thread.sleep(3000);
//		
//		WebElement overTime=driver.findElement(By.xpath("//div[@class='report-type  TIME']"));
//		overTime.click();
//		Thread.sleep(3000);
//		
//		WebElement leaveTime=driver.findElement(By.xpath("(//div[@class='report-type unavailable TIME'])[1]"));
//		leaveTime.click();
//		Thread.sleep(3000);
//		
//		WebElement timeTrackInDetails=driver.findElement(By.xpath("(//div[@class='report-type unavailable TIME'])[2]"));
//		timeTrackInDetails.click();
//		Thread.sleep(3000);
//		
//		
//		WebElement billingSummery=driver.findElement(By.xpath("//div[@class='report-type  MONEY']"));
//		billingSummery.click();
//		Thread.sleep(3000);
//		
//		WebElement invoiceExport=driver.findElement(By.xpath("//span[text()='Invoice Export']"));
//		invoiceExport.click();
//		Thread.sleep(3000);
//		
//		WebElement costOfWork=driver.findElement(By.xpath("//span[text()='Cost of Work']"));
//		costOfWork.click();
//		Thread.sleep(3000);
//		
//		WebElement profit_loss=driver.findElement(By.xpath("//span[text()='Profit / Loss']"));
//		profit_loss.click();
//		Thread.sleep(3000);
//		
//		WebElement close=driver.findElement(By.xpath("(//img[@title='Close'])[2]"));
//		close.click();
//		Thread.sleep(3000);
		
		
		
	}

}
