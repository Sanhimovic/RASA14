package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.support.PageFactory;

public class Generic_Excel 
{
	public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./excel/DataDriven.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Cell cel = book.getSheet(sheet).getRow(row).getCell(cell);
		String value = cel.getStringCellValue();
		return value;
	}
}
