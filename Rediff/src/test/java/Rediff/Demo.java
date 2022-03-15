package Rediff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.CreateANewAccout;
import pom.Shopping;
import pom.Register;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
	
	
		ApplicationHeader headerApp=new ApplicationHeader(driver);
		headerApp.clickOnRediffmail();
		CreateANewAccout createANewAccout=new CreateANewAccout(driver);
		createANewAccout.clickOnCreateA_NewAccout();
		
		Register register=new Register(driver);
		register.sendFullName();
		register.sendRediffMailId();
		register.clickOnCheckAvailibility();
		register.sendPassword();
		register.sendRetypePassword();
		register.sendAlternateEmailId();
		register.clickOnCheckbox();
		register.sendMobileNumber();
		register.clickOnDay();
		register.clickOnMonth();
		register.clickOnYear();
		register.clickOnGenderFemale();
		register.clickOnCountry();
		register.clickOnCreate();
	}

}
