package automation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_concept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 //implicit wait(Waiting time)--> two time search and wait upto timer
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		
//		WebElement preview=driver.findElement(By.xpath("(//a[contains(text(),'Previous')])[1]"));
//		WebElement next=driver.findElement(By.xpath("(//a[contains(text(),'Next')])[1]"));
//		WebElement tryit=driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself ')])[1]"));

		
		System.out.println("---------");
		//explicit wait(waiting time + condition)-->applicable to only one webelement
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Previous')])[1]")));
		
	
		//fluent wait(waiting time + condition + frequency)-->
		
	
		
	}

}
