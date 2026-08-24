package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	 static WebDriver driver;
	 
	 public static WebDriver BrowserOptions(String browser , String Url) {

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
	driver.get(Url);

	return driver;

}
}
