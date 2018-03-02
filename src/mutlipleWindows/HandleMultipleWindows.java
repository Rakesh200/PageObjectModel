	package mutlipleWindows;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleMultipleWindows {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		
		driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		
		////parent window
		String parentwindow=driver.getWindowHandle();
		System.out.println();
		
		
	    Set<String>total=driver.getWindowHandles();
	    System.out.println(total);
	  int twindows=total.size();
	   
	   for(String handles:total){
		  
		   if(!parentwindow.equalsIgnoreCase(handles)){
			   
			   driver.switchTo().window(handles);
			  
			  System.out.println( driver.getTitle());
			   driver.close();
			 
		   }
	   }
	  
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
	}

}
