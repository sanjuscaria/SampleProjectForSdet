package testngTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class DataProviderTest {
	
	@Test(dataProvider = "excelData")
	public void dataProviderTest(String username, String password, String validity) throws IOException
	{
		Object[][] obj = getExcelData();
		
		System.out.println("user name ; "+username+" password : "+password+" validity : "+validity);
		
		
	}
	
	
	@DataProvider(name="excelData")
	public Object[][] getExcelData () throws IOException
	{
		String filePath  = "C:\\test\\Workspaces\\workspace-arora\\Selenium4Examples\\src\\test\\resources\\data.xlsx";
		
		FileInputStream fis = new FileInputStream(new File(filePath));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 
		 int rowCount = sheet.getPhysicalNumberOfRows();
		 int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		 
		// System.out.println("number of rows : "+rowCount+"  colCount : "+colCount);
		 
		 Object[][] data = new Object[rowCount-1][colCount];
		
		 for(int i = 1 ; i < rowCount ; i++)
		 {
			 for(int j = 0 ; j < colCount ; j++)
			 {
				 data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			 }
		 }
		
		
		return data;
	}
	
	
	
	
	

}
