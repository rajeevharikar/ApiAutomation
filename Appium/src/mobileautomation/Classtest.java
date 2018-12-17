package mobileautomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Classtest {
	
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		
	
	{
		DesiredCapabilities capbilities=new DesiredCapabilities().android();
		
		capbilities.setCapability("BROWSER_NAME", "Android");
		capbilities.setCapability("VERSION", "6.0");
		capbilities.setCapability("deviceName", "HKE6L075");
		capbilities.setCapability("platformName", "Android");
		capbilities.setCapability("appPackage", "com.android.calculator2");
		capbilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		WebDriver driver =new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capbilities);
		
	
	
		WebElement two= driver.findElement(By.name("4"));
		two.click();
		
		WebElement plus=driver.findElement(By.name("+"));
		plus.click();
		
		WebElement four=driver.findElement(By.name("4"));
		four.click();
		
		WebElement equalto=driver.findElement(By.name("="));
		equalto.clear();
		driver.quit();
		
	}
	
	}
	
}
