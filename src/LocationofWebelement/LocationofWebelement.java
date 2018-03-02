package LocationofWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocationofWebelement {
	
  static WebDriver driver;

	public static void main(String[] args) {
	
		
System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.autoitscript.com/site/autoit-tools/");
		
		WebElement element=driver.findElement(By.xpath("//*[@id='post-93']/h1"));
		
		//////By Using POINT class we can achive the location of element
		
		
		
		Point classname=element.getLocation();
		
		int x=classname.getX();
		
		int y=classname.getY();
		
		System.out.println(element.getText());
		
		System.out.println("Location of X is:"+x +"and Y is:"+y);
		
		
		
	}

}
