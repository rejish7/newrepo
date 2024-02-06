package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.time.Duration;

public class actionclass {
    public static WebDriver driver;

    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://yatra.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement element = driver.findElement(By.xpath("(//input[@id='BE_flight_origin_date'])"));
        WebElement element2 = driver.findElement(By.xpath(""));
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.click(element).build().perform();
        Thread.sleep(2000);
        element2.click();


    }
}
