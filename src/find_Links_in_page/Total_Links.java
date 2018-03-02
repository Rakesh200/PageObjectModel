package find_Links_in_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Total_Links {

	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	   driver.get("https://www.complaintboard.in/new_complaint/#images");
	   
	   
	   
	   //////// to find links
	   List<WebElement>links =driver.findElements(By.tagName("a"));
	   System.out.println(links.size());
	   
	   
	   int total=links.size();
	   
	   try {
		for(int i=0;i<=total;i++){
			   
			   System.out.println(links.get(i).getText());
		   }
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	   
	   driver.findElement(By.id("company")).sendKeys("karthik");
	   driver.findElement(By.id("subject")).sendKeys("jobs");
	   Select select =new Select(driver.findElement(By.id("category")));
	      System.out.println( select.getOptions());
	   select.selectByValue("12");
	
	   Select select1 =new Select(driver.findElement(By.id("country")));
	   
	   select.selectByIndex(0);
	   Select select2 =new Select(driver.findElement(By.id("state")));
	   
	   select2.selectByValue("120");
	  WebElement text= driver.findElement(By.id("text"));
			  
			  
			  
			  text.sendKeys("Dear Sir,  Am Karthik 26years old am a resident of hyderabad and am a un-emplyeed person,"
	   		+ "like wise me there are so many people who are un-employee,our state ranks 2 position in un-employement ");
	   		
	   		
	   		
	   		
	   		
	   		
	   		
	   	text.sendKeys(Keys.TAB.CONTROL);
	   	text.sendKeys(""+ "+Thank you,");
	  text.sendKeys( "G.karthik");
	  
	  
	  WebElement upload=driver.findElement(By.xpath("//input[@name='image']"));
	  upload.sendKeys("C:\\Users\\RAKESH\\Downloads\\New Doc 3_1.jpg");
	  
	  //driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[5]")).click();
	  
	  
	}

}
