package popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Windowpopautoit {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","d://geckodriver.exe");
		//DesiredCapabilities cap = DesiredCapabilities.firefox();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
	    try {
			Runtime.getRuntime().exec("D://filedwd.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
