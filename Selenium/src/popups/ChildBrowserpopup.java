package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserpopup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[@href='../articles_popup.php']")).click();
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
		
		Set s1=driver.getWindowHandles();
		s1.remove(mainwindow);//remove the mainwindow handle because it was closing the mainwindow once its loops
		Iterator itr=s1.iterator();
		
		while(itr.hasNext())
		{
			String handles = (String) itr.next();
			System.out.println(handles);
			if(!mainwindow.equalsIgnoreCase(handles))
			{
				driver.switchTo().window(handles);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("rajeev.harikar@gmil.com");
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				//driver.close();
			}
			
			driver.switchTo().window(mainwindow);
			driver.close();
			
		}
		
		
		
	}

}
