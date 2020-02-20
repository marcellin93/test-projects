package facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class new1 {
static WebDriver driver;
public static void browserlaunch(String value) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(value);
System.out.println("Browser launch succesfully");
}
public static void fill(WebElement a,String value) {
	a.sendKeys(value);
}
public static void click(WebElement a) {
	a.click();
}
public static void quitbrowser() {
	driver.close();
}
public static String getdata(int row,int cell) throws IOException {
File f=new File("C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\Excel\\data.xlsx");
FileInputStream sf=new FileInputStream(f);
Workbook w=new XSSFWorkbook(sf);
Sheet s = w.getSheet("Sheet1");
 Cell c = s.getRow(row).getCell(cell);
String value=null;
int cellType = c.getCellType();
System.out.println("your cell type is :"+cellType);
if (cellType==1) {
	value = c.getStringCellValue();
}
else {
	double numericCellValue = c.getNumericCellValue();
	long l=(long) numericCellValue;
	value = String.valueOf(l);
}
return value;
}}
