package Launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetch1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Raghuveer\\eclipse-workspace\\BasicProgram_GroTechMinds\\Selenium+Basic_programs\\TestData\\Raghu.xlsx");
		//FileInputStream f1 = new FileInputStream(
			//	"M:\\Users\\Raghuveer\\eclipse-workspace\\BasicProgram_GroTechMinds\\Selenium+Basic_programs\\TestData\\Raghu.xlsx");//java.io.FileNotFoundException
		Workbook wb = WorkbookFactory.create(f1);
		String Username = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(Username);
		String Password = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Password);
		String Username_1 = wb.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		String Password_1 = wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		System.out.println(Username_1);
		System.out.println(Password_1);
		//String Username_2 = wb.getSheet("login").getRow(10).getCell(10).getStringCellValue();//java.lang.NullPointerException
		//System.out.println(Username_2);
		//String Mobile = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();//java.lang.IllegalStateException
		//System.out.println(Mobile);
		
		
	}

}
