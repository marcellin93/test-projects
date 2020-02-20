package mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
static WebDriver driver;
public static void browserlaunch(String value) {
	try{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Marcellin\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(value);
System.out.println("browser launched");
}catch(Exception e) {
	e.getMessage();
	System.out.println("browser not launch");
}
	
}
public static void user(WebElement ele,String txtvalue) {
	ele.sendKeys(txtvalue);
}
public static void pass(WebElement ele,String passvalue) {
	ele.sendKeys(passvalue);
}
public static void click(WebElement ele) {
	ele.click();

}
	
	
	
	

}
