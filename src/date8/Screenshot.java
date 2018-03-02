package date8;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	public static WebDriver driver;
	
	public static void main (String args[]) throws IOException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		File SrcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(SrcFile, new File("C:\\Users\\RAKESH\\Desktop\\Testing\\ScreenShot.png"));
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int size=links.size();
		System.out.println(links.size());
		
		for (int i=0;i<size;i++){
			System.out.println(links.get(i).getText());
			
			
			
		}
		
		
		
	}

}
