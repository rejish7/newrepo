package testCases;


import applicationPages.Hotels;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testBase.Browser;
import utility.ReadJson;

import java.io.File;
import java.io.IOException;

public class testHotels extends Browser {
    String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "dataSet.json";
    Hotels hotel ;

    @Parameters({"browser","url"})
    @BeforeClass
    public void testSearchhotels() throws IOException, ParseException {
        String browser = new ReadJson().Read_the_value_from_json(path, "browser");
        String url = new ReadJson().Read_the_value_from_json(path, "url");
        String author= new ReadJson().Read_the_value_from_json(path, "author");
        openBrowser(browser, url);


    }
    @Test
    public void test() throws  InterruptedException {
        hotel = new Hotels(driver);
        hotel.hoteltab();
        hotel.destinationplace();
        hotel.checkindate();
        hotel.checkoutdate();
        hotel.search_hotel();

        closepage();
    }
}
