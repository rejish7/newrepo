package applicationPages;

import basePages.Base_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Flights extends Base_page {
     WebDriver driver;

    public Flights(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    public By flight1 = By.xpath("//a[@id='booking_engine_flights']");
    public By SearchFlight = By.xpath("//input[@value='Search Flights']");
    public By departFrom = By.xpath("//input[@id='BE_flight_origin_city']");
    public By goingTo = By.xpath("//input[@id='BE_flight_arrival_city']");

    public By name_of_airpots = By.xpath("//div[@class='ac_results origin_ac']/ul/div/div/div/li/div[1]/p[2]");

    public By goingToList = By.xpath("//div[@class='ac_results dest_ac']/ul/div/div/div/li/div[1]/p[2]");

    public By departureDate = By.id("BE_flight_origin_date");

    public By date = By.xpath("//td[@id='02/03/2024']");

    public By searchAgain = By.xpath("//span[contains(text(),'Search Again')]");

   public void flighttab() throws InterruptedException {
       click(flight1);
       wait();
   }
    public void Book_one_way_ticket() throws InterruptedException {
        click(departFrom);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void book_a_ticket(String text2) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        String text = "new";
        String text1 = "Indira Gandhi International";
        click(departFrom);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(departFrom, text);
        int count_of_airpots = getEl(name_of_airpots).size();
        System.out.println("count of Airpots:-- " + count_of_airpots);

        for (WebElement element : getEl(name_of_airpots)) {
            if (element.getText().contains(text1)) {
                element.click();
                break;
            }
        }


        String text3 = "Kathmandu";
        String text4 = "Tribuvan";
        click(goingTo);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(goingTo, text3);
        int count_of_airpots1 = getEl(goingToList).size();
        System.out.println("count of Airpots:-- " + count_of_airpots1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        for (WebElement element : getEl(goingToList)) {
            if (element.getText().contains(text4)) {
                element.click();
                break;
            }
        }
    }

    public void Eneter_Departure_date() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        click(departureDate);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        click(date);

    }

    public void SearchFlight(){click(SearchFlight);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }


}
