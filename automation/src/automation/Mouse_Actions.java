package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		Thread.sleep(1000);
//		
//		Actions act=new Actions(driver);
		//methods of mouse by action class object and by passing webdriver type argument
//		{act.click();//left click
//		act.doubleClick();//left double click
//		act.contextClick();//right click
//		act.moveToElement(null);//move to target element
//		act.dragAndDrop(null, null);}//drag from source element and drop to target
		
//		act.build();// to combine 2 and more methods of mouse
//		act.perform();//to perform and execute 
		
//		WebElement Acc_List=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']"));
//		WebElement order=driver.findElement(By.xpath("//span[text()='Orders']"));
//		act.moveToElement(Acc_List).perform();
//		act.moveToElement(order).click().build().perform();
//		
//		act.moveToElement(Acc_List).moveToElement(order).click().build().perform();
		
		System.out.println("--------------------------------");
		
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		Thread.sleep(2000);
//		WebElement source=driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[4]"));
//		WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
//		Thread.sleep(4000);
//		act.dragAndDrop(source, target).perform();
//		Thread.sleep(4000);
	
		
	}
}
