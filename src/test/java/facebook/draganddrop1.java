package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop1 {
                                //BASE CLASS
	static WebDriver driver;
	static Actions a;
public static void browser(String value) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(value);
}	
public static void fill(WebElement source,WebElement target) {
	a=new Actions(driver);
	a.dragAndDrop(source, target).perform();

}

}
