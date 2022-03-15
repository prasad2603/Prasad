package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrooll_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/");
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//scroll--> ScrollBy method
		System.out.println("-------------------------------");
		
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-5000)");
		
		System.out.println("-------------------------");
		//scroll--> ScrollIntoView method
		WebElement com=driver.findElement(By.xpath("//a[text()='Complete JavaScript Reference »']"));
		js.executeScript("arguments[0].scrollIntoView(true);", com);
		js.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(1000);
		com.click();
		
		System.out.println("-------------------------");
		
		WebElement complete=driver.findElement(By.xpath("//a[text()='Complete JavaScript Reference »']"));
		js.executeScript("arguments[0].scrollIntoView(false);", complete);
		Thread.sleep(1000);
		complete.click();
		
		System.out.println("---------------------------------");
		//not working see changes
		//WebElement oo=driver.findElement(By.xpath("//a[text()='JavaScript Examples »']"));
		//js.executeScript("arguments[0].scrollIntoView(true);", oo);
		//oo.click();
	
	}

}
