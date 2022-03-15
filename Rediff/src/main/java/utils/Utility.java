package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void screenshot(WebDriver driver,String testID) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy HH-mm-ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now)); 
		
		File source=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\TakeScreenshot\\"+testID+ dtf.format(now)+".jpg");
		FileHandler.copy(source,dest);
	}
	public static String getDataFromExcel(String sheet, int row,int cell) throws EncryptedDocumentException, IOException 
	{
		String path=("C:\\Users\\PRASAD\\Desktop\\Book1.xlsx");
		FileInputStream file=new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		return data;
	}


}
