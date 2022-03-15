package Automated_Web_Sites;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(500);
		Email.sendKeys("8830443642");
		WebElement Pass=driver.findElement(By.xpath("//input[@id='pass']"));
		Thread.sleep(500);
		Pass.sendKeys("Prasad");
		WebElement LogIn=driver.findElement(By.ByXPath.xpath("//button[text()='Log In']"));
		//LogIn.click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		WebElement Create=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Create.click();
		Thread.sleep(3000);
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("Prasad");
		Thread.sleep(500);
		WebElement LastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("Raut");
		Thread.sleep(500);
		WebElement Mobile=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		Mobile.sendKeys("8830443642");
		Thread.sleep(500);
		WebElement NewPass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		NewPass.sendKeys("Prasad");
		Thread.sleep(500);
		
		//alternative
//		WebElement DOB=driver.findElement(By.xpath("//select[@id='day']"));
//		DOB.sendKeys("26");
//		Thread.sleep(500);
//		WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
//		Month.sendKeys("Month");
//		Thread.sleep(500);
//		WebElement Year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
//		Year.sendKeys("1998");
//		Thread.sleep(500);
//		WebElement Gender=driver.findElement(By.xpath("//label[text()='Male']"));
//		Gender.click();
//		driver.close();
	
		
		//how to handle dropdowns
		WebElement Month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s=new Select(Month);
		s.selectByIndex(2);
		Thread.sleep(1000);
		s.selectByValue("4");
		Thread.sleep(1000);
		s.selectByVisibleText("Aug");
		Thread.sleep(1000);
		WebElement DOB=driver.findElement(By.xpath("//select[@id='day']"));
		Select p=new Select(DOB);
		p.selectByIndex(25);
		Thread.sleep(1000);
		p.selectByValue("27");
		Thread.sleep(1000);
		p.selectByVisibleText("28");
		Thread.sleep(1000);
		
		WebElement Year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select x=new Select(Year);
		x.selectByValue("2022");
		Thread.sleep(1000);
		WebElement femaleRad=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		WebElement maleRad=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		WebElement costomRad=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		WebElement Pronoun=driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));

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

		WebElement signIn=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signIn.click();
	}

}
