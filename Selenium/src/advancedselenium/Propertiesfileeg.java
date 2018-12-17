package advancedselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertiesfileeg {
	
	public static void main(String[] args) throws IOException {
		
		
		
		File file=new File("D:/MyPractice/Selenium/common_data.properties");
		FileInputStream fis= new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String str = prop.getProperty("URL");
		System.out.println(str);
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.xpath(prop.getProperty("Srchbox.xath"))).sendKeys(prop.getProperty("Srch"));
		driver.findElement(By.xpath(prop.getProperty("Srchbox.xath"))).sendKeys(Keys.ENTER);
		
	}

}
