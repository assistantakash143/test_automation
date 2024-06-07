package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
	{

		WebDriver driver;
	
		
		@FindBy(xpath="//a[text()='Login']")
		public WebElement login ;
		
		@FindBy(xpath="//input [@name=\"email\"]")
		public WebElement email;
		
		@FindBy(xpath="//input[@name=\"password\"]")   //span[text()="Electronics"]
		public WebElement Password;      
		
		@FindBy(xpath="//button[@type=\"submit\"]")
		public WebElement submit;
		
		
		@FindBy(xpath="//span[text()=\"user\"]")
		public WebElement user;
		

		@FindBy(xpath="//span[text()=\"account\"]")
		public WebElement account;
		
		
		@FindBy(xpath="(//button[@class=\"MuiButtonBase-root MuiTab-root MuiTab-labelIcon MuiTab-textColorInherit css-ik3mm4\"])[1]")
		public WebElement billing;
		
		@FindBy(xpath="//button[text()=\"Jayvion Simon\"]")
		public WebElement jayvion;
		
		@FindBy(xpath="(//div[@class=\"MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters MuiStack-root css-61ng8x\"])[2]")
		public WebElement deja;
		
		@FindBy(xpath="//button[text()=\"**** **** **** 5678\"]")
		public WebElement payment;
		
		@FindBy(xpath="(//div[@class=\"MuiPaper-root MuiPaper-outlined MuiPaper-rounded MuiStack-root css-1v8rs44\"])[1]")
		public WebElement payment123;
		
		@FindBy(xpath="(//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-disableElevation MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-disableElevation css-1stllat\"])[1]")
		public WebElement Test1;
				
		@FindBy(xpath="(//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-disableElevation MuiButton-root MuiButton-text MuiButton-textInherit MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorInherit MuiButton-disableElevation css-1stllat\"])[2]")
		public WebElement Test2;
		
		//------------------------Test 2nd-----------------------------

		@FindBy(xpath="(//span[@class=\"label MuiBox-root css-0\"] )[9]")
		public WebElement order;
		
		@FindBy(xpath="(//span[@class=\"label MuiBox-root css-0\"] )[10]")
		public WebElement list;
		
		@FindBy(xpath="//input[@placeholder=\"Search...\"]")
		public WebElement searchbox;
		
		//----------------------Test 3rd --------------------------
		
		@FindBy(xpath="(//div[@class=\"MuiButtonBase-root MuiListItemButton-root MuiListItemButton-root  css-1aw2skn\"])[11]")
		public WebElement job;
		
		@FindBy(xpath="(//div[@class=\"MuiButtonBase-root MuiListItemButton-root MuiListItemButton-root  css-mqpf1p\"])[6]")
		public WebElement list1;
		
		@FindBy(xpath="//button[text()=\"Filters\"]")
		public WebElement fliter;
		
		@FindBy(xpath="(//input[@type=\"checkbox\"])[3]")
		public WebElement ondemand;
		
		@FindBy(xpath="(//input[@type=\"checkbox\"])[1]")
		public WebElement fulltime;
		
		@FindBy(xpath="(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-10ygcul\"])[5]")
		public WebElement close;
		
		//------------------------Test 5th -----------------------
		
		@FindBy(xpath="(//span[@class=\"label MuiBox-root css-0\"])[18]")
		public WebElement filemanager;
		
		@FindBy(xpath="(//input[@class=\"PrivateSwitchBase-input css-1m9pwf3\"])[1]")
		public WebElement selectcheckbox;
		
		@FindBy(xpath="(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium css-bldg9r\"])[2]")
		public WebElement delete;
		
		@FindBy(xpath="//button[text()=\"Delete\"]")
		public WebElement Delete;
		
		//--------------------------------Test 4th -------------------------------------------------	
		
		@FindBy(xpath="(//div[@class=\"MuiButtonBase-root MuiListItemButton-root MuiListItemButton-root  css-1aw2skn\"])[15]")
		public WebElement chat;
		
		@FindBy(xpath="(//div[@class=\"MuiButtonBase-root MuiListItemButton-root MuiListItemButton-root css-1emdvz9\"])[2]")
		public WebElement msg;
		
		@FindBy(xpath="//input[@class=\"MuiInputBase-input MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd css-qbcrcl\"]")
		public WebElement writemsg;
		
		
		
	//---------------------------------------------------------------------------------	
		
		 public  PomClass  (WebDriver driver)
		  {
	     	PageFactory.initElements(driver ,this);
		    this.driver=driver;
		  }
		 
		
		  public void billing() throws InterruptedException
		  {
			  Thread.sleep(7000);
			  login.click();
			  Thread.sleep(5000);
			  email.sendKeys("demo@minimals.cc");
			  Password.sendKeys("demo1234");
			  submit.click();
			  Thread.sleep(5000);
			  user.click();
			  Thread.sleep(5000);
			  account.click();
			  Thread.sleep(5000);
			  billing.click();
			  Thread.sleep(5000);
			  jayvion.click();
			  Thread.sleep(5000);
			  deja.click();
			  Thread.sleep(5000);
			  payment.click();
			  Thread.sleep(5000);
			  payment123.click();
			  String billingname = Test1.getText();
			  Thread.sleep(5000);
			  String paymanet  =Test2.getText();
			  System.out.println(billingname);
			  System.out.println(paymanet);
			  Thread.sleep(5000);
			  if (billingname=="Deja Brady" || paymanet=="**** **** **** 1234" )
			  {
				  System.out.println("*********************-----Paymanet method updated Unsuccssfully-----*********************");
			  }
			  else 
			  {
				  System.out.println("*********************-----Paymanet method updated Succssfully-----*********************");
			  } 
			 System.out.println("-----------------------------------------------------Test Case 1st Completed ---------------------------------------------");
			
		  }
		  
		  public void Test2() throws InterruptedException
		  {
			  System.out.println("--------------------------------------------------------------------------------------------------");
			  order.click();
			  Thread.sleep(5000);
			  list.click();
			  Thread.sleep(9000);
			  searchbox.click();
			  Thread.sleep(5000);
			  searchbox.sendKeys("cor");
			  System.out.println("----------------------------------------------------------Test Case 2nd complted ----------------------------------------");

			  
			 
		  }
		  
		  public void Test3() throws InterruptedException
		  {
			  System.out.println("--------------------------------------------------------------------------------------------------");
			 
			  Thread.sleep(5000);
			  job.click();
			  Thread.sleep(5000);
			  list1.click();
			  Thread.sleep(5000);
			  fliter.click();
			  Thread.sleep(5000);
			  ondemand.click();
			  Thread.sleep(5000);
			  fulltime.click();
			  Thread.sleep(5000);
			  close.click();
			  Thread.sleep(5000);
			  System.out.println("-------------------------------------------------------Test case 3rd completed-------------------------------------------");  
			  
		  }
		  public void Test4()throws InterruptedException
		  
		  {
			  System.out.println("--------------------------------------------------------------------------------------------------");
			  chat.click();
		  Thread.sleep(5000);
		  msg.click();
		  Thread.sleep(5000);
		  writemsg.sendKeys("Hi Deja Brady ");
		  Thread.sleep(5000);
		  writemsg.sendKeys(Keys.ENTER);
		  
		  System.out.println("-------------------------------------------------------Test case 4th completed-------------------------------------------");  
	  
		  }
		 
		  public void Test5() throws InterruptedException
		  {
			  System.out.println("--------------------------------------------------------------------------------------------------");  
	  
			  filemanager.click();
			  Thread.sleep(5000);
			 selectcheckbox.click();
			 Thread.sleep(5000);
			 delete.click();
			 Thread.sleep(5000);
			 Delete.click();
			  System.out.println("-------------------------------------------------------Test case 5th completed-------------------------------------------");  
		  }
			 
}
