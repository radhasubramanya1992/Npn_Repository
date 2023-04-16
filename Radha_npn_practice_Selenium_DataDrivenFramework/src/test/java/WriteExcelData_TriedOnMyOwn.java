import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelData_TriedOnMyOwn 
{
	@Test
public void writeExcelExample() throws IOException
{
	FileOutputStream fos = new FileOutputStream("src\\test\\resources\\WriteExcel.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook();
	
	XSSFSheet sheet = wb.createSheet("MySheetWrite");
	System.out.println("Sheet created!!");
	XSSFRow row1 = sheet.createRow(0);
	XSSFRow row2 = sheet.createRow(1);
	
	XSSFCell cell00 = row1.createCell(0);
	cell00.setCellValue("Had your breakfast?");
	
	XSSFCell cell01 = row1.createCell(1);
	cell01.setCellValue("Had your lunch?");
	
	XSSFCell cell10 = row2.createCell(0);
	cell10.setCellValue("Had your snack?");
	
	XSSFCell cell11 = row2.createCell(1);
	cell11.setCellValue("Had your dinner?");
	
	wb.write(fos);
	wb.close();
	System.out.println("The file was created!!");
}
}
