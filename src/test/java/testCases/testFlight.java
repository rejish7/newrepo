package testCases;

import applicationPages.Flights;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testBase.Browser;
import utility.ReadJson;

import java.io.File;
import java.io.IOException;

public class testFlight extends Browser {
    String path=System.getProperty("user.dir")+ File.separator +"TestData"+File.separator +"dataSet.json";
    Flights flights;

    @Parameters({"browser","url"})
    public void testSearchbuses(String browser,String url) throws IOException, ParseException {
//        String browser = new ReadJson().Read_the_value_from_json(path, "browser");
//        String url = new ReadJson().Read_the_value_from_json(path, "url");
//        String author= new ReadJson().Read_the_value_from_json(path, "author");
        String airpott = new ReadJson().Read_the_value_from_json(path,"airpott");
        openBrowser(browser, url);

    }


    @Test
    public void test() throws IOException, ParseException, InterruptedException {
        String tt = new ReadJson().Read_the_value_from_json(path,"airpott");
        System.out.println(tt);
        flights = new Flights(driver);
        flights.flighttab();
        flights.Book_one_way_ticket();
        flights.book_a_ticket(new ReadJson().Read_the_value_from_json(path,"text"));
        flights.Eneter_Departure_date();
        flights.SearchFlight();

        closepage();
    }


}



