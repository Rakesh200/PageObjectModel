package constructorsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class constructorsInSelenium {

	
	WebDriver driver;			
	
	
	public constructorsInSelenium(WebDriver driver){
System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		this.driver=driver;
		
		driver=new FirefoxDriver();
	     driver.get("https://www.autoitscript.com/site/autoit-tools/");
	}
	
	public static void main(String[] args) {
		//constructorsInSelenium obj=new constructorsInSelenium();
		

	}

}
