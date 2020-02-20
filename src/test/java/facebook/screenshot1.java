package facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

                              //BASE CLASS
public class screenshot1 {
	static WebDriver driver;
	static TakesScreenshot tk;
	static File d,name1;
public static void browser(String value) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(value);
}	
public static void fill(String value) throws IOException {
	 tk=(TakesScreenshot)driver;
	   name1 = tk.getScreenshotAs(OutputType.FILE);
	   d=new File(value);
	   FileUtils.copyFile(name1, d);


}
}
