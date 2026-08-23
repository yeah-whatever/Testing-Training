package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	public void CapturedScreenShot(WebDriver driver) throws InterruptedException,IOException{
		
		try {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenShots/Application_" + getCurrentDateTime() + ".png"));
		System.out.println("Caputred ScreenShot");
		}catch(Exception e) {
			System.out.println("Exception while Taking ScreenShot" + e.getMessage());
		}
	}
	
	public String getCurrentDateTime() {
		DateFormat customFormate = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentdate = new Date();
		return customFormate.format(currentdate);
	}
	
}