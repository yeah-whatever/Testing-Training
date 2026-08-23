package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	WebDriver driver;
	
	@Test
	public static WebDriver startBrowser(WebDriver driver, String browser, String Appurl) {
		if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("GC")
				|| browser.equalsIgnoreCase("Google Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("EG")
				|| browser.equalsIgnoreCase("Microsoft Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("FireFox") || browser.equalsIgnoreCase("EG")
				|| browser.equalsIgnoreCase("Mozilla Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Sorry we do not support this browser");
		}
		driver.get(Appurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	public static WebDriver BrowserOptions(WebDriver driver, String browser, String appURL) {
		// TODO Auto-generated method stub
		return null;
	}
}