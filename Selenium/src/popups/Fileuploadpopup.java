package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadpopup {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.2shared.com/");
		driver.findElement(By.id("upField")).sendKeys("C:\\Users\\Dell Pc\\Downloads\\test store\\new inv.xlsx");

}
}