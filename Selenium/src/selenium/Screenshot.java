package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		


    System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://52.32.149.146/users/sign_in");
	EventFiringWebDriver e= new EventFiringWebDriver(driver);
	
	File src= e.getScreenshotAs(OutputType.FILE);
	File dest=new File("d://raj.png");
	FileUtils.copyFile(src, dest);
	driver.close();
	}
	
}