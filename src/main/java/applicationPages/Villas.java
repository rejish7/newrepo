package applicationPages;

import basePages.Base_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Villas extends Base_page {
    WebDriver driver;
    public Villas (WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public By place1 = By.xpath("(//input[@name='BE_hotel_destination'])[1]");
    public By placelist = By.xpath("(//div[@class='viewport'])[1]");
    public By checkin1 = By.xpath("(//input[@id='BE_hotel_checkin_date'])[1]");
    public By entrydate1 = By.xpath("(//td[@id='01/03/2024'])[1]");
    public By checkout1 = By.xpath("(//input[@id='BE_hotel_checkout_date'])[1]");
    public By exitdate1 = By.xpath("(//td[@id='05/03/2024'])[1]");
    public By  srcvilla = By.xpath("(//input[@id='BE_hotel_htsearch_btn'])[1]");



    public void Villatab() {
        WebElement more = driver.findElement(By.xpath("//*[@id=\"bEnginePos\"]/ul/li[7]/span"));
        WebElement villa = driver.findElement(By.xpath("//a[@id='booking_engine_homestays']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        actions.click(more).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        villa.click();
    }

    public void Hotelplace() {
        click(place1);
        String text1 = "Pune, Maharashtra, India";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(place1,text1);
        for (WebElement element : getEl(placelist)) {
            if (element.getText().contains(text1)) {
                element.click();
                break;

            }
        }
    }
    public void checkindate() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        click(checkin1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        click(entrydate1);
    }
    public void checkoutdate() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        click(checkout1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(exitdate1);
    }
    public void search_villas(){
        click(srcvilla);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }



}

