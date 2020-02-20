package facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickdoubleclick1 {
    //BASE CLASS
static WebDriver driver;
static Actions a;
static Robot r;
public static void browser(String value) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(value);
}	
public static void fill(WebElement source) throws AWTException {
a=new Actions(driver);
a.doubleClick(source).contextClick().build().perform();
r=new Robot();
for (int i = 0; i <3; i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

}

}
