package LEARNING.Achievement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_ExcelFile {
	public void readExcelFile(String FilePath,String FileName,String sheetName) throws IOException {
		File file =    new File(FilePath+"\\"+FileName);
		FileInputStream fileipstream = new FileInputStream(file);
		Workbook gurunageshwarWorkbook = null;
		String FileextensionName = FileName.substring(FileName.indexOf("."));
		if(FileextensionName.equals(".xlsx")) {
			gurunageshwarWorkbook = new XSSFWorkbook(fileipstream);
		}
		else if(FileextensionName.contentEquals(".xls")) {
			gurunageshwarWorkbook = new HSSFWorkbook(fileipstream);	
		}
	
		
		Sheet gurusheet = gurunageshwarWorkbook.getSheet(sheetName);
		int rowcount = gurusheet.getLastRowNum()-gurusheet.getFirstRowNum();
		for(int i=0;i<rowcount+1;i++) {
			Row row = gurusheet.getRow(i); 
			
			for(int j =0;j<row.getLastCellNum();j++) {
				System.out.println(row.getCell(j).getStringCellValue()+"||");
				
			}
			System.out.println();
		}
	}

	
	
	public static void main(String args[]) throws IOException {
		Read_ExcelFile objExcelFile = new Read_ExcelFile();
		String FilePath = System.getProperty("user.dir")+"My Received Files";
		objExcelFile.readExcelFile("C:\\Users\\tt8\\Documents\\My Received Files", "4MONAA-Garren_TrafficRestrictRule.xlsx", "Sheet1");
	}
	
	
}
