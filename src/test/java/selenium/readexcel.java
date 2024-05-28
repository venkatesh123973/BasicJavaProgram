package selenium;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readexcel {


    public static void main(String[] args) throws IOException {

        String excel= "C:\\Users\\venka\\Desktop\\Book1.xls";

        FileInputStream inputstream = new FileInputStream(excel);

        HSSFWorkbook work = new HSSFWorkbook(inputstream);
        HSSFSheet sheet=work.getSheetAt(0);
        int rows=sheet.getLastRowNum();
        int columns=sheet.getRow(1).getLastCellNum();
        System.out.println(rows);
        System.out.println(columns);
        for(int i=0;i<rows;i++){

            HSSFRow row=sheet.getRow(i);

            for(int j=0;j<columns;j++){
               HSSFCell cell= row.getCell(j);

               switch (cell.getCellType()){
                   case STRING:
                       System.out.println(cell.getStringCellValue());
                       break;

                   case NUMERIC:
                       System.out.println(cell.getNumericCellValue());
                       break;

                   case BOOLEAN:
                       System.out.println(cell.getBooleanCellValue());
                       break;
               }
            }
            System.out.println();
        }
    }
}
