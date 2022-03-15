package Amazon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Amazon_In;
import pom.FirstMobileNokiaG10;
import pom.MobileUnder12000;
import utils.Utility;

public class Demo {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
	
		
		Amazon_In amazon_In=new Amazon_In(driver);
		String price=Utility.getDataFromExcel("amazon", 1, 0);
		amazon_In.sendSearchBox(price);
		amazon_In.clickOnsearchButtonClick();
		
		MobileUnder12000 mobileUnder12000=new MobileUnder12000(driver);
		mobileUnder12000.clickOnFirstMobileNokiaG10();
	
		ArrayList<String> switchto=new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(switchto.get(1));
	
		FirstMobileNokiaG10 firstMobileNokiaG10=new FirstMobileNokiaG10(driver);
		firstMobileNokiaG10.clickOnaddToCart();
		
	
	}

}
