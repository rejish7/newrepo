package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Handlingalerts {
     WebDriver driver;

    public void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     //   driver.get();
        Thread.sleep(5000);

        driver.findElement(By.id("")).click();
        Thread.sleep(3000);
        Alert alert = driver .switchTo().alert();
        Thread.sleep(4000);
        alert.accept();





    }

}
