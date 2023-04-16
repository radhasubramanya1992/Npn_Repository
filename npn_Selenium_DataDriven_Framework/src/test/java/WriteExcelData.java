import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelData 
{
	XSSFWorkbook wb ;
	XSSFSheet sheet ;
	XSSFRow row ;
	XSSFCell cell;
	@Test
	public void writeTestData() throws IOException
	{
		String[][] myData = {{"One","Two","Three"},{"Four","Five?","six!"},{"Seven","eight","nine"}};
		int noOfRows = 3;
		int noOfColumns = 3;
		
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("MySheetWrite");
		for(int i=0;i<noOfRows;i++)
		{
			row = sheet.createRow(i);
			for(int j=0;j<noOfColumns;j++)
			{
				cell = row.createCell(j);
				cell.setCellValue(myData[i][j]);
			}
		}
		FileOutputStream fos = new FileOutputStream("src\\test\\resources\\WriteExcel.xlsx");
		wb.write(fos);
		wb.close();
		
	}


}
