package find_Links_in_page;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLinks {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception   {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/gmail/");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("The total links available in the page is::"+links.size());
		
		
					
	for (int i = 0; i < links.size(); i++) {
		System.out.println(links.get(i).getText());
			}
  

     driver.findElement(By.id("identifierId")).sendKeys("karthik.ganapathi91@gmail.com");
     driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/div[2]")).click();
	
     Thread.sleep(5000);
     
     driver.findElement(By.name("password")).sendKeys("gmail@karthik");
     driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();
     System.out.println(driver.getTitle());
     
     try {
		driver.switchTo().frame(2);
		 driver.findElement(By.name("q")).sendKeys("resume");
	} catch (Exception e) {
		
		e.printStackTrace();
	}
     
     List<WebElement>iframes=driver.findElements(By.tagName("iframe"));
     System.out.println(iframes.size());
    
     for(int i=0;i<iframes.size();i++){
    	 System.out.println(iframes.get(i).getText());
     }
     
     
     
     
     
     
	}

}
