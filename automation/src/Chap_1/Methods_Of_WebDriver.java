package Chap_1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Of_WebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//.1.get
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		//2.navigate
		//driver.navigate()--> .to(String url);,.back();,.refresh();,.forward();
        //driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//3.manage
		//magage();-->.window();,.timeouts();
		//window();-->maximize();,.minimize();,..setPosition(s);,..setSize(d);
		Dimension d= new Dimension(600, 300);//L*H
		driver.manage().window().setSize(d);
		
		Point s=new Point(0,400);
		driver.manage().window().setPosition(s);
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.manage().window().minimize();
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		//4.getCurrentUrl
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//5.getTitle
		String title=driver.getTitle();
		System.out.println(title);
		
		//6.close
		driver.close();//close single window 
		Thread.sleep(1000);
		
		//7.quit
		driver.quit();//close all window 
		Thread.sleep(1000);

		
		System.out.println("------------------------------------");
		
		
		//8.getWindowHandle
		//9.getWindowHandles
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		
		//10.findElement
		WebElement alert=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement confirm=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement prompt=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement line=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		alert.click();
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
		prompt.click();
		Thread.sleep(2000);
		line.click();
		
		String main_page= driver.getWindowHandle();//address of main page
		System.out.println(main_page);

		ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(add);
		System.out.println(add.get(0));
		System.out.println(add.get(1));
		System.out.println(add.get(2));
		System.out.println(add.get(3));
		System.out.println(add.get(4));
	
		//11.switchTo
		driver.switchTo().window(add.get(0));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(1));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(2));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(3));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(add.get(4));
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		
		
		System.out.println("------------------------------------");
		
		
		//12.findElements
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		List<WebElement>  row=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int size=row.size();
		for(int i=0;i<size;i++)
		{
			List<WebElement>  cells=driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			int sizecell =cells.size();
			for(int j=0;j<sizecell;j++)
			{
			WebElement ele=cells.get(j);
			String data=ele.getText();
			System.out.print(data+",");
			}
			System.out.println();
		}

		
		
		
		
		
	}

}
