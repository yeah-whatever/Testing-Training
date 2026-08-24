package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {

    public static WebDriver startBrowser(String browser) {
        WebDriver driver = null;

        if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("GC")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("EG")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox") || browser.equalsIgnoreCase("FF")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            System.out.println("Sorry, we do not support this browser");
        }

        if (driver != null) {
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeBrowser(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
