package Chap_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		System.out.println("--------------------------------------");
//		//1.drop-down by select method 
//		
//		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(1000);
//		
//		WebElement Create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		Create.click();
//		Thread.sleep(3000);
//		
//		WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
//		Select s=new Select(Month);
//		s.selectByIndex(2);
//		Thread.sleep(1000);
//		s.selectByValue("4");
//		Thread.sleep(1000);
//		s.selectByVisibleText("Aug");
//		Thread.sleep(1000);
//		WebElement DOB=driver.findElement(By.xpath("//select[@id='day']"));
//		Select p=new Select(DOB);
//		p.selectByIndex(25);
//		Thread.sleep(1000);
//		p.selectByValue("27");
//		Thread.sleep(1000);
//		p.selectByVisibleText("28");
//		Thread.sleep(1000);
//		
//		WebElement Year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
//		Select x=new Select(Year);
//		x.selectByValue("2022");
//		Thread.sleep(1000);
		
		System.out.println("--------------------------------------");
		//2.If tag name is “ other than Select “ then by freezing the screen
		 //(F8 or FN+8) and selecting drop down and finding the element of drop down (Ex.-IRCTC)

		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		WebElement ok=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		ok.click();
		Thread.sleep(1000);
		WebElement from=driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]"));
		from.click();
		
		WebElement punes=driver.findElement(By.xpath("(//li[@role='option'])[2]"));
		punes.click();
		Thread.sleep(500);
		WebElement to=driver.findElement(By.xpath("(//input[@aria-haspopup='true'])[2]"));
		to.sendKeys("Ranch");
		
		WebElement ranchi=driver.findElement(By.xpath("//span[text()='RANCHI - RNC']"));
		ranchi.click();
		System.out.println("---------------------------------------");
		//3.drop-down by mouse action 
		
//		driver.get("https://www.amazon.com/");
//		Thread.sleep(1000);
//		
//		Actions act=new Actions(driver);
//	
//		WebElement Acc_List=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
//		WebElement order=driver.findElement(By.xpath("//span[text()='Orders']"));
//		act.moveToElement(Acc_List).perform();
//		act.moveToElement(order).click().build().perform();
//		
//		//act.moveToElement(Acc_List).moveToElement(order).click().build().perform();
		
		System.out.println("--------------------------------");
//		//drag and drop operation
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		Thread.sleep(2000);
//		
//		Actions act=new Actions(driver);
//	
//		WebElement source=driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[4]"));
//		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
//		Thread.sleep(4000);
//		act.dragAndDrop(source, target).perform();
//		Thread.sleep(4000);
	}

}
