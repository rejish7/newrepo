package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class screenshots {
    public static WebDriver driver;

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.get("https://www.yatra.com/");
        driver.manage().window().maximize();

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcfile = screenshot.getScreenshotAs(OutputType.FILE);

        File destfile = new File( System.getProperty("user.dir") + File.separator + "Sereenshots");

        try{
            FileUtils.copyFile(srcfile,destfile);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
