package SeleniumWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
	//The browsers are executed in alphabetical order if we don't give assign any priority i.e., the browsers are opened in the order of Chrome,Edge,Firefox irrespective of where they are placed in the code
	@Test(priority = 0)
	public void EdgeBrowserTest() throws Exception{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().window().minimize();
	}
	@Test(priority = 2)
	public void ChromeBrowserTest() throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().window().minimize();
	}
	@Test(priority = 1)
	public void FirefoxBrowserTest() throws Exception{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.manage().window().minimize();
	}
	
}

