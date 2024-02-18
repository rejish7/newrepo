//package utility;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.*;
//
//public class ReadExcel {
//    public static void main(String[] args) throws IOException {
//        File file = new File();
//        FileInputStream fileinputstream = new FileInputStream(file);
//        XSSFWorkbook workbook = new XSSFWorkbook(fileinputstream);
//        XSSFSheet sheet = workbook.getSheet("");
//
//        int rowCount = sheet.getLastRowNum();
//        System.out.println("total last row count ==" +rowCount);
//
//        for (int i=1;i<rowCount;i++){
//            int cellcount = sheet.getRow(i).getLastCellNum();
//            System.out.println("The total column =="+cellcount);
//
//            for (int j=0;j<=cellcount;j++){
//                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
//
//            }
//            System.out.println();
//        }
//    }
//}
