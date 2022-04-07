package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {
	public static WebDriver launchChromeBrowser()
	{
		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notifications");
		option.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		return driver;
	}
	public static WebDriver launchFirefoxBrowser()
	{
		ChromeOptions option=new ChromeOptions();
//		option.addArguments("--disable-notifications");
		option.addArguments("--incognito");
		System.setProperty("webdriver.gecko.driver", "E:\\JAVA\\Java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(option);
		return driver;
	}

}
