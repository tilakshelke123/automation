package page;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public void  ExcelReader () {
		
		
	String path = "testdata3.xlsx";

	try(
	FileInputStream fis = new FileInputStream(path);
	Workbook work = WorkbookFactory.create(fis))
	{

		Sheet sheet = work.getSheet("sheet1");

		int lastRow = sheet.getLastRowNum();

		for (int r = 1; r <= lastRow; r++) {

			Row row = sheet.getRow(r);
			if (row == null)
				continue;

			int lastCell = row.getLastCellNum();
			
			for (int c = 1; r <= lastCell; c++) {

					Cell cel = row.getCell(c);
					if (cel == null)
						continue;

			
		

			String value = cel.getStringCellValue();
			System.out.println(value + " | ");
		}
		}

	}catch(
	Exception e)
	{
		System.out.println(e.getMessage());
	}
	}

}
