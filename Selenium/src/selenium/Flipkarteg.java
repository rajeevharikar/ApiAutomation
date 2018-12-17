package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkarteg {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[@title='Electronics']"));
		boolean b = ele.isDisplayed();
		System.out.println(b);
		Actions actions= new Actions(driver);
		actions.moveToElement(ele).perform();
		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.xpath("(//span[text()='Samsung'])[1]"));
		ele2.click();
		//Independent dependent concept
		WebElement link = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy On Nxt (Gold, 32 GB)']/../..//div[@class='_1vC4OE _2rQ-NK']"));
        String val = link.getText();
        System.out.println(val);
	}

}
