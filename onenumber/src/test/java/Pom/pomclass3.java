package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pomclass3

{
	WebDriver driver;
	
	@FindBy(id="mySelect")
	private WebElement Dropdown;                               //Dropdown
	

	@FindBy(id="meterLabel")
	private WebElement lable;                                    //label
	

	@FindBy(id="radioButton1")
	private WebElement radio1; 
	
	@FindBy(id="radioButton2")
	private WebElement radio2;
	
	@FindBy(id="checkBox1")
	private WebElement Box1;
	
	@FindBy(id="checkBox2")
	private WebElement Box2;
	
	@FindBy(id="checkBox3")
	private WebElement Box3;

	@FindBy(id="checkBox4")
	private WebElement Box4;
	
	@FindBy (id="logo")
    private WebElement pick;
	
	@FindBy(id="drop2")
	private WebElement Drop;

	public  pomclass3  (WebDriver driver)
	  {
	  	
	      PageFactory.initElements(driver ,this);
	      this.driver=driver;
	  }
	
	public void option1()
	{
		Select Dropdown1 = new Select(Dropdown); 
	    Dropdown1.selectByVisibleText("Set to 50%");                                                //selectByValue("Set to 25%");
	    System.out.println(lable.getText()); 
	    Dropdown1.selectByVisibleText("Set to 75%");  
	    System.out.println(lable.getText()); 
	    Dropdown1.selectByVisibleText("Set to 100%");  
	   System.out.println(lable.getText()); 
	   Box1.click();
	   Box2.click();
	   Box3.click();
	   Box4.click();
	   
	  
	}
	public void option2()
	
	{
		if (radio1.isSelected()) 
		{
            System.out.println("Rediobox Box1: " + radio1.isSelected());
          
        }
		else
        {
			System.out.println("Rediobox Box1: " + radio1.isSelected());
        }
		if (radio2.isSelected()) 
		{
            System.out.println("Rediobox Box2: " + radio2.isSelected());
          
		}
		else
        {
			System.out.println("Rediobox Box2: " + radio2.isSelected());
			 radio2.click();
			 System.out.println("now we clicked ");
			 Actions Act= new Actions(driver);
			 Act.dragAndDrop(pick,Drop).build().perform();
			 System.out.println("all done");
        }
	
		
	}
	
	
}
