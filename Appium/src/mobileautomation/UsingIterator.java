package mobileautomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingIterator {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
	
	{

		FileInputStream fis= new FileInputStream("D://Book1.xls");
		Workbook wb= WorkbookFactory.create(fis);
		String[][] tabArray2= null;
		
		Sheet sheet = wb.getSheet("sheet1");
		int rowCount=sheet.getLastRowNum()+1;
		int colCount=2;
		tabArray2= new String[rowCount][colCount];
		int cr=0;
		int cc;
		Iterator<Row> it= sheet.iterator();
 		
		while(it.hasNext())
		{
			Row rowobj = (Row) it.next();
			cc=0;
			Iterator<Cell> colit= rowobj.iterator();
			
			while(colit.hasNext())
			{
				Cell colobj = (Cell) colit.next();
				String str = colobj.getStringCellValue();
//				testDataList.add(str);
				tabArray2[cr][cc]= str;
				System.out.println(str);
				cc++;
			}
			cr++;
		}
	
	
//
//		for(int i = 0; i<rowCount; i++)
//		{
//			for(int j = 0; j<colCount; j++)
//			{
//				System.out.print(tabArray2[i][j]);
//			}
//			System.out.println();
//      }
	}

}
}