//package testCases;
//
//import applicationPages.Freight;
//import org.json.simple.parser.ParseException;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import testBase.Browser;
//import utility.ReadJson;
//
//import java.io.File;
//import java.io.IOException;
//public class testfreight extends Browser {
//
//    String path=System.getProperty("user.dir")+ File.separator +"TestData"+File.separator +"dataSet.json";
//
//    Freight freight;
//
//    @BeforeClass
//    public void testSearchfreight() throws IOException, ParseException {
//        String browserName = new ReadJson().Read_the_value_from_json(path,"Browser");
//        String url = new ReadJson().Read_the_value_from_json(path,"URL");
//        openBrowser(browserName,url);
//
//    }
//
//
//    @Test
//    public void test() throws  InterruptedException {
//        freight = new Freight(driver);
//        freight.freighttab1();
//        freight.freightdestiplace();
//        freight.freightgoingtoplace();
//        freight.Depart_date2();
//        freight.Searchfreight();
//    }
//}
//
