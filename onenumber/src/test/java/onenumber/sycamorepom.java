package onenumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseclass;
import Pom.pomclass;
import Pom.pomclass2;
import Pom.pomclass3;



public class sycamorepom extends baseclass {
	

	public WebDriver driver;
	public pomclass pom;
	public pomclass2 pom2;
	public pomclass3 pom3;
	
@BeforeTest
	
 public void lunchBrowser() throws InterruptedException {
	
 driver = openChromeBrowser();
 driver.manage().window().maximize();
 driver.navigate().to("https://seleniumbase.io/demo_page");
	}
	
 @Test
 public void over()
 {
	 pom = new pomclass(driver);
	 pom.HoverDropdown ();
	 pom.Linkone();
	 pom.Selectone();
	 pom.HoverDropdown();
	 pom.Linksecond();
	 pom.Selectsecond();
	 pom.HoverDropdown ();
	 pom.LinkThird();
	 pom.SelectThird();
	 
 }
 @Test
 public void over2()
 {
	 pom2 = new pomclass2 (driver);
	 System.out.println("--------------------------------------------------------------");
	 pom2.Test();
	 pom2.Test2();
	 pom2.PreText();
	 pom2.Button();
	 pom2.Button2();
	 pom2.PerSlider();
 }
 
 @Test
 public void over3()
 {
	 pom3=new pomclass3(driver);
	 pom3.option1();
	 pom3.option2();
	 
 }
 
/* import org.testng.annotations.Test;

 import io.restassured.module.jsv.JsonSchemaValidationException;
 import io.restassured.module.jsv.JsonSchemaValidator;


 import com.alibaba.fastjson.JSONObject;

 import static io.restassured.RestAssured.*;

 import java.util.HashMap;

 public class API2 {                                 //https://dummy.restapiexample.com/

 	@Test
 	public void Getdata()
 	{
 		baseURI="https://reqres.in/";
 				when().get("/api/users?page=2").then().assertThat().body(JsonSchemaValidator.
 						matchesJsonSchemaInClasspath("schema.json")).statusCode(200).log().all();
 			
 				System.out.println("----------------------------------------------------------------");
 				
 	}
 	
 /*	@Test
 	public void creatdata()
 	{
 		baseURI="https://reqres.in";
 		JSONObject data= new JSONObject();
 		data.put("name","morpheus");   
 	    data.put("job", "leader");
 		
 		
 		given().contentType("Application/json").body(data).when().post("/api/users").then().log().all();
 		System.out.println("--------------------------------------------------------------");
 	}
 	
 	@Test
 	public void put()
 	{
 		baseURI="https://reqres.in";
 		HashMap data1= new HashMap();
 		data1.put("name","Mark");   
 	    data1.put("job", "Design"); 
 	
 		
 		given().contentType("Application/json").body(data1).when().put("/api/users/512").then().log().all();
 				
 	}
 	
 	@Test
 	public void postdata()
 	{

 		baseURI="https://reqres.in";
 		JSONObject data= new JSONObject();
 		data.put("email", "eve.holt@reqres.in");   
 	    data.put("password","pistol");
 		
 		
 		given().contentType("Application/json").body(data).when().post("/api/register").then().log().all();
 	}
 	@Test
 	public void postdatafail()
 	{

 		baseURI="https://reqres.in";
 		JSONObject data3= new JSONObject();
 		data3.put("email", "dney@fife");   
 	   given().contentType("Application/json").body(data3).when().post("/api/register").then().statusCode(400).log().all();
 	}*/
 	
 }



