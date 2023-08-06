import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelData 
{
@Test
public void writeExcelData() throws IOException 
{
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet sheet = wb.createSheet("WriteDataSheet");
	int noOfRows = 3;
	int noOfColumns = 3;
	String [][] myData = {{"One@","Two!","Three#"},{"Hi There;","How you've been?/","Your name>>"},{"123","4","$%^&"}};
	
	for(int i=0;i<noOfRows;i++)
	{
		XSSFRow row = sheet.createRow(i);
		for(int j=0;j<noOfColumns;j++)
		{
			XSSFCell cell = row.createCell(j);
			cell.setCellValue(myData[i][j]);
		}
	}
	FileOutputStream fos = new FileOutputStream("src\\test\\resources\\WriteExcelData.xlsx");
	wb.write(fos);
	wb.close();
}
}
