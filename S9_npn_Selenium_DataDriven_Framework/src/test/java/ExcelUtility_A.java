import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelUtility_A 
{
 public String[][] readData() throws IOException
 {
	FileInputStream fis = new FileInputStream("src\\test\\resources\\TestDataExample.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheet("MyTestData");
	int noOfRows = sheet.getPhysicalNumberOfRows();
	int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("The number of rows is:::"+noOfRows);
	System.out.println("The number of columns is:::"+noOfColumns);
	
	String [][] test= new String[noOfRows-1][noOfColumns];
	
	for(int i=1;i<noOfRows;i++)
	{
		XSSFRow row = sheet.getRow(i);
		for(int j=0;j<noOfColumns;j++)
		{
			XSSFCell cell = row.getCell(j);
			org.apache.poi.ss.usermodel.CellType cellTpe = cell.getCellType();
			String cellValue="";
			switch (cellTpe) {
			case NUMERIC:
				int value = (int)cell.getNumericCellValue();
				cellValue = String.valueOf(value);
				break;
				
			case STRING:
				cellValue = cell.getStringCellValue();
				break;

			default:
				break;
			}
			test[i-1][j] = cellValue;
		}
	}
	return test;
 }
}
