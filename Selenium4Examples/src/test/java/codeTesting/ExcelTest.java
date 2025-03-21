package codeTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;


public class ExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String excelFilePath = System.getProperty("user.dir")+"\\files\\employees.xlsx";	
		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("one");
		
		int rows = sheet.getLastRowNum();
		short cols = sheet.getRow(0).getLastCellNum();		
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow row = sheet.getRow(r);
			
			for (int c = 0; c <cols; c++) {
				XSSFCell cell = row.getCell(c);				
				CellType celltype = cell.getCellType();
				
				switch(celltype) {
				case STRING : System.out.print(cell.getStringCellValue());
				break;
				case NUMERIC : System.out.print(cell.getNumericCellValue());
				break;
				case BOOLEAN : System.out.print(cell.getBooleanCellValue());
				break;
				
				}				
			}		
			
		}	

	}

}
