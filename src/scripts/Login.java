package scripts;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login {
	public WebDriver driver=null;
	@Test
	public void login()throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		try {
		driver.get("https://www.saucedemo.com/");
		System.out.println("Application Opened");
		Thread.sleep(2000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-butt")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		}
		
		catch(Exception e)
		{
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("D:\\nagendra.png"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
