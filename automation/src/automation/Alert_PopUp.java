package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
 
		//alert pop up handling
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(500);
		WebElement summit=driver.findElement(By.xpath("//input[@type='submit']"));
		summit.click();
		Thread.sleep(500);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(500);
		alt.accept();
		
//		driver.switchTo().alert().accept();
	
	}

}
