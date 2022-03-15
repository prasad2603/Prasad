package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Import {
	

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\PRASAD\\Desktop\\Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		
		
		//to close the excel sheet by jvm we can write all code in loop with close method
//		Workbook workbook =WorkbookFactory.create(file);
//		
//		Sheet data=workbook.getSheet("Prasad");
//		
//		int lastrow=data.getLastRowNum();
//		
//		Row row=data.getRow(5);
//		
//		int lastcell=row.getLastCellNum();
//		
//		Cell cell=row.getCell(1);
//		
//		String stringValue=cell.getStringCellValue();
//		System.out.println(stringValue);
//		
//		workbook.close();****loop from 22 to 37
		
//		String data=WorkbookFactory.create(file).getSheet("Prasad").getRow(4).getCell(1).getStringCellValue();
//		System.out.println(data);//chaining
//		****double values=   WorkbookFactory.create(file).getSheet("Prasad").getRow(5).getCell(1).getNumericCellValue();
//		System.out.println(values);***//for excel int value
//		Date date=WorkbookFactory.create(file).getSheet("Prasad").getRow(5).getCell(1).getDateCellValue();
//		System.out.println(date);
		
		
//	Sheet data1=WorkbookFactory.create(file).getSheet("Prasad");
	
//	    first method
//		for(int i=0;i<=4;i++) 
//		{
//			for(int j=0;j<=1;j++)
//			{
//				Row a=data1.getRow(i);
//				Cell b=a.getCell(j);
//				String Result=b.getStringCellValue();
//				System.out.print(Result+",");
//			}
//			System.out.println();
//		} 
		
		
		//second method
		//to find last row and last cell
		
	Sheet data=WorkbookFactory.create(file).getSheet("Prasad");
	
		int n=data.getLastRowNum();
		System.out.println(n);
		Row m=data.getRow(0);
		int s=m.getLastCellNum();
		System.out.println(s);
	
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<s;j++)
			{
				Row a=data.getRow(i);
				Cell b=a.getCell(j);
				String Result=b.getStringCellValue();
				System.out.print(Result+",");
			}
			System.out.println();
		}
	}
}
