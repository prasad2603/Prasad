package automation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
 
		//basic method
//		TakesScreenshot g= (TakesScreenshot)driver;
//		
//		File source = g.getScreenshotAs(OutputType.FILE);
//		File destination=new File("E:\\New folder\\Test.jpg");
//		FileHandler.copy(source, destination);
		
		System.out.println("-------------------");
		
//		//first method-->Sequential Printing
//		for(int i=0;i<=5;i++)
//		{
//		File sourse =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File Destination=new File("E:\\New folder\\Test"+i+".jpg");
//		Thread.sleep(1000);
//		FileHandler.copy(sourse, Destination);
//		}
//		//second method--> Random Printing
//		for(int i=0;i<=5;i++)
//		{
//		File sourse =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File Destination=new File("E:\\New folder\\Test"+Math.random()+".jpg");
//		Thread.sleep(1000);
//		FileHandler.copy(sourse, Destination);
//		}
	
	   //Third method
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		
		for(int i =1; i<=4;i++)
		{
				
		TakesScreenshot g= (TakesScreenshot)driver;
		
		File source = g.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("E:\\New folder\\Test"+ dtf.format(now)+i+".jpg");
		
		FileHandler.copy(source, dest);
		Thread.sleep(3000);
	
		}
	}

}
