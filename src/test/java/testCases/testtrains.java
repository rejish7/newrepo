package testCases;

import applicationPages.Trains;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testBase.Browser;

import java.io.File;
import java.io.IOException;

public class testtrains extends Browser {
    String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "dataSet.json";
    Trains trains;

    @Parameters({"browser","url","author"})
    @BeforeClass
    public void testSearchtrains(String browser,String url) throws IOException, ParseException {
//        String browser = new ReadJson().Read_the_value_from_json(path, "browser");
//        String url = new ReadJson().Read_the_value_from_json(path, "url");
//        String author= new ReadJson().Read_the_value_from_json(path, "author");
        openBrowser(browser, url);


    }


    @Test
    public void test() throws IOException, ParseException, InterruptedException {
        trains = new Trains(driver);
        trains.Traintab1();
        trains.traindestiplace();
        trains.traingoingtoplace();
        trains.Depart_date();
        trains.Searchtrains();


      closepage();

    }
}
