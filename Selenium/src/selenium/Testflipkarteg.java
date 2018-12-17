package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testflipkarteg {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=Samsung%20TV&otracker=start&as-show=off&as=off");
		WebElement ele = driver.findElement(By.xpath("(//a[contains(text(),'SAMSUNG 101cm (40) Full HD')])[1]"));
		String str = ele.getText();
		System.out.println(str);
		driver.close();
	}

}
