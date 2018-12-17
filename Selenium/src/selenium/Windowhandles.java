package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		String mainWindow = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Click Here")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		Set<String> handles = driver.getWindowHandles();
		for(String handle: handles)
		{
			System.out.println(handle);
			if(!mainWindow.equals(handle))
				
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("rajeev@gmail.com");	
				break;
			}
		}
		
			
	}
		
		
	}


