package reusablecode;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static String readExcel(String sheetName, int rowNum, int colNum) throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/testdata/LoginData.xlsx"));
        XSSFWorkbook book = new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheet(sheetName);
        String data = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        return data;

    }
}
