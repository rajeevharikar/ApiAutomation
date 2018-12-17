package framesandactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class javascriptexec {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		WebElement ele = driver.findElement(By.id("loginButton"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//String code="document.getElementById('loginButton').click";
		//not able to click using above string
		jse.executeScript("arguments[0].click();",ele);
		
	}

}
