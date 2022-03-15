package Automated_Web_Sites;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in");
		Thread.sleep(3000);
	
		WebElement ok=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		ok.click();
		Thread.sleep(3000);
		
//		
//		WebElement from=driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]"));
//		from.click();
//		Thread.sleep(3000);
//		
//		WebElement mumbai=driver.findElement(By.xpath("//span[text()='MUMBAI CENTRAL - MMCT']"));
//		mumbai.click();
//		Thread.sleep(3000);
//		
//		WebElement to=driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]"));
//		to.click();
//		Thread.sleep(3000);
//	
//		WebElement pune=driver.findElement(By.xpath("//span[text()='PUNE JN - PUNE']"));
//		pune.click();
//		Thread.sleep(3000);
//		WebElement classes=driver.findElement(By.xpath("(//div[@style='width: 100%;'])[1]"));
//		classes.click();
//		Thread.sleep(3000);
//		WebElement firstClass=driver.findElement(By.xpath("//span[text()='First Class (FC)']"));
//		firstClass.click();
//		Thread.sleep(3000);
//		
//		WebElement general=driver.findElement(By.xpath("(//div[@style='width: 100%;'])[2]"));
//		general.click();
//		Thread.sleep(3000);
//		
//		WebElement ladies=driver.findElement(By.xpath("//span[text()='LADIES']"));
//		ladies.click();
//		Thread.sleep(3000);
//		
//		WebElement search=driver.findElement(By.xpath("//button[text()='Search']"));
//		search.click();
//		Thread.sleep(3000);
//		System.out.println("--------------------------------");
//		
//		WebElement okk=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		okk.click();
//		Thread.sleep(3000);
//		
//		WebElement all=driver.findElement(By.xpath("//div[@class='h_menu_drop_button moblogo hidden-sm']"));
//		all.click();
//		Thread.sleep(3000);
		
		WebElement buses=driver.findElement(By.xpath("//label[text()='BUSES']"));
		buses.click();
		
		ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(add.get(1));
		
		WebElement departFrom=driver.findElement(By.xpath("//input[@id='departFrom']"));
		departFrom.sendKeys("pune");

		WebElement goingTo=driver.findElement(By.xpath("//input[@id='goingTo']"));
		goingTo.sendKeys("nashik");
				
		WebElement departdateBox=driver.findElement(By.xpath("//input[@id='departDate']"));
		departdateBox.click();
		
		WebElement departdate=driver.findElement(By.xpath("(//a[@class='ui-state-default'])[13]"));
		departdate.click();
				
		WebElement searchBuses=driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		searchBuses.click();
	}

}
