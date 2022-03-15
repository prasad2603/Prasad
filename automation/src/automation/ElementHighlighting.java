package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementHighlighting {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		WebElement Create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Create.click();
		Thread.sleep(3000);
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Prasad");
		
		JavascriptExecutor js2= (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].setAttribute('style','border:6px solid black; background:yellow')", FirstName);
	

	}
}
