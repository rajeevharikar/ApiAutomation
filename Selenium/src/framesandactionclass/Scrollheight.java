package framesandactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollheight {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.divorceforce.com");
		driver.findElement(By.xpath("//a[@href='/accounts/sign_in']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rajeev.harikar@gmail.com");
		driver.findElement(By.xpath("//input[@name='account[password]']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//scrolls to bottom of the page
		Thread.sleep(2000);
	}

}
