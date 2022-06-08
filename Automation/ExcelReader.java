package maven_project.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\avina\\OneDrive\\Desktop\\workbook.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sh = wb.getSheet("case");
		@SuppressWarnings("unused")
		int Rollnumber = (int) sh.getRow(1).getCell(2).getNumericCellValue();
		System.out.println(Rollnumber);
		

	}

}
