package framesandactionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://drive.google.com");
		driver.findElement(By.id("Email")).sendKeys("rajeev.harikar@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("password");
		driver.findElement(By.id("signIn")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='WishClouds TestSuite']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
	}
	

}
