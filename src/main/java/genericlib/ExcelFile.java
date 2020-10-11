package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ExcelFile implements AutoConstant{
	public static String getexceldata(String sheetname,int rownum,int cellnum)
	{String s="";
		
		try {
			FileInputStream f=new FileInputStream(excelpath);
			Workbook wb = WorkbookFactory.create(f);
			s=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		} catch (Exception e) {
			Reporter.log("data is not taken from excel",true);
		}
		return s;
	
	}

}
