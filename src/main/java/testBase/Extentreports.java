package testBase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
public  class Extentreports extends Browser {

    String path1 = System.getProperty("user.dir") + File.separator + "Extentreports" + File.separator + "";
    public  void main() {
        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(path1);
        extentReports.attachReporter(sparkReporter);
        openBrowser("chrome","https://www.yatra.com/");

        extentReports.flush();

    }
}
