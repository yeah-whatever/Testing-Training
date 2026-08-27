package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TheInternet.TestCases.BaseClass;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {

        Object testObject = result.getInstance();

        if (testObject instanceof BaseClass) {

            BaseClass baseClass = (BaseClass) testObject;

            Helper.captureScreenshot(
                    baseClass.driver,
                    result.getName());
        }
    }
}