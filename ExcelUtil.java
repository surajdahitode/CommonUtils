package Commonutils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public String getDataFromExcelFile(String Sheetname,int Rownum,int Cellnum) throws EncryptedDocumentException, IOException {
	
		//To read the date from Excel file 
		
				//Step1: Create the object of file InputStream class
				FileInputStream fis  = new FileInputStream("src\\test\\resources\\Dataorganziation.xlsx");
				
				//Step2:  workBookFactory it is claas in prsent apachePoi factory  call Create(inputstream)
			    Workbook wb = WorkbookFactory .create(fis);
			    
			    //Step3: call getSheet(String name)
				   Sheet sh = wb.getSheet(Sheetname);
				   
				   //Step4: call getRow(int rownum)
				   Row rw = sh.getRow(Rownum);
				   
				   //Step: Call getCell(int cellnum)
				   Cell cl = rw .getCell(Cellnum);
				   
				   //Step: Call method called getStringcellValue()
				    String value = cl.getStringCellValue();
				    
				    return value;

	}

}
