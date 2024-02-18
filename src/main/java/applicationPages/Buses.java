package applicationPages;

import basePages.Base_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Buses extends Base_page {
    WebDriver driver;

    public Buses(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public By Buses_tab = By.xpath("(//a[@id='booking_engine_buses'])");
    public By place = By.xpath("(//input[@id='BE_bus_from_station'])");
    public By departlist = By.xpath("(//div[@class='ac_results origin_ac'])");

    public By place2 = By.xpath("(//input[@id='BE_bus_to_station'])");
    public By Goinglist = By.xpath("(//div[@class='ac_results dest_ac'])");

    public By datetab = By.xpath("(//input[@id='BE_bus_depart_date'])");
    public By date2 = By.xpath("//td[@id='01/03/2024']");
    public By srcbuses = By.xpath("(//input[@id='BE_bus_search_btn'])");

    public void busestab() {
        click(Buses_tab);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }


    public void destiplace() {
        click(place);
        String text1 = "New Delhi";
        click(place);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(place, text1);
        for (WebElement element : getEl(departlist)) {
            if (element.getText().contains(text1)) {
                element.click();
                break;

            }
        }
    }

    public void goingtoplace() {
        click(place2);
        String text2 = "Mumbai";
        click(place2);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(place2, text2);
        for (WebElement element : getEl(Goinglist)) {
            if (element.getText().contains(text2)) {
                element.click();
                break;


            }
        }

    }

    public void Depart_date() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(datetab);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(date2);

    }

    public void Searchbuses() {
        click(srcbuses);
    }
}
