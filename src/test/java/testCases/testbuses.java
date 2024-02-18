package testCases;

import applicationPages.Buses;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testBase.Browser;

import java.io.IOException;

public  class testbuses extends Browser{
   // String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "dataSet.json";
    Buses buses;
    @Parameters({"browser","url","author"})
    @BeforeClass
    public void testSearchbuses(String browser,String url)  {
//       String browser = new ReadJson().Read_the_value_from_json(path, "browser");
//        String url = new ReadJson().Read_the_value_from_json(path, "url");
//        String author= new ReadJson().Read_the_value_from_json(path, "author");
        openBrowser(browser, url);
    }

   @Test
        public void test2() throws IOException, InterruptedException {
        buses = new Buses(driver);
        buses.busestab();
        buses.destiplace();
        buses.goingtoplace();
        buses.Depart_date();
        buses.Searchbuses();

     closepage();
    }


   }
