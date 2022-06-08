package maven_project.Automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReaderPractice {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:\\Users\\avina\\OneDrive\\Desktop\\wb.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Text");
	String data=sh.getRow(1).getCell(2).getStringCellValue();
	System.out.println(data);
		
		
		
	}

}

