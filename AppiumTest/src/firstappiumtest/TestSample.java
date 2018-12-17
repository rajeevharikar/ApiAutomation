package firstappiumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSample {
	
	WebDriver driver;
	
	@BeforeClass
	public void setBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testProgram()
	{
		System.out.println("printing output");
	}

	@AfterClass
	public void close()
	{
		driver.close();
	}
}
