package testCases;

import applicationPages.Flights;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.Browser;
import utility.ReadJson;

import java.io.File;
import java.io.IOException;

public class testFlight extends Browser {
    String path=System.getProperty("user.dir")+ File.separator +"TestData"+File.separator +"dataSet.json";
    Flights flight;

    //@Parameters({"browser","url"})
    @BeforeClass
    public void testSearchflight() throws IOException, ParseException {
        String browser = new ReadJson().Read_the_value_from_json(path, "browser");
        String url = new ReadJson().Read_the_value_from_json(path, "url");
        String author= new ReadJson().Read_the_value_from_json(path, "author");
        openBrowser(browser, url);

    }


    @Test
    public void test() throws IOException, ParseException, InterruptedException {
        flight = new Flights(driver);
        flight.flighttab();
        flight.depature_box();
        flight.arrive_box();
        flight.Depature_date();
        flight.Searchflight();

        closepage();
    }


}



