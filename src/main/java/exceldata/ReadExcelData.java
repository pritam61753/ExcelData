package exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	
	@Test
	public void dataReadTest() throws Exception {
		
		File src = new File("C:\\Users\\win8\\eclipse-workspace\\excel_data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		// for .xls files
		
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		String entry1= sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("The data in the box is " + entry1);
		
		xsf.close();
		
		
	}
	
	

}
