package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

    public static Object[][] getLoginData() {

        String filePath = "TestData/LoginData.xlsx";

        try {

            FileInputStream file = new FileInputStream(filePath);

            Workbook workbook = new XSSFWorkbook(file);

            Sheet sheet = workbook.getSheetAt(0);

            int rows = sheet.getPhysicalNumberOfRows();
            int columns = sheet.getRow(0).getPhysicalNumberOfCells();

            Object[][] data = new Object[rows - 1][columns];

            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i < rows; i++) {

                Row row = sheet.getRow(i);

                for (int j = 0; j < columns; j++) {

                    data[i - 1][j] =
                            formatter.formatCellValue(row.getCell(j));
                }
            }

            workbook.close();
            file.close();

            return data;

        } catch (IOException e) {

            e.printStackTrace();

            return new Object[0][0];
        }
    }
}