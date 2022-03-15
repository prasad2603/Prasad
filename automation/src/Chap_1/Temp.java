package Chap_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Temp {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement dob=driver.findElement(By.xpath("//select[@id='day']"));
		dob.sendKeys("26");
		Select s=new Select(dob);
		s.selectByIndex(0);
		s.selectByValue("1");
		s.selectByVisibleText("1");
		
		Actions act=new Actions(driver);
		act.moveToElement(dob).dragAndDrop(dob,dob).click().build().perform();
		
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("arguments[0].scrollIntoView(true);", dob);
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);	
		File dest=new File("location");
		FileHandler.copy(source, dest);
		
		String path="Sheet path";
		FileInputStream file=new FileInputStream(path);
		
		Sheet x=WorkbookFactory.create(file).getSheet("SheetName");
		Row y=x.getRow(0);
		Cell z=y.getCell(0);
		String a=z.getStringCellValue();
		System.out.println(a);
		
		String b=WorkbookFactory.create(file).getSheet("SheetName").getRow(0).getCell(0).getStringCellValue();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		ArrayList<String> sh=new ArrayList<String>(driver.getWindowHandles());
		sh.size();
		sh.get(0);
		

	}

}
