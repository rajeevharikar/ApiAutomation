package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class FlipkartPriceSlider {
	
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
	WebElement ele2 = driver.findElement(By.xpath("//a[@title='Mobiles']"));
	//actions.moveToElement(ele2).build().perform();
	ele2.click();
	WebElement slider = driver.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"));
	WebElement slider2 = driver.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]"));
	Action drag1=(Action) actions.dragAndDropBy(slider, 20,0).build();
	drag1.perform();
	Thread.sleep(2000);
//	Action drag2=(Action) actions.dragAndDropBy(slider2, -30,0).build();
//	drag2.perform();
//	Thread.sleep(2000);
	WebElement wb= driver.findElement(By.xpath("//div[text()='Moto E3 Power (Black, 16 GB)']"));
	boolean b1= wb.isDisplayed();
    System.out.println(b1);
    String text = wb.getText();
    System.out.println(text);
    Assert.assertEquals(text,"Moto E3 Power (Black, 16 GB)");
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].setAttribute('style', 'left: 30%;')",slider);

  }

}