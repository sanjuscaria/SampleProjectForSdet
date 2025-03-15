package codeTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWithIterator {
	
	public static void main(String[] args) throws IOException {
		
		String excelFilePath = System.getProperty("user.dir")+"\\files\\employees.xlsx";	
		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("one");
		
		Iterator<Row> itrRow = sheet.iterator();
		
		while(itrRow.hasNext())
		{
			Row row = itrRow.next();
			Iterator<Cell> itrCell = row.iterator();
			while(itrCell.hasNext())
			{
				Cell cell = itrCell.next();
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
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
