package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass 
{
	public static WebDriver openChromeBrowser() 
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Ajit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        return driver;
	}
}