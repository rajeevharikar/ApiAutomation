package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicElement {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","d://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Dell%20Pc/Desktop/test2.html");
		List<WebElement> spnlist = driver.findElements(By.xpath("//span"));
		for(int i=0;i<=spnlist.size()-1;i++)
		{
//			String str=spnlist.get(i).getText();
//			System.out.println(str);
			if(i==spnlist.size()-1)
			{
				String str=spnlist.get(i).getText();
     			System.out.println(str);
			}
			
		}
	}

}
