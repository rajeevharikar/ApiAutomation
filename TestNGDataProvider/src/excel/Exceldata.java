package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata {
	
	public static String getCellData(int rowNum, int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis= new FileInputStream("D://new Excel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Cell c= wb.getSheet("sheet1").getRow(rowNum).getCell(colNum);
		String cellData = c.getStringCellValue();
		return cellData;
    }
	
	public static Object[][] getArray() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{

		FileInputStream fis= new FileInputStream("D://Book1.xls");
		Workbook wb= WorkbookFactory.create(fis);
		String[][] tabArray2= null;
		
		Sheet sheet = wb.getSheet("sheet1");
		int rowCount=sheet.getLastRowNum()+1;
		int colCount=sheet.getRow(1).getPhysicalNumberOfCells();
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
				tabArray2[cr][cc]= str;
				System.out.println(str);
				cc++;
			}
			cr++;
		}
		return tabArray2;
	}
	

}
