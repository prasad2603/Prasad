package Test;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pom.Header;
import pom.AirIRCTC;
import pom.NextGenerationE_Ticketing;
import pom.TrainList;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in");
		
		NextGenerationE_Ticketing nextGenerationE_Ticketing=new NextGenerationE_Ticketing(driver);
		Thread.sleep(5000);
		nextGenerationE_Ticketing.clicOnOk();
		nextGenerationE_Ticketing.clickOnFrom();
		nextGenerationE_Ticketing.clickOnStartingPoint();
		nextGenerationE_Ticketing.clickOnTo();
		nextGenerationE_Ticketing.clickOnDestinationPoint();
		nextGenerationE_Ticketing.clickOnAllClasses();
		nextGenerationE_Ticketing.clickOnSelectClass_FC();
		nextGenerationE_Ticketing.clicOnGeneral();
		nextGenerationE_Ticketing.clicOnGeneralType_Ladies();
		nextGenerationE_Ticketing.clicOnSearch();
		
		TrainList trainList=new TrainList(driver);
		trainList.checkBoxFirstClass();
		Thread.sleep(5000);
		Header header=new Header(driver);
		header.clickOnAll();
		header.clickOnFlights();
		
		ArrayList<String> switchA=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchA.get(1));
		
		AirIRCTC airIRCTC=new AirIRCTC(driver);
		Thread.sleep(5000);
		airIRCTC.origin();
		Thread.sleep(5000);
		airIRCTC.destination();
		Thread.sleep(5000);
		airIRCTC.departure();
		airIRCTC.departureDate();
		airIRCTC.search();
		
	}

}
