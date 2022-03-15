package automation;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		
		WebElement alert1=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alert1.click();
		System.out.println(driver.getCurrentUrl());
		
		ArrayList<String> add1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add1.get(1));
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());

		//How to handle child of child browser  
//		ArrayList<String> add11=new ArrayList<String>(driver.getWindowHandles());
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		//3 types of iframe
		//driver.switchTo().frame(7);//by index
//		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(iframe);
	
		WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
//		driver.switchTo().frame(tryit);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		WebElement getnewsite=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		getnewsite.click();
		driver.getCurrentUrl();
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		driver.getCurrentUrl();
		driver.switchTo().frame(iframe);
		tryit.click();
		Alert alt2=driver.switchTo().alert();
		Thread.sleep(5000);
		alt2.accept();
	}

}
