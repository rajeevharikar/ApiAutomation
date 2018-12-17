package testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.Exceldata;
import excel.UsingForloop;

public class DataproviderEx {
	
	WebDriver driver;
//	@BeforeClass
//	public void preCondition()
//	{
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.get("https://accounts.google.com/");
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	}
	
	@Test(dataProvider="getData")
	public void loginWithDataProvoider(String usn, String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://accounts.google.com/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("login1" +usn);
		System.out.println("login1" +pwd);
		driver.findElement(By.id("Email")).sendKeys(usn);
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys(pwd);
		driver.findElement(By.id("signIn")).click();
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//getting data from the excel sheet and
		Object[][] obj = UsingForloop.getArray();
//		
//		obj[0][0]="rajeev@cognitiveclouds.com";
//		obj[0][1]="password";
//		
//		obj[1][0]="rajeev.harikar@gmail.com";
//		obj[1][1]="password";
//		
//		obj[2][0]="santhosh@gmail.com";
//		obj[2][1]="1234567890";
				
		return obj;
		
	}
	
	
	
//	@AfterClass
//	public void postCondition()
//	{
//		driver.close();
//	}
//	

}
