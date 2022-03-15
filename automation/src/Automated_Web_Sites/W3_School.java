package Automated_Web_Sites;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3_School {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		
		WebElement alert=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alert.click();
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
		prompt.click();
		Thread.sleep(2000);
		line.click();
		
		String main_page= driver.getWindowHandle();//address of main page
		System.out.println(main_page);

		ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(add);
		System.out.println(add.get(0));
		System.out.println(add.get(1));
		System.out.println(add.get(2));
		System.out.println(add.get(3));
		System.out.println(add.get(4));
	
		driver.switchTo().window(add.get(0));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(1));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(2));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(3));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(4));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("--------------");
		//How to handle child browser popup 
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		
		WebElement alert1=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alert1.click();
		System.out.println(driver.getCurrentUrl());
		
		ArrayList<String> add1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(add1.get(1));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		WebElement getnewsite=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		getnewsite.click();
		
	
		//How to handle child of child browser  
		ArrayList<String> add11=new ArrayList<String>(driver.getWindowHandles());
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
		Thread.sleep(300);
		driver.switchTo().parentFrame();
		driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.getCurrentUrl();
		
		

	}

}
