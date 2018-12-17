package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraDatePicker {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//input[@placeholder='Depart Date']")).click();
		driver.findElement(By.xpath("(//a[text()='May '])[1]")).click();
		driver.findElement(By.xpath("(//a[@id='a_2017_5_21'])[1]")).click();
	}

}
