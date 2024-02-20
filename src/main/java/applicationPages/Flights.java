package applicationPages;


import basePages.Base_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Flights extends Base_page {
     WebDriver driver;
    public Flights(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public By fly = By.xpath("//a[@id='booking_engine_flights']");
    public By depabox = By.xpath("//input[@id='BE_flight_origin_city']");
    public By depalist = By.xpath("//div[@class='viewport']");
    public By arrivbox = By.xpath("//input[@id='BE_flight_arrival_city']");
    public By arrivlist = By.xpath("//div[@class='viewport']");
    public By depaturebox = By.xpath("//input[@id='BE_flight_origin_date']");
    public By depadate = By.xpath("//td[@id='09/06/2024']");
    public By scrcfly = By.xpath("//div//input[@id='BE_flight_flsearch_btn']");

    public void flighttab() {
        click(fly);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void depature_box() {
        click(depabox);
        String text1 = "kathmandu";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(depabox,text1);
        for (WebElement element : getEl(depalist)) {
            if (element.getText().contains(text1)) {
                element.click();
                break;

            }
        }
    }
    public void arrive_box() {
        click(arrivbox);
        String text2 = "Mumbai";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(arrivbox,text2);
        for (WebElement element : getEl(arrivlist)) {
            if (element.getText().contains(text2)) {
                element.click();
                break;

            }
        }
    }
    public void Depature_date() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(depaturebox);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(depadate);
    }


    public void Searchflight(){
        click(scrcfly);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
