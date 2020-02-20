package facebook;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	static WebDriver driver;
	
	public static void browserlaunch(String value) {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.get(value);
}
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void click(WebElement ele) {
		ele.click();
       }
	public static String getdata(int row,int cell) throws IOException {
File f=new File("C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\Excel\\data.xlsx");
FileInputStream sf=new FileInputStream(f);
Workbook w=new XSSFWorkbook(sf);
Sheet s = w.getSheet("Sheet1");
Row r = s.getRow(row);
Cell c = r.getCell(cell);
String value=null;
int cellType = c.getCellType();
System.out.println("the cell type is :"+cellType);
if (cellType==1) {
	value = c.getStringCellValue();
}else if (cellType==0) {
	if (DateUtil.isCellDateFormatted(c)) {
		Date dateCellValue = c.getDateCellValue();
		System.out.println(dateCellValue);
		SimpleDateFormat sf1=new SimpleDateFormat("MM/dd/yyyy");
	value = sf1.format(dateCellValue);
	
	}else {
		double numericCellValue = c.getNumericCellValue();
		System.out.println(numericCellValue);
		long l=(long) numericCellValue;
		 value = String.valueOf(l);
	}
}
return value;

	}
	
	
	
	
}
