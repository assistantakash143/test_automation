package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver OpenChromeDriver()
	{
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajit\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
WebDriver driver= new ChromeDriver();    
return driver;
	}
	
}
