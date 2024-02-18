package applicationPages;

import basePages.Base_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Holidays extends Base_page {

   WebDriver driver;
    public Holidays(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public By holidayta = By.xpath("(//a[@id='booking_engine_holidays'])[1]");
    public By holidepart = By.name("BE_holiday_leaving");
    public By holidest = By.name("holiday_destination");
    public By serholiday = By.xpath("(//input[@id='BE_holiday_search_btn'])[1]");
    public By depatList = By.xpath("(//div[@class='viewport'])");
    public By destList = By.xpath("(//div[@class='viewport'])");

    public void holidaytabs(){
        click(holidayta);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void holiday_depature() {
        String text1 = "Mumbai";
        click(holidepart);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        send_keys(holidepart,text1);
        for (WebElement element : getEl(depatList)) {
            if (element.getText().contains(text1)) {
                element.click();
                break;
            }
        }
    }
    public void holiday_destination(){
        String text2 = "Dubai";
        click(holidest);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        send_keys(holidest,text2);
        for (WebElement element : getEl(destList)) {
            if (element.getText().contains(text2)) {
                element.click();
                break;
            }
        }
    }
    public void search_holiday() throws InterruptedException {
        click(serholiday);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }



}

