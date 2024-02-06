package applicationPages;

import basePages.Base_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.testng.Reporter.clear;

public class Hotels extends Base_page {

    WebDriver driver;
    public Hotels (WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public By hoteltab = By.xpath("(//a[@id='booking_engine_hotels'])[1]");
    public By place = By.xpath("(//input[@id='BE_hotel_destination_city'])[1]");
    public By hotellist = By.xpath("(//div[@class='viewport'])[1]");
    public By checkin = By.xpath("(//input[@id='BE_hotel_checkin_date'])[1]");
    public By entrydate = By.xpath("//td[@id='01/02/2024']");
    public By checkout = By.xpath("(//input[@id='BE_hotel_checkout_date'])[1]");
    public By exitdate = By.xpath("//td[@id='05/02/2024']");
    public By  srchotel= By.xpath("(//input[@id='BE_hotel_htsearch_btn'])[1]");


    public void hoteltab() {
        click(hoteltab);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    public void destinationplace() {

        click(place);
        clear();
        String text1 = "New Delhi";
        click(place);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(place,text1);
        for (WebElement element : getEl(hotellist)) {
            if (element.getText().contains(text1)) {
                element.click();
                break;

            }
        }
    }
    public void checkindate() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(checkin);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(entrydate);
    }
    public void checkoutdate() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(checkout);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(exitdate);
    }
    public void search_hotel(){
        click(srchotel);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
}
