package framesandactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextmenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		Actions action= new Actions(driver);
		action.contextClick(link).perform();
		Thread.sleep(2000);
		action.sendKeys("w").perform();
		
		
	}
}
