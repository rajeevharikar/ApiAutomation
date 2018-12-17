package advancedselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritetoExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis= new FileInputStream("D://WriteExcel.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		for(int i=0;i<=4;i++){
		Row row=wb.getSheet("sheet1").createRow(i);
		for(int j=0;j<2;j++)
		{
		Cell cell=row.createCell(j);
		cell.setCellType(cell.CELL_TYPE_STRING);
		if(i==0 && j==0)
		{
		cell.setCellValue("Selenium");
		}
		else if(i==0 && j==1)
		{
			cell.setCellValue("java");
		}
		else if(i==1 && j==0)
		{
			cell.setCellValue("Selenium and Java");
		}
		else if(i==1 && j==1)
		{
			cell.setCellValue("Selenium Ruby");
		}
		else
		{
			cell.setCellValue("Rajeev Learning Selenium");
		}
		
		}
		FileOutputStream fout= new FileOutputStream("D://WriteExcel.xlsx");
		wb.write(fout);
		fout.close();
		
		}
		
	}

}
