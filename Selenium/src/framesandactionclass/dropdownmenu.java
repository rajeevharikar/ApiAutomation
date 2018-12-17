package framesandactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdownmenu {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.zoho.com/crm/lp/login.html"); 
	Actions action=new Actions(driver);
    WebElement finance = driver.findElement(By.xpath("//a[text()='Finance']"));
    action.moveToElement(finance).perform();

	

}
}