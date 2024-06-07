package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseClass;
import POM.PomClass;

public class Testclass extends BaseClass

	{
		WebDriver driver;
		public PomClass pom;
		
		
		@Test
		public void OpenChrome()
		{
			driver = OpenChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://minimals.cc/.");
			
		}
		
		@Test
		public void first() throws InterruptedException 
		{
			pom=new PomClass(driver);
			pom.billing();
			pom.Test2();
		    pom.Test3();
			pom.Test5();
			pom.Test4();
			driver.quit();
		}

}
