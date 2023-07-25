package POM.ActiTIME.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCELLIBRARY_MAVEN implements AUTOCONSTANT_MAVEN
{
 public static String CELLVALUE(String sheet ,int row, int cell) throws IOException
 {
	 FileInputStream fis=new FileInputStream(excel_path);
	 XSSFWorkbook ws=new XSSFWorkbook(fis);
	 String cellvalue=ws.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	 return cellvalue;
 }
}
