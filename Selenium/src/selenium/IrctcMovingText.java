package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcMovingText {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@value='Close']")).click();
		WebElement link = driver.findElement(By.xpath("(//img[@src='/eticketing/javax.faces.resource/irctc_logo_en_IN.gif.jsf?ln=images']/../..//marquee)[1]"));
		String val = link.getText();
		System.out.println(val);
}
	
}
