package testCases;

import applicationPages.Villas;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testBase.Browser;

import java.io.File;
import java.io.IOException;

public class testvillas extends Browser {

    String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "dataSet.json";
    Villas villas;

    @Parameters({"browser","url"})
    @BeforeClass
    public void testSearchvillas(String browser,String url) throws IOException, ParseException {
//        String browser = new ReadJson().Read_the_value_from_json(path, "browser");
//        String url = new ReadJson().Read_the_value_from_json(path, "url");
//        String author= new ReadJson().Read_the_value_from_json(path, "author");
        openBrowser(browser, url);


    }


    @Test
    public void test() throws  InterruptedException {
        villas = new Villas(driver);
        villas.Villatab();
        villas.Hotelplace();
        villas.checkindate();
        villas.checkoutdate();
        villas.search_villas();

        closepage();
    }
}
