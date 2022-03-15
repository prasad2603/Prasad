package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Table_findElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		
////		WebElement cell=driver.findElement(By.xpath("//table[@id='customers']//tr[4]//td[2]"));
//		
//		List<WebElement>  cells=driver.findElements(By.xpath("//table[@id='customers']//td"));
//        
//		int size=cells.size();
//		
//		for(int i=0;i<size;i++)
//		{
//			WebElement ele=cells.get(i);
//			String data=ele.getText();
//			System.out.println(data);
//		}
		
//	driver.get("https://www.w3schools.com/html/html_tables.asp");
//		
//	
//		List<WebElement>  row=driver.findElements(By.xpath("//table[@id='customers']//tr"));
//		int size=row.size();
//		for(int i=0;i<size;i++)
//		{
//			List<WebElement>  cells=driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
//			int sizecell =cells.size();
//			for(int j=0;j<sizecell;j++)
//			{
//			WebElement ele=cells.get(j);
//			String data=ele.getText();
//			System.out.print(data+",");
//			}
//			System.out.println();
//		}
		
		
		//how to verify broken images 
//		 driver.get("https://www.facebook.com/");
//		 
//	List<WebElement>  img=driver.findElements(By.tagName("img"));
//       
//		int no=img.size();
//	
//		for(int i=0;i<no;i++)
//		{
//			WebElement ele=img.get(i);
//	
//			String data=ele.getAttribute("src");
//			System.out.println(data);
//			if(data.isEmpty())
//			{
//				System.out.println("true");
//			}
//			else
//			{
//				System.out.println("false");
//			}
//		}
		
		
		//how to verify broken link
		 driver.get("https://www.facebook.com/");
		 
	List<WebElement>  img=driver.findElements(By.tagName("a"));
      
		int no=img.size();
		
		for(int i=0;i<no;i++)
		{
			WebElement ele=img.get(i);
			String data=ele.getText();
			System.out.println(data);
			if(data.equals(null))
			{
				System.out.println("defect");
			}
			
		}
		
		
		
	}

}
