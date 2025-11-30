package reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import model.User;

public class ExcelReader {

	public static List<User> readLoginUsers() {
        String path = "testdata.xlsx";
        List<User> users = new ArrayList<User>();
        
        try (FileInputStream fis = new FileInputStream(path);
             Workbook workbook = WorkbookFactory.create(fis)) {

        	System.out.println(workbook.getClass());
            Sheet sheet = workbook.getSheetAt(0); // or getSheetAt(0)

            int lastRow = sheet.getLastRowNum(); // 0-based

            for (int r = 2; r <= lastRow; r++) {
                Row row = sheet.getRow(r);
                if (row == null) continue;

                int lastCol = row.getLastCellNum(); // 1-based
                
               
                for (int c = 0; c < lastCol; c++) {
                    Cell cell = row.getCell(c, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                    String value = getCellValueAsString(cell);
                    System.out.print(value + " | ");
                  
                    User user = new User(" ", " ");
                    users.add(user);
                }
                System.out.println();
            }
          workbook.write(new FileOutputStream(path));  
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return users;
    }
	
	private static String getCellValueAsString(Cell cell) {
        if (cell == null) return "";

        return switch (cell.getCellType()) {
            case STRING  -> cell.getStringCellValue();
            case NUMERIC -> DateUtil.isCellDateFormatted(cell)
                    ? cell.getDateCellValue().toString()
                    : String.valueOf(cell.getNumericCellValue());
            case BOOLEAN -> String.valueOf(cell.getBooleanCellValue());
            case FORMULA -> cell.getCellFormula();
            case BLANK   -> "";
            default      -> "";
        };
    }
}
