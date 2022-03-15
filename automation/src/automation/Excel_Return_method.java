package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Return_method {

	public static String getDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		String path="C:\\Users\\PRASAD\\Desktop\\Book1.xlsx";
		FileInputStream file=new FileInputStream(path);
		String data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		
		return data;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	String	data=Excel_Return_method.getDataFromExcel("Prasad", 3, 1);
		System.out.println(data);
	}

}
