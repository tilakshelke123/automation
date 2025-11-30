package com.dataReader;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.pojo.Pojo;

import model.User;

public class dataReader {

	public static List<Pojo> Reader() { // creating reder() method

		String path = "testdata2.xlsx"; // excel file in same project directory

		List<Pojo> users = new ArrayList<Pojo>(); // creating list where we can project/getting the data from excel and
													// store in this object
		// to useed this data anyware in the program i.e reusable of code

		try (FileInputStream fis = new FileInputStream(path); // to read the excel; file
				Workbook work = WorkbookFactory.create(fis)) { // excel is in form of workbook that loaded in java in
																// the form of object

			System.out.println(work.getClass()); // workbook type fille

			// below i ddidnt created any new sheet i have just access the sheet using
			// Workbook object
			Sheet s = work.getSheet("sheet1");
			// Sheet is interface

			// getting last row
			int lastRow = s.getLastRowNum(); // this by index

			for (int r = 1; r <= lastRow; r++) {
				Row row = s.getRow(r); // Row is also interface

				if (row == null)
					continue;

				int lastCol = row.getLastCellNum();// this by value

				for (int c = 0; c < lastCol; c++) { // it return count always not index 
					Cell cel = row.getCell(c); // Cell is also interface

					if (cel == null)
						continue;
					
					// cell  represent the object ref .  to pprint the cell value must be implemented  getStringCellValue () method ;
					String value = cel.getStringCellValue();		
					System.out.println(value );
					 
					
					Pojo p = new Pojo("salman ", "pratiksha");
					users.add(p);
				}
				System.out.println();
			}
			// write / update the data by write and by fileoutputstream
			work.write(new FileOutputStream(path));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;

		
	}
	//  my values are alrready in tthis string so i dont need  to write any type conersion method 
}
