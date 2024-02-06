//package applicationPages;
//
//
//import basePages.Base_page;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//import java.time.Duration;
//
//public class Freight extends Base_page {
//    public Freight(WebDriver driver) {
//        super(driver);
//        this.driver = driver;
//    }
//
//
//
//    public By fdplace = By.xpath("//input[@id='autocomplete-origin']");
//    public By frightdepartlist = By.xpath("");
//
//    public By fplace2 = By.xpath("//input[@id='autocomplete-destination']");
//    public By freightGoinglist = By.xpath("");
//
//
//  //  public By frdate2 = By.xpath("//input[@id='readiness-datepicker']").send_keys("13-03-2024");
//    public By srcfreight = By.xpath("//button[@class='search-btn']");
//
//
//
//
//    public void freighttab1() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        WebElement element = driver.findElement(By.xpath("(//span[@class='more-arr'])[1]"));
//        Select select = new Select(element);
//        select.selectByVisibleText("Freight");
//    }
//
//
//    public void freightdestiplace() {
//        click(fdplace);
//        String text1 = "New Hanover Cty";
//        click(fdplace);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        send_keys(fdplace, text1);
//        for (WebElement element : getEl(freightdepartlist)) {
//            if (element.getText().contains(text1)) {
//                element.click();
//                break;
//
//            }
//        }
//    }
//
//    public void freightgoingtoplace() {
//        click(fplace2);
//        String text2 = "NCL:Newcastle";
//        click(fplace2);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        send_keys(fplace2, text2);
//        for (WebElement element : getEl(freightGoinglist)) {
//            if (element.getText().contains(text2)) {
//                element.click();
//                break;
//
//
//            }
//        }
//
//    }
//
////    public void Depart_date2() throws InterruptedException {
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
////        click(Freightdatetab);
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
////        click(Frdate2);
//
//    }
//
//    public void Searchfreight() {
//        click
//    }
//
//}
