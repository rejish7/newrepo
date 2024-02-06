package testBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreports {
    public static void main(String[] args) {
        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("D:\\intellij\\Automation-evening\\20240131");
        extentReports.attachReporter(sparkReporter);
        extentReports.flush();

    }
}
