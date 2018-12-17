package mobileautomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class testmobile {
	
	WebDriver driver;
	
	@BeforeClass
	public void testmethod() throws MalformedURLException
	{
		DesiredCapabilities capbilities=new DesiredCapabilities().android();
		
		capbilities.setCapability("BROWSER_NAME", "Android");
		capbilities.setCapability("VERSION", "6.0");
		capbilities.setCapability("deviceName", "9SMZQCUKRKOBLJBE");
		capbilities.setCapability("platformName", "Android");
		capbilities.setCapability("appPackage", "com.shopgro.apps.retailer");
		capbilities.setCapability("appActivity", "com.shopgro.apps.retailer.activities.HomepageActivity");
		
		driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capbilities);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void testcal()
	{
		WebElement two= driver.findElement(By.name("4"));
		two.click();
		
		WebElement plus=driver.findElement(By.name("+"));
		plus.click();
		
		WebElement four=driver.findElement(By.name("4"));
		four.click();
		
		WebElement equalto=driver.findElement(By.name("="));
		equalto.clear();
		
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}

}
