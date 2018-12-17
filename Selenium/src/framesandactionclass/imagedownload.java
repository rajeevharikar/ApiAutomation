package framesandactionclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class imagedownload {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		WebElement img = driver.findElement(By.xpath("//img[@src='/img/default/login/timer.gif?hash=970234804']"));
        Actions action=new Actions(driver);
        action.contextClick(img).build().perform();
        action.sendKeys(Keys.CONTROL,"v").build().perform();
        Thread.sleep(3000);
        Robot robot = new Robot();
        // To press D key.
        robot.keyPress(KeyEvent.VK_D);
        // To press : key.
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        // To press \ key.
        robot.keyPress(KeyEvent.VK_BACK_SLASH);
        // To press "test" key one by one.
        robot.keyPress(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_T);
        // To press Save button.
        robot.keyPress(KeyEvent.VK_ENTER);  
       }
 	
	}


