package framesandactionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zoho.com/crm/lp/login.html");
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		int size = frame.size();
		System.out.println(size);
		for(int i=0;i<=size;i++)
		{
			driver.switchTo().frame(i);
		    driver.findElement(By.xpath("//input[@type='email']"));
			
			System.out.println("element displayed");
		    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("raj@gmail.com");
			driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("12345678");
			driver.findElement(By.xpath("//button[@id='submit_but']")).click();
			}
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@href='/crm/features.html?src=feahr'])[1]")).click();
		
		//driver.switchTo().frame("zohoiam");
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("raj@gmail.com");
//		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("12345678");
//		driver.findElement(By.xpath("//button[@id='submit_but']")).click();
//		
		
	}

}
