package selenium;

import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxinSet {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement listbox = driver.findElement(By.xpath("//select[@id='month']"));
		Select sltm= new Select(listbox);
		List<WebElement> alloptions = sltm.getOptions();
		HashSet<WebElement> s1=new HashSet<WebElement>();
		for(int i=0;i<alloptions.size();i++)
		{
			s1.add(alloptions.get(i));
		}
		
		for(Object o1:s1){
			WebElement wb=(WebElement)o1;
			String str=wb.getText();
			System.out.println(str);
			
			}
		driver.close();
}
}
