package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		 List<WebElement> chkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		driver.findElement(By.xpath("//a[text()='All']")).click();
		Thread.sleep(2000);
		for(int i=0;i<=chkBox.size();i++)
	   {
			chkBox.get(i);
		if(chkBox.get(i).isEnabled())
		{
			if(chkBox.get(i).isSelected())
			{
				chkBox.get(i).click();
				
			}
			else
			{
				chkBox.get(i).click();
			}
		}
		}
	
	}

}
