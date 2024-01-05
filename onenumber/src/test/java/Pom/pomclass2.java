package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclass2 {
	WebDriver driver;
	
@FindBy(id="myTextInput")
private WebElement text;

@FindBy (id="myTextarea")
private WebElement text2;

@FindBy (id="myTextInput2")
private  WebElement pretext;

@FindBy (id="myButton")
private WebElement button;

@FindBy (id="readOnlyText")
private WebElement button2;

@FindBy (id="progressLabel")
private WebElement percentage;

@FindBy (id="mySlider")
private WebElement slider;

public  pomclass2  (WebDriver driver)
  {
  	
      PageFactory.initElements(driver ,this);
      this.driver=driver;
  }

public  void Test()
{
	 text.sendKeys("Arun");
}
public  void Test2()
{
	 text2.sendKeys("Patil");
}

public  void PreText()
{
	pretext.clear();
	pretext.sendKeys("All Done");
}
public  void Button()
{
	button.click();
}
public  void Button2()
{
	
	System.out.println(button2.getAttribute("value"));
}
 
//public void Slider()
//{
//	slider.click();
//}
public void PerSlider()
{
	System.out.println(percentage.getText());
}


}
