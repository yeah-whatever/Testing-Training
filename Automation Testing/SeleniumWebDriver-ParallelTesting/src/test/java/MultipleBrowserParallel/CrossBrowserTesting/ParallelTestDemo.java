package MultipleBrowserParallel.CrossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class ParallelTestDemo {
    WebDriver driver;
    String baseurl = "https://practicetestautomation.com/practice-test-login/";

    @Parameters("browserName")
    @BeforeTest
    public void setUp(String browserName) {
        System.out.println("Browser Name is " + browserName);

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
    }

    @Test
    public void BrowserTest() throws Exception {
        driver.get(baseurl);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.name("password")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }

    @AfterTest
    public void tearDown() {
            driver.quit();
    }
}
