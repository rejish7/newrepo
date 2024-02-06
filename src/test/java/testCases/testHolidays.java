package testCases;


import applicationPages.Holidays;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testBase.Browser;
import utility.ReadJson;

import java.io.File;
import java.io.IOException;

public class testHolidays extends Browser {
        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "dataSet.json";
        Holidays holiday ;

    @Parameters({"browser","url","author"})
    @BeforeClass
    public void testSearchbuses() throws IOException, ParseException {
        String browser = new ReadJson().Read_the_value_from_json(path, "browser");
        String url = new ReadJson().Read_the_value_from_json(path, "url");
        String author= new ReadJson().Read_the_value_from_json(path, "author");
        openBrowser(browser, url);

    }
        @Test
        public void test() throws  InterruptedException {
            holiday = new Holidays(driver);
            holiday.holidaytabs();
            holiday.holiday_depature();
            holiday.holiday_destination();
            holiday.search_holiday();

            driver.close();
        }
    }

