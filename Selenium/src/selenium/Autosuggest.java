package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {
	
	public static void main(String[] args) {
		
    Logger logger = Logger.getLogger("Autosuggest");
	PropertyConfigurator.configure("log4j.properties");
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	logger.info("browser opened");
	driver.get("http://www.google.com");
	logger.info("google opened");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Selenium");
	String sel="//div[contains(text(),'selenium')]";
	
	List<WebElement> Allast = driver.findElements(By.xpath(sel));
	logger.info("got the list");
	
	int size=Allast.size();
	
	System.out.println(size);
	
	for(int i=0;i<size;i++)
	{
		String text = Allast.get(i).getText();
		
		System.out.println(text);
		if(text.contains("webdriver"))
		{
			Allast.get(i).click();
			break;
		}
	}
	
	driver.close();
	
	

}
}