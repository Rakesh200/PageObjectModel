package keyBoard_Mouse_events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Events_with_mouse_kayboard {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	   driver.get("https://www.amazon.com/");
	 
	   
	//   Actions action=new Actions(driver);
	  // WebElement from=driver.findElement(By.partialLinkText("Help"));
	   //action.moveToElement(from);
	  
	   WebElement to=driver.findElement(By.linkText("Careers"));
	    to.click();
		/*action.moveToElement(to);
		action.click();
		action.perform();*/
	}

}
