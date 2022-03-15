package swagLab;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pom.Complete;
import pom.HeaderSwag;
import pom.LogInPage;
import pom.Overview;
import pom.Product;
import pom.YourCart;
import pom.YourInformation;
import utils.Utility;

public class Demo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.saucedemo.com/");

	
	LogInPage logInPage=new LogInPage(driver);
	String user=Utility.getDataFromExcel("swaglab", 1, 0);
	logInPage.sendUserName(user);
	String pass=Utility.getDataFromExcel("swaglab", 1, 1);
	logInPage.sendPassword(pass);
	logInPage.clickOnLogin();
	
	Product product=new Product(driver);
	product.clickOnNameZ_A();
	product.clickOnAddToCart();
	HeaderSwag HeaderSwag=new HeaderSwag(driver);
	HeaderSwag.clickOnToCart();
	
	YourCart yourCart=new YourCart(driver);
	yourCart.clickOnCheckout();
	
	YourInformation yourInformation=new YourInformation(driver);
	String fName=Utility.getDataFromExcel("swaglab",2, 0);
	yourInformation.sendFirstName(fName);
	String lName=Utility.getDataFromExcel("swaglab",2, 1);
	yourInformation.sendLastName(lName);
	String pin=Utility.getDataFromExcel("swaglab",2, 2);
	yourInformation.sendPostalCode(pin);
	yourInformation.clickOnContinues();
	
	Overview overview=new Overview(driver);
	overview.clickOnFinish();
	
	Complete complete=new Complete(driver);
	complete.clickOnBackToHomePage();
	
 }
}