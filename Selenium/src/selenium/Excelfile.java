package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
	FileInputStream fis= new FileInputStream("D://Book1.xlsx");
	
	Workbook wb= WorkbookFactory.create(fis);
	
	int lastrownum = wb.getSheet("Sheet1").getLastRowNum();
	System.out.println(lastrownum);
	int count=0;
	for(int i=0;i<=lastrownum;i++)
	{
	int cellnum= wb.getSheet("Sheet1").getRow(i).getPhysicalNumberOfCells();
	
	if(count==0){
	System.out.println(cellnum);
	count++;
	}
	for(int j=0;j<=cellnum-1;j++)
	{
	Cell cell = wb.getSheet("Sheet1").getRow(i).getCell(j);
	String value = cell.getStringCellValue();
	System.out.print(value);
	

}
	System.out.println();
}
	}
}
