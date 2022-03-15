package Chap_1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Methods_Of_WebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		
		
		System.out.println("------------------------------");
		
        driver.get("https://www.rediff.com/");
		
		WebElement rediffmail =driver.findElement(By.xpath("//a[text()='Rediffmail']"));
		rediffmail.click();
		Thread.sleep(1000);
		WebElement createNewAcc =driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']"));
		createNewAcc.click();
		
		WebElement checkBox =driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		//1.isSelected();
		boolean Result=checkBox.isSelected();
		Thread.sleep(3000);
		if(Result==false)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		System.out.println("-----------------------");
		
		
		
		
        driver.get("https://www.facebook.com/");
		
    	for(int i=0;i<=5;i++)
		{
    		TakesScreenshot g= (TakesScreenshot)driver;
    	//2.getScreenshotAs
		File sourse =g.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("E:\\New folder\\Test"+i+".jpg");
		Thread.sleep(1000);
		FileHandler.copy(sourse, Destination);
		}
        
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		email.sendKeys("Prasad");
		Thread.sleep(2000);
		//3.clear();
		email.clear();
		Thread.sleep(2000);
		//4.sendkeys():
		email.sendKeys("Raut");
		//5.Click();
		WebElement Create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Create.click();
		//6.getText();
		String text=Create.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		WebElement femaleRad=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		WebElement maleRad=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		WebElement costomRad=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		WebElement Pronoun=driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));

		//7.isDesplayed
		boolean result=Pronoun.isDisplayed();
		System.out.println(result);
	
		costomRad.click();
		result=Pronoun.isDisplayed();
		if(result==true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("False");
		}
		maleRad.click();
		result=Pronoun.isDisplayed();
		if(result==false)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println("------------------------------");
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(1000);
		WebElement Email=driver.findElement(By.xpath("(//input[contains(@autocapitalize,'off')])[1]"));
		Email.sendKeys("8830443642");
		Thread.sleep(1000);
		WebElement Pass=driver.findElement(By.xpath("(//input[contains(@autocapitalize,'off')])[2]"));
		Pass.sendKeys("8830443642");
		Thread.sleep(1000);
		WebElement LogIn=driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(1000);
		
		
		//8.getAttribute();
		String data=LogIn.getAttribute("class");
		System.out.println(data);
		
		//9.isEnabled();
		boolean Result12=LogIn.isEnabled();
		Thread.sleep(3000);
		if(Result12==false)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		System.out.println("------------------------------------");
		
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(1000);
		
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

		//10.get(int index)-WebElement
		ArrayList<String> add=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(add);
		System.out.println(add.get(0));
		System.out.println(add.get(1));
		System.out.println(add.get(2));
		System.out.println(add.get(3));
		System.out.println(add.get(4));
		
		
		System.out.println("-------------------------------");
		
		 driver.get("https://www.facebook.com/");
		 
			List<WebElement>  img=driver.findElements(By.tagName("img"));
		      
			
		//11..size
				int no=img.size();
			
				for(int i=0;i<no;i++)
				{
					WebElement ele=img.get(i);
			
					String data1=ele.getAttribute("src");
					System.out.println(data1);
					if(data1.isEmpty())
					{
						System.out.println("true");
					}
					else
					{
						System.out.println("false");
					}
				}
				
		System.out.println("------------------");
		
		//12..accept
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(500);
		WebElement summit=driver.findElement(By.xpath("//input[@type='submit']"));
		summit.click();
		Thread.sleep(500);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(500);
		alt.accept();

	}

}
