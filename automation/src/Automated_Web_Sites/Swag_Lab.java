package Automated_Web_Sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Swag_Lab {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='user-name']"));
		name.sendKeys("standard_user");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("secret_sauce");

	
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		

		WebElement sort = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		 Select s=new Select(sort);
		 s.selectByVisibleText("Price (low to high)");
		 Thread.sleep(2000);
		 
		 WebElement cart = driver.findElement(By.xpath("(//div[@id='root']//button)[3]"));
		 cart.click();
		 
		
		 WebElement carts = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		 carts.click();
		 Thread.sleep(2000);
		 
		
		 WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
		 checkout.click();
		 Thread.sleep(2000);
		 
		 WebElement fname= driver.findElement(By.xpath("//input[@id='first-name']"));
		 fname.click();
		 fname.sendKeys("Prasad");
		 Thread.sleep(1000);
		 
		 WebElement lname= driver.findElement(By.xpath("//input[@id='last-name']"));
		 lname.click();
		 lname.sendKeys("Raut");
		 Thread.sleep(1000);
		 
		 WebElement code= driver.findElement(By.xpath("//input[@id='postal-code']"));
		 code.click();
		 code.sendKeys("1234");
		 Thread.sleep(1000);
		 
		 
		 WebElement continu= driver.findElement(By.xpath("//input[@type='submit']"));
		 continu.click();
		 Thread.sleep(1000);
		 
		 WebElement finish= driver.findElement(By.xpath("//button[@id='finish']"));
		 finish.click();
		 Thread.sleep(1000);
		
		 
		 WebElement home= driver.findElement(By.xpath("//button[@id='back-to-products']"));
		 home.click();
		 Thread.sleep(1000);
	}

}
