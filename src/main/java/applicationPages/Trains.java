package applicationPages;

import basePages.Base_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Trains extends Base_page {
    public Trains(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


 
    public By traindplace = By.xpath("//input[@id='BE_train_from_station']");
    public By traindepartlist = By.xpath("//div[@class='ac_results origin_ac']");

    public By trainplace2 = By.xpath("//input[@id='BE_train_to_station']");
    public By trainGoinglist = By.xpath("//div[@class='ac_results dest_ac']");

    public By traindatetab = By.xpath("//input[@id='BE_train_depart_date']");
    public By trdate2 = By.xpath("//td[@id='02/02/2024']");
    public By srctrain = By.xpath("//input[@id='BE_train_search_btn']");


   

    public void Traintab1() {
 //       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        WebElement element = driver.findElement(By.xpath("//div[@class='moreOption']//ul"));
//        Select select = new Select(element);
//        select.selectByVisibleText("Trains");
        WebElement more = driver.findElement(By.xpath("//div[@class='moreOption']//ul"));
        WebElement train= driver.findElement(By.xpath("//a[@id='booking_engine_trains']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        actions.click(more).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        train.click();
    }


    public void traindestiplace() {
        click(traindplace);
        String text1 = "New Delhi";
        click(traindplace);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(traindplace, text1);
        for (WebElement element : getEl(traindepartlist)) {
            if (element.getText().contains(text1)) {
                element.click();
                break;

            }
        }
    }

    public void traingoingtoplace() {
        click(trainplace2);
        String text2 = "Mumbai";
        click(trainplace2);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        send_keys(trainplace2, text2);
        for (WebElement element : getEl(trainGoinglist)) {
            if (element.getText().contains(text2)) {
                element.click();
                break;


            }
        }

    }

    public void Depart_date() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(traindatetab);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        click(trdate2);

    }

    public void Searchtrains() {
        click(srctrain);
    }
}

