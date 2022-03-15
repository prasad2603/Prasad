package Tect;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LogInOrSignUp;
import utils.Utility;

public class Demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
  
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		LogInOrSignUp logInOrSignUp=new LogInOrSignUp(driver);
		String number=Utility.getDataFromExcel("facebook", 1, 0);
		logInOrSignUp.sendEmailAddressOrPhoneNumber(number);
		String pass=Utility.getDataFromExcel("facebook", 1, 1);
		logInOrSignUp.sendPassword(pass);
		logInOrSignUp.clickOnLogIn();
		
		logInOrSignUp.clickOnCreateNewAccount();
		logInOrSignUp.sendFirstName();
		logInOrSignUp.sendSurname();
		logInOrSignUp.sendMobileNumberOrEmailAddress();
		logInOrSignUp.sendNewPassword();
		logInOrSignUp.clickOnDay();
		logInOrSignUp.clickOnMonth();
		logInOrSignUp.clickOnYear();
		logInOrSignUp.clickOnMale();
		logInOrSignUp.clickOnSignUp();

	}

}
