package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivpop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[@class='selctdate'])[1]")).click();
		WebElement popup=driver.findElement(By.xpath("//div[@class='calender_heading ui-datepicker-title clearfix']"));
        if(popup.isDisplayed()){
        	System.out.println("popup is displayed");
        }
        else
        {
        	System.out.println("pop up is not displayed");
        }
        
        driver.findElement(By.xpath("//td[contains(@class,'today')]")).click();
        driver.close();
        }
		
	}
	

