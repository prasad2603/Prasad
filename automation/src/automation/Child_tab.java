package automation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_tab {

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
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(2));
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(3));
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(1));
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(4));
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
	
		
	}

}
