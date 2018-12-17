package framesandactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.divorceforce.com");
		driver.findElement(By.xpath("//a[@href='/accounts/sign_in']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rajeev.harikar@gmail.com");
		driver.findElement(By.xpath("//input[@name='account[password]']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		for(int i=0;i<=10;i++)
		{
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		}
	}
}
