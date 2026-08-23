package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	XSSFWorkbook wb;

	public ExcelDataReader() {

		File src = new File("./TestData/TestData.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			System.out.println("Unable to load Xls file" + e.getMessage());
		}
	}
	//Row and column number starts from 0
	
	public String getStringData(int sheetIndex , int row , int column) {
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetName , int row , int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	
	public double getNumericData(String sheetName, int row , int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
}

