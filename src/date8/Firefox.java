package date8;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Firefox {

	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");

		driver=new FirefoxDriver();
		driver.get("https://ibank.standardchartered.co.in/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
			driver.findElement(By.partialLinkText(" Instant Registration ")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.name("j_username")).sendKeys("9866968802");
		driver.findElement(By.name("j_password")).sendKeys("karthik425");
		driver.findElement(By.name("Login")).click();
		
		File Screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Screen, new File("C:\\Users\\RAKESH\\Desktop\\Testing\\SCbScreenShot.png"));
		
	List<WebElement>links=	driver.findElements(By.tagName("a"));
	int total=links.size();
		System.out.println(total);
		
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}
		
		
		driver.findElement(By.name("Logout")).click();
			System.out.println(driver.findElement(By.className("logout")).getText());
			
			
		
}
}	

	
