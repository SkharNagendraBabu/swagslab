package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DargAndDrop {
	
	public WebDriver driver=null;
	@Test
	public void draganddrop()throws Exception{
		
System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_Drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		System.out.println("Application Opened");
		System.out.println("Title:" + " " +driver.getTitle());
		System.out.println("URL:" + " "+driver.getCurrentUrl() );
		
		Assert.assertEquals(driver.getTitle(),"Droppable | jQuery UI");
		
		driver.switchTo().frame(0);
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.close();
		
		
		
		
		
		
		
		
		
		}

}
