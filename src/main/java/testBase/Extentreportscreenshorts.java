//package testBase;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.io.IOException;
//
//public class Extentreportscreenshorts {
//    public static class ExtentAttachScreenShots {
//        static WebDriver driver;
//
//        public static String captureScreenShot(String filename) {
//            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//            File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//            File destFile = new File("C:/intellij/Automation-evening/Screenshots/"+filename);
//            String absolutepath = destFile.getAbsolutePath();
//
//            try {
//                FileUtils.copyFile(sourceFile,destFile);
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }
//            System.out.println("Screenshot was taken successfully");
//
//            return absolutepath;
//        }
//
//        public static String captureScreenShot1(String filename){
//            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//            String  base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
//            System.out.println("Screenshot was saved successfully");
//            return base64Code;
//
//        }
//
//        public static void main(String[] args) {
//            ExtentReports extentReports = new ExtentReports();
//            File file = new File("report.html");
//            ExtentSparkReporter sparkReporter =new ExtentSparkReporter(file);
//            extentReports.attachReporter(sparkReporter);
//            WebDriverManager.chromedriver().setup();
//            driver= new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://www.yatra.com/");
//
//
//            String pathScreenshot = captureScreenShot("yatra.png");
//            String base64code = captureScreenShot1("test 1.png");
//
//
//
//
//            extentReports
//                    .createTest("Screenshot Test 1","This screenshot attached in a test level")
//                    .info("This is an info message")
//                    .addScreenCaptureFromPath(pathScreenshot);
//
//            extentReports
//                    .createTest("Screenshot Test 2","This screenshot attached in a test level")
//                    .info("This is an info message")
//                    .addScreenCaptureFromPath(pathScreenshot,"Yatra Title");
//
//            extentReports
//                    .createTest("Screenshot Test 3","This screenshot attached in a test level")
//                    .info("This is an info message")
//                    .addScreenCaptureFromBase64String(base64code,);
//
//            extentReports
//                    .createTest("Screenshot Test 4","This screenshot attached in a test level")
//                    .info("This is an info message")
//                    .addScreenCaptureFromBase64String(base64code,"Yatra Home Page");
//
//            extentReports.flush();
//            driver.quit();
//        }
//    }
//}
