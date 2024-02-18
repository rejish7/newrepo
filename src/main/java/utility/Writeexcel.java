//package utility;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class Writeexcel {
//    public static void main(String[] args) throws IOException {
//        File file = new File();
//        FileInputStream fileinputstream = new FileInputStream(file);
//        XSSFWorkbook workbook = new XSSFWorkbook(fileinputstream);
//        XSSFSheet sheet = workbook.getSheet("");
//
//        for (int i=1;i<sheet.getLastRowNum();i++){
//            Row row = sheet.getRow(i);
//            Cell cell = row.createCell();
//            cell.setCellValue();
//        }
//        FileOutputStream fileOutputStream = new FileOutputStream();
//        workbook.write(fileOutputStream);
//        fileOutputStream.close();
//        }
//}
