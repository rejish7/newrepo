package testCases;


import applicationPages.Holidays;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testBase.Browser;

import java.io.IOException;

public class testHolidays extends Browser {

    //String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "dataSet.json";
    Holidays holiday;

    @Parameters({"browser","url"})
    @BeforeClass
    public void testSearchbuses(String browser,String url) throws IOException, ParseException {
//        browser = new ReadJson().Read_the_value_from_json(path, "browser");
//        url = new ReadJson().Read_the_value_from_json(path, "url");
//        String author = new ReadJson().Read_the_value_from_json(path, "author");
        openBrowser(browser, url);

    }

    @Test
    public void test() throws InterruptedException {
        holiday = new Holidays(driver);
        holiday.holidaytabs();
        holiday.holiday_depature();
        holiday.holiday_destination();
        holiday.search_holiday();


        closepage();
    }
}




