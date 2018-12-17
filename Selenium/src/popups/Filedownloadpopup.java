package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Filedownloadpopup {
	public static void main(String[] args) {
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("Browser.helperApps.neverAsk,savetoDisk", "application/zip");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "D:\\");
		System.setProperty("webdriver.gecko.driver","d://geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
	}

}
