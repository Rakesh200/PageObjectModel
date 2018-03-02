package handling_date_time;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Date_Time_set {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
   driver.get("http://demo.guru99.com/selenium/");	
   
	
   WebElement element=driver.findElement(By.xpath("//input[@name='bdaytime']"));
   element.sendKeys("13/10/1991");
   
   //we set date by following line  .sendkeys(keys.TAB)
   element.sendKeys(Keys.TAB);
   element.sendKeys("12:01 PM");
   
   
   driver.findElement(By.xpath("//input[@type='submit']")).click();
   
   
   System.out.println(driver.getCurrentUrl());

	
	}
	

}
