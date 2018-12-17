package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement listbox = driver.findElement(By.xpath("//select[@id='month']"));
		Select sltm= new Select(listbox);
		List<WebElement> alloptions = sltm.getOptions();
		String month="May";
		int count=0;
		String text;
		for(int i=0;i<alloptions.size();i++)
		{   
			 text= alloptions.get(i).getText();
			if(text.equalsIgnoreCase(month))
			{
				count++;
			}
			System.out.println(text);
		}
			if(count==0)
			{
				System.out.println(month+"option not found"+count);
			}
			else if(count==1)
			{
				System.out.println(month+"option found but not duplicate"+count);

			}
			else if(count>1)
			{
				System.out.println(month+"option is found, but dupicate"+count);
			}
			//listbox.click();
			sltm.selectByVisibleText(month);
		
            driver.close();
	}

		
	}



