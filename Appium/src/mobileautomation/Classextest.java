package mobileautomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Classextest {

	public static String getCellData(int rowNum, int colNum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis= new FileInputStream("D://Book1.xls");
		Workbook wb= WorkbookFactory.create(fis);
		Cell c= wb.getSheet("sheet1").getRow(rowNum).getCell(colNum);
		String cellData = c.getStringCellValue();
		return cellData;
    }
	
	public static Object[][] getArray() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{

		FileInputStream fis= new FileInputStream("D://Book1.xls");
		Workbook wb= WorkbookFactory.create(fis);
		String tabArray[][]= null;
		int rowCount=wb.getSheet("sheet1").getLastRowNum();
		System.out.println(rowCount);
		int colCount = 2;
		tabArray= new String[rowCount][colCount];
		int ci=0;
		for(int i=0;i<=rowCount;i++,ci++)
		{
			int cj=0;
			for(int j=0;j<colCount; j++,cj++)
			{
				tabArray[ci][cj]= getCellData(i,j);
				System.out.println(tabArray[ci][cj]); 
			}
			
		}
		
		
		return tabArray;
	}



}
