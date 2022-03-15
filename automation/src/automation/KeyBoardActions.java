package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		System.out.println("-----------------------------");
		
		//First Method
//		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
//		Thread.sleep(500);
//		Email.sendKeys("8830443642");
//		WebElement Pass=driver.findElement(By.xpath("//input[@id='pass']"));
//		Thread.sleep(500);
//		Pass.sendKeys("Prasad");
		
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.ENTER).perform();
		
		WebElement Create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Create.click();
		Thread.sleep(5000);
		WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
	
//		act.click(Day);
//		for(int i=0;i<=26;i++) {
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		}
//		act.click(Month);
//		for(int i=0;i<=2;i++) {
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		}
		
		
		
		
		
		
		
		
		//Second Method
		
//		WebElement Create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		Create.click();
//		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
//		
//		Actions act1=new Actions(driver);
//		driver.findElement(By.name("firstname")).sendKeys("parasad");
//		act1.sendKeys(Keys.TAB)
//		.pause(Duration.ofSeconds(1))
//		.sendKeys("Prasad")
//		.sendKeys(Keys.TAB)
//		.sendKeys("Raut")
//		.sendKeys(Keys.TAB)
//		.sendKeys("698365645")
//		.sendKeys(Keys.TAB)
//		.sendKeys("pahfjf")
//		.build().perform();
		
		
		
		
	}

}
