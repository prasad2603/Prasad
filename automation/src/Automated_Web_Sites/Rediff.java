package Automated_Web_Sites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\JAVA\\Java\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.rediff.com/");
		
		WebElement rediffmail =driver.findElement(By.xpath("//a[text()='Rediffmail']"));
		rediffmail.click();
		Thread.sleep(8000);
		WebElement createNewAcc =driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']"));
		createNewAcc.click();
		
		WebElement fullName =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fullName.sendKeys("Prasad");
		
		WebElement Id =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Id.sendKeys("Prasad@123.com");
		
		WebElement availability =driver.findElement(By.xpath("//input[@value='Check availability']"));
		availability.click();
		
		WebElement password =driver.findElement(By.xpath("(//input[@maxlength='14'])[1]"));
		password.sendKeys("Prasad");
		
		WebElement repass =driver.findElement(By.xpath("(//input[@maxlength='14'])[2]"));
		repass.sendKeys("Raut");
		
		WebElement alternateId =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		alternateId.sendKeys("gdsfjah@.com");
		
		WebElement checkBox =driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		
		WebElement list =driver.findElement(By.xpath("//select[@style='width:285px;']"));
		list.click();
		Select s=new Select(list);
		s.selectByVisibleText("What is the name of your first school?");
		
		WebElement answer =driver.findElement(By.xpath("(//input[@maxlength='30'])[2]"));
		answer.sendKeys("sdfhj");
		WebElement name =driver.findElement(By.xpath("(//input[@maxlength='30'])[3]"));
		name.sendKeys("dioahyfiuh");
		
		WebElement mobile =driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		mobile.sendKeys("446567468");
		
		WebElement day =driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[2]"));
		
		Select x=new Select(day);
		x.selectByIndex(0);

		WebElement month=driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[3]"));
		Select y=new Select(month);
		y.selectByIndex(2);
		
		WebElement year =driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[4]"));
		Select z=new Select(year);
		z.selectByVisibleText("1998");
		
		WebElement gender =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender.click();
		
		WebElement country =driver.findElement(By.xpath("//select[@id='country']"));
		Select m=new Select(country);
		m.selectByVisibleText("Antarctica");
		WebElement create =driver.findElement(By.xpath("//input[@id='Register']"));
		create.click();
		
		System.out.println("-----------------------------------");
		
		//application header
		
		WebElement rediffmail1=driver.findElement(By.xpath("//a[@class='mailicon']"));
		WebElement money=driver.findElement(By.xpath("//a[@class='moneyicon relative']"));
		WebElement enterpriseEmail=driver.findElement(By.xpath("//a[@class='eproicon relative']"));
		WebElement videos=driver.findElement(By.xpath("//a[@class='vdicon']"));
		WebElement businessEmail=driver.findElement(By.xpath("//a[@class='bmailicon relative']"));
		WebElement shopping=driver.findElement(By.xpath("//a[@class='shopicon relative']"));
		WebElement createAccount=driver.findElement(By.xpath("//div[@class='cell alignR toprlinks']"));
		
		
		System.out.println("--------------------------");
		//application footer
		
		WebElement rediffCom=driver.findElement(By.xpath("//a[text()='Rediff.com US']"));
		WebElement investors=driver.findElement(By.xpath("//a[text()='Investors']"));
		WebElement advertiseWithUs=driver.findElement(By.xpath("//a[text()='Advertise with us']"));
		WebElement disclaimer=driver.findElement(By.xpath("//a[text()='Disclaimer']"));
		WebElement privacy=driver.findElement(By.xpath("//a[text()='Privacy']"));
		WebElement rediffLabs=driver.findElement(By.xpath("(//a[text()='Rediff Labs'])[2]"));
		WebElement sitemap=driver.findElement(By.xpath("//a[text()='Sitemap']"));
		WebElement feedback=driver.findElement(By.xpath("//a[text()='Feedback']"));
		WebElement contactUs=driver.findElement(By.xpath("//a[text()='Contact Us']"));
		WebElement aboutAs=driver.findElement(By.xpath("//a[text()='About us']"));
		WebElement termsOfUse=driver.findElement(By.xpath("//a[text()='Terms of use']"));
		WebElement grievances=driver.findElement(By.xpath("//a[text()='Grievances']"));
		
		
	}

}
