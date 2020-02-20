package mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldemo {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\Excel\\data.xlsx");
FileInputStream sf=new FileInputStream(f);
Workbook w=new XSSFWorkbook(sf);
Sheet s = w.getSheet("Sheet1");
Row r = s.getRow(2);
Cell c = r.getCell(0);
int cellType = c.getCellType();
System.out.println(cellType);
if (cellType==1) {
	String stringCellValue = c.getStringCellValue();
	System.out.println(stringCellValue);
	
}else if (cellType==0) {
	if (DateUtil.isCellDateFormatted(c)) {
		Date dateCellValue = c.getDateCellValue();
		System.out.println(dateCellValue);
		SimpleDateFormat sf1=new SimpleDateFormat("MM/dd/yyyy");
		String format = sf1.format(dateCellValue);
		System.out.println(format);
		
		
	}else {
		double numericCellValue = c.getNumericCellValue();
		System.out.println(numericCellValue);
		long l=(long)numericCellValue;
		String valueOf = String.valueOf(l);
		System.out.println(l);
		
	}}}}
