package com.DataDriven.TestDemo;

import java.io.FileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.opencsv.CSVReader;
import utility.Helper;

public class CSVFileReading {
    WebDriver driver;
    String formUrl = "https://only-testing-blog.blogspot.com/2014/05/form.html";
    String csvPath = "C:\\AutomationWorkspace\\SeleniumWebDriver-DataDrivenTesting\\CsvFileReading\\CSVFile.csv";

    @BeforeTest
    public void setup() {
        driver = Helper.startBrowser("Chrome"); 
        driver.get(formUrl);
    }

    @Test
    public void DDTTestingBlog() throws Exception {
        CSVReader reader = new CSVReader(new FileReader(csvPath));
        String[] csvCell;

        while ((csvCell = reader.readNext()) != null) {
            String FName = csvCell[0];
            String LName = csvCell[1];
            String Email = csvCell[2];
            String MNumb = csvCell[3];
            String CName = csvCell[4];

            driver.findElement(By.id("FirstName")).clear();
            driver.findElement(By.id("FirstName")).sendKeys(FName);

            driver.findElement(By.name("LastName")).clear();
            driver.findElement(By.name("LastName")).sendKeys(LName);

            driver.findElement(By.id("EmailID")).clear();
            driver.findElement(By.id("EmailID")).sendKeys(Email);

            driver.findElement(By.name("MobNo")).clear();
            driver.findElement(By.name("MobNo")).sendKeys(MNumb);

            driver.findElement(By.name("Company")).clear();
            driver.findElement(By.name("Company")).sendKeys(CName);

            Thread.sleep(2000); 
        }
        reader.close();
    }

    @AfterTest
    public void tearDown() {
        Helper.closeBrowser(driver);
    }
}
