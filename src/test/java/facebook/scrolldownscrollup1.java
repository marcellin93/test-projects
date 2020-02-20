package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolldownscrollup1 {
                                         //BASE CLASS
static WebDriver driver;
static JavascriptExecutor js;
public static void browser(String value) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(value);
}	
public static void pagedown(WebElement b) {
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", b);
	}

public static void pageup(WebElement b) {
	js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)", b);

}

}
