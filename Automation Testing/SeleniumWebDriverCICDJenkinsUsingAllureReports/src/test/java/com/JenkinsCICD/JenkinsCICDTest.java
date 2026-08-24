package com.JenkinsCICD;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsCICDTest {
	@Test
	public class BrowserCommands {

		@Test(priority = 0)
		public void EdgeBrowserTest() throws InterruptedException {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://automationexercise.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 1)
		public void FirefoxBrowserTest() throws InterruptedException {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.selenium.dev/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 2)
		public void ChromeBrowserTest() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 3)
		public void EdgeBrowserTest2() throws InterruptedException {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.demoblaze.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 4)
		public void FirefoxBrowserTest2() throws InterruptedException {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 5)
		public void ChromeBrowserTest2() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 6)
		public void EdgeBrowserTest3() throws InterruptedException {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 7)
		public void FirefoxBrowserTest3() throws InterruptedException {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 8)
		public void ChromeBrowserTest3() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.wikipedia.org/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 9)
		public void EdgeBrowserTest4() throws InterruptedException {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.github.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 10)
		public void FirefoxBrowserTest4() throws InterruptedException {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.linkedin.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 11)
		public void ChromeBrowserTest4() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 12)
		public void EdgeBrowserTest5() throws InterruptedException {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.myntra.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 13)
		public void FirefoxBrowserTest5() throws InterruptedException {
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.irctc.co.in/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}

		@Test(priority = 14)
		public void ChromeBrowserTest5() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.ajio.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.manage().window().minimize();
		}
	}
}