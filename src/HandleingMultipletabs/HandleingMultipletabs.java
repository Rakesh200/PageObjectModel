package HandleingMultipletabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleingMultipletabs {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		
		driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/");
		
		String parent=driver.getWindowHandle();
		
		System.out.println("parent window id:"+parent);
		driver.findElement(By.name("link1")).click();
		//driver.findElement(By.xpath("//*[@id='post-body-6170641642826198246']/a[2]")).click();
	
		
		Set<String>allwindows=driver.getWindowHandles();

		System.out.println("parent set all windows id:"+allwindows);
		
		
		for(String child:allwindows)
		{
			
			if(!parent.equalsIgnoreCase(child)){
				
				driver.switchTo().window(child);
				
				driver.findElement(By.name("q")).sendKeys("karthik");
				
			}
	
		}
		
		
	}

}
