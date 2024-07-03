package dataprovider;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dataproviderusingexcel {
     String[][] data = null;
    @DataProvider(name="getexceldata")
    public Object[][] getdatausingexcel() throws IOException {

        File file = new File("C:\\Users\\venka\\Desktop\\Book1.xls");
        FileInputStream inputStream = new FileInputStream(file);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(inputStream);
        HSSFSheet sheet=hssfWorkbook.getSheetAt(0);
        int rows=sheet.getPhysicalNumberOfRows();
        int column=sheet.getRow(0).getPhysicalNumberOfCells();
         data= new String[rows-1][column] ;
         for(int i=1;i<rows;i++){

             for(int j=0;j<column;j++){
                 String celldata=sheet.getRow(i).getCell(j).getStringCellValue();
                 data[i-1][j]=celldata;
             }
         }
       return data;
    }
}
