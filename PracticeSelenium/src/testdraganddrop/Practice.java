package testdraganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	
	 public static void main(String args[]) throws InterruptedException{
		 WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/Users/rajeevsharikar/Documents/Meesho/meesho/browserDrivers/chromedriver");
	driver = new ChromeDriver();
   	driver.get("http://quickfuseapps.com");
   	driver.findElement(By.xpath("//a[@id='link-create']")).click();
   	Thread.sleep(5000);
   	driver.findElement(By.xpath("//div/button[contains(text(),'get start')]")).click();
   	driver.findElement(By.xpath("(//a[@title='Add'])[1]")).click();
   	WebElement source=driver.findElement(By.xpath("//div[@class='syn-node ui-draggable syn-node-active']"));
   	
   	Actions action = new Actions(driver);
   	action.dragAndDropBy(source, 100, 200).build().perform();
   	
   	
	}

	
	
	
		

}
