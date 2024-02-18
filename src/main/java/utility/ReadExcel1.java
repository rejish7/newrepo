//package utility;
//
//import org.apache.poi.ss.usermodel.*;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class ReadExcel1 {
//    public static void main(String[] args){
//        try {
//            FileInputStream fileInputStream = new FileInputStream();
//            Workbook workbook = WorkbookFactory.create(fileInputStream);
//            Sheet sheet = workbook.getSheetName();
//            for (Row row:sheet){
//                for (Cell cell:row){
//                    String cellvalue = cell.getStringCellValue();
//                    System.out.println(cellvalue +"/t");
//                }
//                System.out.println();
//            }
//            workbook.close();
//            fileInputStream.close();
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//
//        }
//
//    }
//}
