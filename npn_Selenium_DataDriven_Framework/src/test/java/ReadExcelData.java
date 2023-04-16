import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData 
{
	@Test
 public void readExcelData() throws IOException
 {
	 FileInputStream fis = new FileInputStream("src\\test\\resources\\One.xlsx");
	 XSSFWorkbook wb = new XSSFWorkbook(fis);
	 XSSFSheet sheet = wb.getSheet("MySheet");
	 
	 int noOfRows = sheet.getPhysicalNumberOfRows();
	 XSSFRow rows = sheet.getRow(0);
	 
	 int noOfColumns = rows.getPhysicalNumberOfCells();
	 XSSFCell cells = rows.getCell(0);
	 
	 System.out.println("The number of rows is:::"+noOfRows);
	 System.out.println("The number of columns is:::"+noOfColumns);
	 try {
	 for(int i=0;i<noOfRows;i++)
	 {
		 for(int j=0;j<noOfColumns;j++)
		 {
			 XSSFRow row = sheet.getRow(i);
			 XSSFCell cell = row.getCell(j);
			 System.out.print(cell.getStringCellValue()+"\t");
		 }
		 System.out.println("");
		 
	 } 
	 }
	 catch (NullPointerException e) {
		System.out.println("cell contains empty values");
	}
 }
}
