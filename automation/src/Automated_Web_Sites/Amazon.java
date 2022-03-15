package Automated_Web_Sites;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	

	driver.get("https://www.amazon.in/");
	Thread.sleep(500);
	System.out.println("------------------------------");
	
	
	WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	search.sendKeys("mobile under 12000");
	Thread.sleep(3000);
	
	WebElement searchClick=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
	searchClick.click();

	WebElement first=driver.findElement(By.xpath("(//div[@id='search']//span//h2//a//span)[1]"));
	first.click();
	Thread.sleep(5000);

	ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(add.get(1));
	Thread.sleep(5000);
	
	WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	addToCart.click();
	
}
	
}
