package TestPack;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class DataDrivenDemo {
    public static void main(String args[]) throws IOException {

        FileInputStream in = new FileInputStream("D:\\ImpS\\EET\\x.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(in);

        int shet = workbook.getNumberOfSheets();
        //System.out.println(shet);
        for (int i = 0; i < shet; i++) {

            if (workbook.getSheetName(i).equalsIgnoreCase("Type1")) {
                //  String name = workbook.getSheetAt(i);
                XSSFSheet sh = workbook.getSheetAt(i);
                Iterator<Row> rows = sh.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> cel = firstRow.cellIterator();
                int k = 0;
                int column = 0;
                while (cel.hasNext()) {
                    Cell ce = cel.next();
                    if (ce.getStringCellValue().equalsIgnoreCase("Data0")) {
                        column = k;
                    }
                    k++;
                }
               // System.out.println(column);
                while(rows.hasNext()){
                    Row r = rows.next();
                    if(r.getCell(column).getStringCellValue().equalsIgnoreCase("regression")){
                        Iterator<Cell> el = r.cellIterator();
                        while (el.hasNext()){
                            System.out.println(el.next().getStringCellValue());
                        }
                    }
                }
            }
        }
    }
}

