package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclass {
	WebDriver driver;
	Actions Act;

	   
	
	@FindBy (id="dropOption1")
	 public WebElement linkone;
	
	@FindBy (id="dropOption2")
	 public WebElement linksecond;
	
	@FindBy (id="dropOption3")
	 public WebElement linkThird;
	
	@FindBy(xpath="//h3[text()=\"Link One Selected\"]")
	public WebElement selected1;
	
	@FindBy(xpath="//h3[text()=\"Link Two Selected\"]")
	public WebElement selected2;
	
	@FindBy(xpath="//h3[text()=\"Link Three Selected\"]")
	public WebElement selected3;
	
    
    public  pomclass  (WebDriver driver)
	  {
      	
	      PageFactory.initElements(driver ,this);
	      this.driver=driver;
	  }
    
    public  void HoverDropdown ()
    {
    	 Act =new Actions(driver);
         
    }
    public  void Linkone ()
    {
    	System.out.println(linkone.getText());
    	linkone.click();
    }
    public void Selectone()
    {
    	System.out.println(selected1.getText());
    }
    public  void Linksecond ()
    {
    	System.out.println(linksecond.getText());
    	linksecond.click();
    	
    }
    public void Selectsecond()
    {
    	System.out.println(selected2.getText());
    }
    public  void 	LinkThird ()
    {
    	System.out.println(linkThird.getText());
    	linkThird.click();
    }
    public void SelectThird()
    {
    	System.out.println(selected3.getText());
    }
    
}
