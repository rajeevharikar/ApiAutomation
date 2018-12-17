package framesandactionclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexec2 {

	// printing the domain name,title of the page and url 
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String domain = jse.executeScript("return document.domain").toString();
		System.out.println("domain name=" +domain);
		String title = jse.executeScript("return document.title").toString();
		System.out.println("Webpage title =" +title);
		String url = jse.executeScript("return document.URL").toString();
		System.out.println("Url is" +url);
		jse.executeScript("window.location = 'http://demo.guru99.com/'");
	}
}
